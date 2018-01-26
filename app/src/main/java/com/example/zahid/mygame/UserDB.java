package com.example.zahid.mygame;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by zahid on 1/26/2018.
 */

public class UserDB {
    public static final String KEY_ROWID="_id";
    public static final String KEY_NAME="person_name";
    public static final String KEY_CELL="_cell";

    public static final String KEY_PASSWORD="_pass";

    private final String DATABASE_NAME="UserDB";
    private final String DATABASE_TABLE="UserTable";
    private final int DATABASE_VERSION=1;

    private DBHelper ourHelper;
    private final Context ourContext;
    private SQLiteDatabase ourDatabase;

    UserDB(Context con){
        ourContext=con;
    }
    private class DBHelper extends SQLiteOpenHelper
    {
        public DBHelper(Context con)
        {
            super(con,DATABASE_NAME,null,DATABASE_VERSION);

        }
        //RUNS WHEN YOU CHANGE DATABASE VERSION
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
            onCreate(db);
        }
        //only call when there exit no database
        @Override
        public void onCreate(SQLiteDatabase db)
        {
            String sqlCode="CREATE TABLE " + DATABASE_TABLE + " (" +
                    KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    KEY_NAME + " TEXT NOT NULL, " +
                    KEY_PASSWORD + " TEXT NOT NULL, " +
                    KEY_CELL + " TEXT NOT NULL);";
            db.execSQL(sqlCode);
        }
    }
    public UserDB open()throws SQLException
    {
        ourHelper=new DBHelper(ourContext);
        ourDatabase=ourHelper.getWritableDatabase();
        return this;
    }
    public void close()
    {
        ourHelper.close();
    }
    public long createEntry(String name,String pass,String cell)
    {
        ContentValues cv=new ContentValues();
        cv.put(KEY_NAME,name);//first one is column name and second is pass and third is cell
        cv.put(KEY_PASSWORD,pass);
        cv.put(KEY_CELL,cell);
        return ourDatabase.insert(DATABASE_TABLE,null,cv);
    }
    public String getData()
    {
        String []columns=new String[]{KEY_ROWID,KEY_NAME,KEY_PASSWORD,KEY_CELL};
        Cursor c=ourDatabase.query(DATABASE_TABLE,columns,null,null,null,null,null);
        String result="";
        int iRowID=c.getColumnIndex(KEY_ROWID);
        int iName=c.getColumnIndex(KEY_NAME);
        int iPass=c.getColumnIndex(KEY_PASSWORD);
        int iCell=c.getColumnIndex(KEY_CELL);
        for(c.moveToFirst();!c.isAfterLast();c.moveToNext())
        {
            result=result + c.getString(iRowID) + ": " + c.getString(iName) + " " + c.getString(iPass) +
                    c.getString(iCell) + "\n";
        }
        c.close();
        return  result;
    }
    public int redirectToGame(String name,String pass)
    {
        /*return ourDatabase.query(DATABASE_TABLE,new String[]{KEY_ROWID,KEY_NAME,KEY_PASSWORD,}, KEY_NAME + "=? AND " + KEY_PASSWORD + "=?"
                ,new String[]{name,pass},null,null,null,null);*/
        String[] args=new String[]{name,pass};
        try
        {
            int i=0;
            Cursor c=null;
            c = ourDatabase.rawQuery("select * from UserTable where person_name =" + "\""+ name.trim() + "\""+" and _pass="+ "\""+ pass.trim() + "\""+"", null);
            c.moveToFirst();
            i=c.getCount();
            c.close();
            return i;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return 0;
    }
}
