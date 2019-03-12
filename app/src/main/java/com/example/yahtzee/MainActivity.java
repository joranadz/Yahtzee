package com.example.yahtzee;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button spinButon = findViewById(R.id.spin);
        final ImageButton oneButton = findViewById(R.id.oneDice);
        final ImageButton twoButton = findViewById(R.id.twoDice);
        final ImageButton threeButton = findViewById(R.id.threeDice);
        final ImageButton fourButton = findViewById(R.id.fourDice);
        final ImageButton fiveButton = findViewById(R.id.fiveDice);
        final Button oneSum = findViewById(R.id.oneSum);
        final Button twoSum = findViewById(R.id.twoSum);
        final Button threeSum = findViewById(R.id.threeSum);
        final Button fourSum = findViewById(R.id.fourSum);
        final Button fiveSum = findViewById(R.id.fiveSum);
        final Button sixSum = findViewById(R.id.sixSum);
        final Button b10 = findViewById(R.id.but10);
        final Button b11 = findViewById(R.id.but11);
        final Button b12 = findViewById(R.id.but12);
        final Button b13 = findViewById(R.id.but13);
        final Button b14 = findViewById(R.id.but14);
        final Button b15 = findViewById(R.id.but15);
        final Button b16 = findViewById(R.id.but16);
        final TextView tx1 = findViewById(R.id.txt1);
        final TextView tx2 = findViewById(R.id.txt2);
        final TextView tx3 = findViewById(R.id.txt3);
        final TextView tx4 = findViewById(R.id.txt4);
        final TextView tx5 = findViewById(R.id.txt5);
        final TextView tx6 = findViewById(R.id.txt6);
        final TextView tx7 = findViewById(R.id.txt7);
        final TextView tx8 = findViewById(R.id.txt8);
        final TextView tx10 = findViewById(R.id.txt10);
        final TextView tx11 = findViewById(R.id.txt11);
        final TextView tx12 = findViewById(R.id.txt12);
        final TextView tx13 = findViewById(R.id.txt13);
        final TextView tx14 = findViewById(R.id.txt14);
        final TextView tx15 = findViewById(R.id.txt15);
        final TextView tx16 = findViewById(R.id.txt16);
        final Button all = findViewById(R.id.all);
        final TextView youHave=findViewById(R.id.youHave);
        final TextView youHave2=findViewById(R.id.youHave2);
        final TextView youHave3=findViewById(R.id.youHave3);
        final TextView youHave4=findViewById(R.id.youHave4);
        final TextView youHave5=findViewById(R.id.youHave5);

        spinButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int s1 = random.nextInt(6) + 1;
                int s2 = random.nextInt(6) + 1;
                final int s3 = random.nextInt(6) + 1;
                final int s4 = random.nextInt(6) + 1;
                final int s5 = random.nextInt(6) + 1;

                int[] dicesInArrai={s1,s2,s3,s4,s5};
                int temp;
                for (int i = 0; i < 4; i++)
                {
                    for(int j = 0; j < 4; j++)
                    {
                        if(dicesInArrai[i] > dicesInArrai[j + 1])
                        {
                            temp = dicesInArrai [j + 1];
                            dicesInArrai [j + 1]= dicesInArrai [i];
                            dicesInArrai [i] = temp;

                        }
                    }
                }
                for (int i = 1; i < 4; i++)
                {
                    for(int j = 1; j < 4; j++)
                    {
                        if(dicesInArrai[i] > dicesInArrai[j + 1])
                        {
                            temp = dicesInArrai [j + 1];
                            dicesInArrai [j + 1]= dicesInArrai [i];
                            dicesInArrai [i] = temp;

                        }
                    }
                }
                for (int i = 2; i < 4; i++)
                {
                    for(int j = 2; j < 4; j++)
                    {
                        if(dicesInArrai[i] > dicesInArrai[j + 1])
                        {
                            temp = dicesInArrai [j + 1];
                            dicesInArrai [j + 1]= dicesInArrai [i];
                            dicesInArrai [i] = temp;

                        }
                    }
                }
                for (int i = 3; i < 4; i++)
                {
                    for(int j = 3; j < 4; j++)
                    {
                        if(dicesInArrai[i] > dicesInArrai[j + 1])
                        {
                            temp = dicesInArrai [j + 1];
                            dicesInArrai [j + 1]= dicesInArrai [i];
                            dicesInArrai [i] = temp;

                        }
                    }
                }
                youHave.setText(Integer.toString(dicesInArrai[0]));
                youHave2.setText(Integer.toString(dicesInArrai[1]));
                youHave3.setText(Integer.toString(dicesInArrai[2]));
                youHave4.setText(Integer.toString(dicesInArrai[3]));
                youHave5.setText(Integer.toString(dicesInArrai[4]));
                imgSet(s1, oneButton);
                imgSet(s2, twoButton);
                imgSet(s3, threeButton);
                imgSet(s4, fourButton);
                imgSet(s5, fiveButton);
                //Equal sum
                final int equalSum1 = sumEquaDices(s1, s2, s3, s4, s5, 1);
                final int equalSum2 = sumEquaDices(s1, s2, s3, s4, s5, 2);
                final int equalSum3 = sumEquaDices(s1, s2, s3, s4, s5, 3);
                final int equalSum4 = sumEquaDices(s1, s2, s3, s4, s5, 4);
                final int equalSum5 = sumEquaDices(s1, s2, s3, s4, s5, 5);
                final int equalSum6 = sumEquaDices(s1, s2, s3, s4, s5, 6);
                final String sk1 = Integer.toString(equalSum1);
                final String sk2 = Integer.toString(equalSum2 * 2);
                final String sk3 = Integer.toString(equalSum3 * 3);
                final String sk4 = Integer.toString(equalSum4 * 4);
                final String sk5 = Integer.toString(equalSum5 * 5);
                final String sk6 = Integer.toString(equalSum6 * 6);
                oneSum.setText(sk1);
                twoSum.setText(sk2);
                threeSum.setText(sk3);
                fourSum.setText(sk4);
                fiveSum.setText(sk5);
                sixSum.setText(sk6);


                //All sum
                final int allSum = s1 + s2 + s3 + s4 + s5;
                final String sumAll = Integer.toString(allSum);

                //Three cind
                if (equalSum1 >= 3 || equalSum2 >= 3 || equalSum3 >= 3 || equalSum4 >= 3 || equalSum5 >= 3 || equalSum6 >= 3) {
                    b10.setText(sumAll);
                    //full house
                    if (equalSum1 == 2 || equalSum2 == 2 || equalSum3 == 2 || equalSum4 == 2 || equalSum5 == 2 || equalSum6 == 2) {
                        b12.setText("25");
                    } else {
                        b12.setText("0");
                    }
                } else {
                    b10.setText("0");
                    b12.setText("0");
                }
                //Four cind
                if (equalSum1 >= 4 || equalSum2 >= 4 || equalSum3 >= 4 || equalSum4 >= 4 || equalSum5 >= 4 || equalSum6 >= 4) {
                    b11.setText(sumAll);
                } else {
                    b11.setText("0");
                }
                //smalStraight
                if (dicesInArrai[0]==1&&dicesInArrai[1]==2&&dicesInArrai[2]==3){
                    b12.setText("25");
                }
                //Big Straight
                if (dicesInArrai[0]==1&&dicesInArrai[1]==2&&dicesInArrai[2]==3&&dicesInArrai[3]==4){
                    b12.setText("35");
                }
                //Yatzee
                if (equalSum1 >= 5 || equalSum2 >= 5 || equalSum3 >= 5 || equalSum4 >= 5 || equalSum5 >= 5 || equalSum6 >= 5) {
                    b15.setText("50");
                } else {
                    b15.setText("0");
                }
                //Chance
                b16.setText(sumAll);

                //suming Dices results
                int bt1 = Integer.parseInt(tx1.getText().toString());
                int bt2 = Integer.parseInt(tx2.getText().toString());
                int bt3 = Integer.parseInt(tx3.getText().toString());
                int bt4 = Integer.parseInt(tx4.getText().toString());
                int bt5 = Integer.parseInt(tx5.getText().toString());
                int bt6 = Integer.parseInt(tx6.getText().toString());
                int sumAllCindDices = bt1 + bt2 + bt3 + bt4 + bt5 + bt6;

                tx7.setText(Integer.toString(sumAllCindDices));
                if (sumAllCindDices >= 63) {
                    tx8.setText("35");
                } else {
                    tx8.setText("0");
                }
                int bt10 = Integer.parseInt(tx10.getText().toString());
                int bt11 = Integer.parseInt(tx11.getText().toString());
                int bt12 = Integer.parseInt(tx12.getText().toString());
                int bt13 = Integer.parseInt(tx13.getText().toString());
                int bt14 = Integer.parseInt(tx14.getText().toString());
                int bt15 = Integer.parseInt(tx15.getText().toString());
                int bt16 = Integer.parseInt(tx16.getText().toString());

                int sumAllDices = sumAllCindDices + bt10 + bt11 + bt12 + bt13 + bt14 + bt15 + bt16;
                all.setText(Integer.toString(sumAllDices));
            }
        });

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneButton.setBackgroundColor(Color.parseColor("#D81B60"));
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoButton.setBackgroundColor(Color.parseColor("#D81B60"));
            }
        });

        oneSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneSum.setBackgroundColor(Color.parseColor("#D81B60"));
                tx1.setText(oneSum.getText());
                oneSum.setClickable(false);
            }
        });
        twoSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoSum.setBackgroundColor(Color.parseColor("#D81B60"));
                tx2.setText(twoSum.getText());
                twoSum.setClickable(false);
            }
        });
        threeSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threeSum.setBackgroundColor(Color.parseColor("#D81B60"));
                tx3.setText(threeSum.getText());
                threeSum.setClickable(false);
            }
        });
        fourSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourSum.setBackgroundColor(Color.parseColor("#D81B60"));
                tx4.setText(fourSum.getText());
                fourSum.setClickable(false);
            }
        });
        fiveSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiveSum.setBackgroundColor(Color.parseColor("#D81B60"));
                tx5.setText(fiveSum.getText());

                fiveSum.setClickable(false);
            }
        });
        sixSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixSum.setBackgroundColor(Color.parseColor("#D81B60"));
                tx6.setText(sixSum.getText());
                sixSum.setClickable(false);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b10.setBackgroundColor(Color.parseColor("#D81B60"));
                tx10.setText(b10.getText());
                b10.setClickable(false);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b11.setBackgroundColor(Color.parseColor("#D81B60"));
                tx11.setText(b11.getText());
                b11.setClickable(false);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b12.setBackgroundColor(Color.parseColor("#D81B60"));
                tx12.setText(b12.getText());
                b12.setClickable(false);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b13.setBackgroundColor(Color.parseColor("#D81B60"));
                tx13.setText(b13.getText());
                b13.setClickable(false);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b14.setBackgroundColor(Color.parseColor("#D81B60"));
                tx14.setText(b14.getText());
                b14.setClickable(false);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b15.setBackgroundColor(Color.parseColor("#D81B60"));
                tx15.setText(b15.getText());
                b15.setClickable(false);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b16.setBackgroundColor(Color.parseColor("#D81B60"));
                tx16.setText(b16.getText());
                b16.setClickable(false);
            }
        });


    }

    public int sumEquaDices(int s1, int s2, int s3, int s4, int s5, int sk2) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        if (s1 == sk2) {
            sum1 = 1;
        } else {
            sum1 = 0;
        }
        if (s2 == sk2) {
            sum2 = 1;
        } else {
            sum2 = 0;
        }
        if (s3 == sk2) {
            sum3 = 1;
        } else {
            sum3 = 0;
        }
        if (s4 == sk2) {
            sum4 = 1;
        } else {
            sum4 = 0;
        }
        if (s5 == sk2) {
            sum5 = 1;
        } else {
            sum5 = 0;
        }
        sum = sum1 + sum2 + sum3 + sum4 + sum5;
        return sum;
    }

    public int imgSet(int sk, ImageButton newButton) {
        if (sk == 1) {
            newButton.setImageResource(R.drawable.one);
        }
        if (sk == 2) {
            newButton.setImageResource(R.drawable.two);
        }
        if (sk == 3) {
            newButton.setImageResource(R.drawable.three);
        }
        if (sk == 4) {
            newButton.setImageResource(R.drawable.four);
        }
        if (sk == 5) {
            newButton.setImageResource(R.drawable.five);
        }
        if (sk == 6) {
            newButton.setImageResource(R.drawable.sixs);
        }
        return sk;
    }
}
