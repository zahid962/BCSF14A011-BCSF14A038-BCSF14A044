package com.example.zahid.mygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayGame extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine;

    TextView dialog;
    boolean p1=true;
    int draw=0;
    int countForDraw=0;
    boolean p2=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=(Button) findViewById(R.id.one);
        two=(Button) findViewById(R.id.two);
        three=(Button) findViewById(R.id.three);
        four=(Button) findViewById(R.id.four);
        five=(Button) findViewById(R.id.five);
        six=(Button) findViewById(R.id.six);
        seven=(Button) findViewById(R.id.seven);
        eight=(Button) findViewById(R.id.eight);
        nine=(Button) findViewById(R.id.nine);

        dialog=(TextView) findViewById(R.id.dialogue);

        one.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view)
                                   {
                                       countForDraw++;
                                       if (p1==true)
                                       {
                                           one.setText("1");
                                           String a=one.getText().toString();
                                           String b=two.getText().toString();

                                           String c=three.getText().toString();
                                           String d=four.getText().toString();

                                           String e=five.getText().toString();
                                           String f=seven.getText().toString();

                                           String g=nine.getText().toString();

                                           if(a==b && a==c)
                                           {
                                               draw=1;
                                               dialog.setText("Player 1 Won!");
                                               reLaunch();
                                           }
                                           else if(a==d && a==e)
                                           {
                                               draw=1;
                                               dialog.setText("Player 1 Won!");
                                               reLaunch();
                                           }
                                           else if(a==e && a==g)
                                           {
                                               draw=1;
                                               dialog.setText("Player 1 Won!");
                                               reLaunch();
                                           }



                                           p2=true;
                                           p1=false;
                                       }
                                       else if(p2==true)
                                       {
                                           one.setText("0");

                                           String a=one.getText().toString();
                                           String b=two.getText().toString();

                                           String c=three.getText().toString();
                                           String d=four.getText().toString();

                                           String e=five.getText().toString();
                                           String f=seven.getText().toString();

                                           String g=nine.getText().toString();

                                           if(a==b && a==c)
                                           {
                                               draw=1;
                                               dialog.setText("Player 2 Won!");
                                               reLaunch();
                                           }
                                           else if(a==d && a==e)
                                           {
                                               draw=1;
                                               dialog.setText("Player 2 Won!");
                                               reLaunch();
                                           }
                                           else if(a==e && a==g)
                                           {
                                               draw=1;
                                               dialog.setText("Player 2 Won!");
                                               reLaunch();
                                           }
                                           p2=false;
                                           p1=true;
                                       }
                                   }
                               }
        );

        two.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view)
                                   {
                                       countForDraw++;

                                       if (p1==true)
                                       {
                                           two.setText("1");

                                           String a=one.getText().toString();
                                           String b=two.getText().toString();

                                           String c=three.getText().toString();

                                           String e=five.getText().toString();

                                           String g=eight.getText().toString();

                                           if(a==b && a==c)
                                           {
                                               dialog.setText("Player 1 Won!");
                                               draw=1;
                                               reLaunch();
                                           }
                                           else if(b==e && b==g)
                                           {
                                               draw=1;
                                               dialog.setText("Player 1 Won!");
                                               reLaunch();
                                           }

                                           p2=true;
                                           p1=false;
                                       }
                                       else if(p2==true)
                                       {
                                           two.setText("0");
                                           String a=one.getText().toString();
                                           String b=two.getText().toString();

                                           String c=three.getText().toString();

                                           String e=five.getText().toString();

                                           String g=eight.getText().toString();

                                           if(a==b && a==c)
                                           {
                                               draw=1;
                                               dialog.setText("Player 2 Won!");
                                               reLaunch();
                                           }
                                           else if(b==e && b==g)
                                           {
                                               draw=1;
                                               dialog.setText("Player 2 Won!");
                                               reLaunch();
                                           }
                                           p2=false;
                                           p1=true;
                                       }


                                   }
                               }
        );

        three.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view)
                                     {
                                         countForDraw++;

                                         if (p1==true)
                                         {
                                             three.setText("1");
                                             String a=one.getText().toString();
                                             String b=two.getText().toString();

                                             String c=three.getText().toString();

                                             String d=five.getText().toString();

                                             String e=six.getText().toString();
                                             String f=seven.getText().toString();

                                             String g=nine.getText().toString();

                                             if(a==b && a==c)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 1 Won!");
                                                 reLaunch();

                                             }
                                             else if(c==e && c==g)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 1 Won!");
                                                 reLaunch();
                                             }
                                             else if(c==d && c==f)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 1 Won!");
                                                 reLaunch();
                                             }

                                             p2=true;
                                             p1=false;
                                         }
                                         else if(p2==true)
                                         {
                                             three.setText("0");
                                             String a=one.getText().toString();
                                             String b=two.getText().toString();

                                             String c=three.getText().toString();

                                             String d=five.getText().toString();

                                             String e=six.getText().toString();
                                             String f=seven.getText().toString();

                                             String g=nine.getText().toString();

                                             if(a==b && a==c)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 2 Won!");
                                                 reLaunch();

                                             }
                                             else if(c==e && c==g)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 2 Won!");
                                                 reLaunch();
                                             }
                                             else if(c==d && c==f)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 2 Won!");
                                                 reLaunch();
                                             }
                                             p2=false;
                                             p1=true;
                                         }


                                     }
                                 }
        );
        four.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view)
                                    {
                                        countForDraw++;

                                        if (p1==true)
                                        {
                                            four.setText("1");
                                            String a=one.getText().toString();
                                            String b=four.getText().toString();

                                            String c=five.getText().toString();

                                            String d=six.getText().toString();

                                            String e=seven.getText().toString();
                                            if(a==b && a==e)
                                            {
                                                draw=1;
                                                dialog.setText("Player 1 Won!");
                                                reLaunch();

                                            }
                                            else if(b==c && b==d)
                                            {
                                                draw=1;
                                                dialog.setText("Player 1 Won!");
                                                reLaunch();

                                            }
                                            p2=true;
                                            p1=false;
                                        }
                                        else if(p2==true)
                                        {
                                            four.setText("0");
                                            String a=one.getText().toString();
                                            String b=four.getText().toString();

                                            String c=five.getText().toString();

                                            String d=six.getText().toString();

                                            String e=seven.getText().toString();
                                            if(a==b && a==e)
                                            {
                                                draw=1;
                                                dialog.setText("Player 2 Won!");
                                                reLaunch();

                                            }
                                            else if(b==c && b==d)
                                            {
                                                draw=1;
                                                dialog.setText("Player 2 Won!");
                                                reLaunch();

                                            }
                                            p2=false;
                                            p1=true;
                                        }


                                    }
                                }
        );

        five.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view)
                                    {
                                        countForDraw++;

                                        if (p1==true)
                                        {
                                            five.setText("1");
                                            String a=one.getText().toString();
                                            String b=two.getText().toString();

                                            String c=three.getText().toString();

                                            String d=four.getText().toString();

                                            String e=five.getText().toString();
                                            String f=six.getText().toString();
                                            String g=seven.getText().toString();

                                            String h=eight.getText().toString();

                                            String i=nine.getText().toString();
                                            if(b==e && b==h)
                                            {
                                                draw=1;
                                                dialog.setText("Player 1 Won!");
                                                reLaunch();
                                            }
                                            else if(d==e && d==f)
                                            {
                                                draw=1;
                                                dialog.setText("Player 1 Won!");
                                                reLaunch();
                                            }
                                            else if(a==e && a==i)
                                            {
                                                draw=1;
                                                dialog.setText("Player 1 Won!");
                                                reLaunch();
                                            }
                                            else if(c==e && c==g)
                                            {
                                                draw=1;
                                                dialog.setText("Player 1 Won!");
                                                reLaunch();
                                            }


                                            p2=true;
                                            p1=false;
                                        }
                                        else if(p2==true)
                                        {
                                            five.setText("0");
                                            String a=one.getText().toString();
                                            String b=two.getText().toString();

                                            String c=three.getText().toString();

                                            String d=four.getText().toString();

                                            String e=five.getText().toString();
                                            String f=six.getText().toString();
                                            String g=seven.getText().toString();

                                            String h=eight.getText().toString();

                                            String i=nine.getText().toString();
                                            if(b==e && b==h)
                                            {
                                                draw=1;
                                                dialog.setText("Player 2 Won!");
                                                reLaunch();
                                            }
                                            else if(d==e && d==f)
                                            {
                                                draw=1;
                                                dialog.setText("Player 2 Won!");
                                                reLaunch();
                                            }
                                            else if(a==e && a==i)
                                            {
                                                draw=1;
                                                dialog.setText("Player 2 Won!");
                                                reLaunch();
                                            }
                                            else if(c==e && c==g)
                                            {
                                                draw=1;
                                                dialog.setText("Player 2 Won!");
                                                reLaunch();
                                            }
                                            p2=false;
                                            p1=true;
                                        }


                                    }
                                }
        );

        six.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view)
                                   {
                                       countForDraw++;

                                       if (p1==true)
                                       {
                                           six.setText("1");
                                           String a=three.getText().toString();
                                           String b=four.getText().toString();

                                           String c=five.getText().toString();

                                           String d=six.getText().toString();

                                           String e=nine.getText().toString();
                                           if(a==d && a==e)
                                           {
                                               draw=1;
                                               dialog.setText("Player 1 Won!");
                                               reLaunch();
                                           }
                                           else if(b==c && b==d)
                                           {
                                               draw=1;
                                               dialog.setText("Player 1 Won!");
                                               reLaunch();
                                           }
                                           p2=true;
                                           p1=false;
                                       }
                                       else if(p2==true)
                                       {
                                           six.setText("0");

                                           String a=three.getText().toString();
                                           String b=four.getText().toString();

                                           String c=five.getText().toString();

                                           String d=six.getText().toString();

                                           String e=nine.getText().toString();
                                           if(a==d && a==e)
                                           {
                                               draw=1;
                                               dialog.setText("Player 2 Won!");
                                               reLaunch();
                                           }
                                           else if(b==c && b==d)
                                           {
                                               draw=1;
                                               dialog.setText("Player 2 Won!");
                                               reLaunch();
                                           }
                                           p2=false;
                                           p1=true;
                                       }


                                   }
                               }
        );

        seven.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view)
                                     {
                                         countForDraw++;

                                         if (p1==true)
                                         {
                                             seven.setText("1");
                                             String a=one.getText().toString();
                                             String b=three.getText().toString();

                                             String c=four.getText().toString();

                                             String d=five.getText().toString();

                                             String e=seven.getText().toString();

                                             String f=eight.getText().toString();

                                             String g=nine.getText().toString();
                                             if(a==c && a==e)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 1 Won!");
                                                 reLaunch();
                                             }
                                             else if(e==f && e==g)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 1 Won!");
                                                 reLaunch();
                                             }
                                             else if(b==d && b==e)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 1 Won!");
                                                 reLaunch();
                                             }
                                             p2=true;
                                             p1=false;
                                         }
                                         else if(p2==true)
                                         {
                                             seven.setText("0");

                                             String a=one.getText().toString();
                                             String b=three.getText().toString();

                                             String c=four.getText().toString();

                                             String d=five.getText().toString();

                                             String e=seven.getText().toString();

                                             String f=eight.getText().toString();

                                             String g=nine.getText().toString();
                                             if(a==c && a==e)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 2 Won!");
                                                 reLaunch();
                                             }
                                             else if(e==f && e==g)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 2 Won!");
                                                 reLaunch();
                                             }
                                             else if(b==d && b==e)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 2 Won!");
                                                 reLaunch();
                                             }
                                             p2=false;
                                             p1=true;
                                         }


                                     }
                                 }
        );

        eight.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view)
                                     {
                                         countForDraw++;

                                         if (p1==true)
                                         {
                                             eight.setText("1");
                                             String a=two.getText().toString();
                                             String b=five.getText().toString();

                                             String c=seven.getText().toString();

                                             String d=eight.getText().toString();

                                             String e=nine.getText().toString();
                                             if(c==d && c==e)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 1 Won!");
                                                 reLaunch();
                                             }
                                             else if(a==b && a==d)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 1 Won!");
                                                 reLaunch();
                                             }
                                             p2=true;
                                             p1=false;
                                         }
                                         else if(p2==true)
                                         {
                                             eight.setText("0");

                                             String a=two.getText().toString();
                                             String b=five.getText().toString();

                                             String c=seven.getText().toString();

                                             String d=eight.getText().toString();

                                             String e=nine.getText().toString();
                                             if(c==d && c==e)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 2 Won!");
                                                 reLaunch();
                                             }
                                             else if(a==b && a==d)
                                             {
                                                 draw=1;
                                                 dialog.setText("Player 2 Won!");
                                                 reLaunch();

                                             }
                                             p2=false;
                                             p1=true;
                                         }


                                     }
                                 }
        );

        nine.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view)
                                    {
                                        countForDraw++;

                                        if (p1==true)
                                        {
                                            nine.setText("1");
                                            String a=one.getText().toString();
                                            String b=three.getText().toString();

                                            String c=five.getText().toString();

                                            String d=six.getText().toString();

                                            String e=seven.getText().toString();
                                            String f=eight.getText().toString();

                                            String g=nine.getText().toString();
                                            if(b==d && b==g)
                                            {
                                                draw=1;
                                                dialog.setText("Player 1 Won!");
                                                reLaunch();
                                            }
                                            else if(e==f && e==g)
                                            {
                                                draw=1;
                                                dialog.setText("Player 1 Won!");
                                                reLaunch();
                                            }
                                            else if(a==c && a==g)
                                            {
                                                draw=1;
                                                dialog.setText("Player 1 Won!");
                                                reLaunch();
                                            }

                                            p2=true;
                                            p1=false;
                                        }
                                        else if(p2==true)
                                        {
                                            nine.setText("0");

                                            String a=one.getText().toString();
                                            String b=three.getText().toString();

                                            String c=five.getText().toString();

                                            String d=six.getText().toString();

                                            String e=seven.getText().toString();
                                            String f=eight.getText().toString();

                                            String g=nine.getText().toString();
                                            if(b==d && b==g)
                                            {
                                                draw=1;
                                                dialog.setText("Player 2 Won!");
                                                reLaunch();
                                            }
                                            else if(e==f && e==g)
                                            {
                                                draw=1;
                                                dialog.setText("Player 2 Won!");
                                                reLaunch();
                                            }
                                            else if(a==c && a==g)
                                            {
                                                draw=1;
                                                dialog.setText("Player 2 Won!");
                                                reLaunch();
                                            }
                                            p2=false;
                                            p1=true;
                                        }


                                    }
                                }
        );
        if(draw==0 && countForDraw==9)
        {
            dialog.setText("Match Tied");
            reLaunch();
        }


    }
    private void reLaunch()
    {
        AlertDialog.Builder adb=new AlertDialog.Builder(PlayGame.this);
        adb
                .setMessage("Game Over!\n" )
                .setCancelable(false)
                .setPositiveButton("NEW",new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface di,int i)
                    {
                        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        finish();
                    }

                });
        AlertDialog ad=adb.create();
        ad.show();

    }

}
