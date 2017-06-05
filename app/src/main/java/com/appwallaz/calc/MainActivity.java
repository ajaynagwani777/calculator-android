package com.appwallaz.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSub,bMul,bDiv,bEql,bClr,bDot,bPre,bPer;
    TextView display;
    double num1=0,num2=0,result=0;
    boolean fAdd;
    boolean fSub,fDiv,fMul,fPre,fDot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bAdd = (Button) findViewById(R.id.bAdd);
        bSub = (Button) findViewById(R.id.bSub);
        bMul = (Button) findViewById(R.id.bMul);
        bDiv = (Button) findViewById(R.id.bDiv);
        bEql = (Button) findViewById(R.id.bEql);
        bClr = (Button) findViewById(R.id.bClr);
        bDot = (Button) findViewById(R.id.bDot);
        bPre = (Button) findViewById(R.id.bPre);
        bPer = (Button) findViewById(R.id.bPer);
        display = (TextView) findViewById(R.id.disp);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        bAdd.setOnClickListener(this);
        bSub.setOnClickListener(this);
        bMul.setOnClickListener(this);
        bDiv.setOnClickListener(this);
        bEql.setOnClickListener(this);
        bDot.setOnClickListener(this);
        bClr.setOnClickListener(this);
        bPre.setOnClickListener(this);
        bPer.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.b1:
                if(fAdd || fSub || fDiv || fMul || fDot || fPre) {
                    if (num1 == 0) {
                        num1 = 1;
                        display.setText(num1 + "");
                    } else {
                        num1 = num1 * 10;
                        num1 = num1 + 1;
                        display.setText(num1 + "");
                    }
                }
                else{
                    if (num2 == 0) {
                        num2 = 1;
                        display.setText(num2 + "");
                    } else {
                        num2 = num2 * 10;
                        num2 = num2 + 1;
                        display.setText(num2 + "");
                    }
                }
                    break;
            case R.id.b2:
                if(fAdd || fSub || fDiv || fMul || fPre || fDot) {
                    if (num1 == 0) {
                        num1 = 2;
                        display.setText(num1 + "");
                    } else {
                        num1 = num1 * 10;
                        num1 = num1 + 2;
                        display.setText(num1 + "");
                    }
                }
              else {
                    if (num2 == 0) {
                        num2 = 2;
                        display.setText(num2 + "");
                    } else {
                        num2 = num2 * 10;
                        num2 = num2 + 2;
                        display.setText(num2 + "");
                    }
                }
                    break;

            case R.id.b3:
                if(fAdd || fSub || fDiv || fMul || fPre ) {
                if (num1 == 0) {
                    num1 = 3;
                    display.setText(num1 + "");
                } else {
                    num1 = num1 * 10;
                    num1 = num1 + 3;
                    display.setText(num1 + "");
                }
            }
            else {
                if (num2 == 0) {
                    num2 = 3;
                    display.setText(num2 + "");
                } else {
                    num2 = num2 * 10;
                    num2 = num2 + 3;
                    display.setText(num2 + "");
                }
            }
            break;
            case R.id.b4:
                if(fAdd || fSub || fDiv || fMul || fPre) {
                    if (num1 == 0) {
                        num1 = 4;
                        display.setText(num1 + "");
                    } else {
                        num1 = num1 * 10;
                        num1 = num1 + 4;
                        display.setText(num1 + "");
                    }
                }
                else {
                    if (num2 == 0) {
                        num2 = 4;
                        display.setText(num2 + "");
                    } else {
                        num2 = num2 * 10;
                        num2 = num2 + 4;
                        display.setText(num2 + "");
                    }
                }
                break;
            case R.id.b5:
                if(fAdd || fSub || fDiv || fMul || fPre) {
                    if (num1 == 0) {
                        num1 = 5;
                        display.setText(num1 + "");
                    } else {
                        num1 = num1 * 10;
                        num1 = num1 + 5;
                        display.setText(num1 + "");
                    }
                }
                else {
                    if (num2 == 0) {
                        num2 = 5;
                        display.setText(num2 + "");
                    } else {
                        num2 = num2 * 10;
                        num2 = num2 + 5;
                        display.setText(num2 + "");
                    }
                }
                break;
            case R.id.b6:
                if(fAdd || fSub || fDiv || fMul || fPre) {
                    if (num1 == 0) {
                        num1 = 6;
                        display.setText(num1 + "");
                    } else {
                        num1 = num1 * 10;
                        num1 = num1 + 6;
                        display.setText(num1 + "");
                    }
                }
                else {
                    if (num2 == 0) {
                        num2 = 6;
                        display.setText(num2 + "");
                    } else {
                        num2 = num2 * 10;
                        num2 = num2 + 6;
                        display.setText(num2 + "");
                    }
                }
                break;
            case R.id.b7:
                if(fAdd || fSub || fDiv || fMul || fPre)
                {
                    if (num1 == 0) {
                        num1 = 7;
                        display.setText(num1 + "");
                    } else {
                        num1 = num1 * 10;
                        num1 = num1 + 7;
                        display.setText(num1 + "");
                    }
                }
                else {
                    if (num2 == 0) {
                        num2 = 7;
                        display.setText(num2 + "");
                    } else {
                        num2 = num2 * 10;
                        num2 = num2 + 7;
                        display.setText(num2 + "");
                    }
                }
                break;
            case R.id.b8:
                if(fAdd || fSub || fDiv || fMul || fPre) {
                    if (num1 == 0) {
                        num1 = 8;
                        display.setText(num1 + "");
                    } else {
                        num1 = num1 * 10;
                        num1 = num1 + 8;
                        display.setText(num1 + "");
                    }
                }
                else {
                    if (num2 == 0) {
                        num2 = 8;
                        display.setText(num2 + "");
                    } else {
                        num2 = num2 * 10;
                        num2 = num2 + 8;
                        display.setText(num2 + "");
                    }
                }
                break;
            case R.id.b9:
                if(fAdd || fSub || fDiv || fMul || fPre) {
                    if (num1 == 0) {
                        num1 = 9;
                        display.setText(num1 + "");
                    } else {
                        num1 = num1 * 10;
                        num1 = num1 + 9;
                        display.setText(num1 + "");
                    }
                }
                else {
                    if (num2 == 0) {
                        num2 = 9;
                        display.setText(num2 + "");
                    } else {
                        num2 = num2 * 10;
                        num2 = num2 + 9;
                        display.setText(num2 + "");
                    }
                }
                break;
            case R.id.b0:
                if(fAdd || fSub || fDiv || fMul || fPre) {
                    if (num1 == 0) {
                        num1 = 0;
                        display.setText(num1 + "");
                    } else {
                        num1 = num1 * 10;
                        num1 = num1 + 0;
                        display.setText(num1 + "");
                    }
                }
                else{
                        if (num2 == 0) {
                            num2 = 0;
                            display.setText(num2 + "");
                        } else {
                            num2 = num2 * 10;
                            num2 = num2 + 0;
                            display.setText(num2 + "");
                        }
                    }
                break;
            case R.id.bAdd:
                fAdd = true;
                num2 = num1 + num2;
                display.setText(num2 + "");
                num1 = 0;
                break;

            case R.id.bSub:
                fSub = true;
                num2= num2 - num1;
                display.setText(num2 + "");
                num1=0;
                break;
            case R.id.bDiv:
                fDiv = true;
                if(num1==0){
                    break;
                }
                else {
                    num2 = num2 / num1;
                    display.setText(num2 + "");
                }
                num1=0;
                break;
            case R.id.bMul:
                fMul = true;
                if(num1==0)
                {
                    break;
                }
                else{
                num2 =num2 * num1;
                display.setText(num2 + "");
                }
                num1=0;
                break;
            case R.id.bPer:
                display.setText(num2/100 + "");
                break;
            case R.id.bPre:
                if(!fPre)
                {
                    num2 = (-1)*num2;
                    fPre = true;
                    display.setText(num2 + "");
                }
                else{
                    num1 = (-1)*num1;
                    fPre = false;
                    display.setText(num1 + "");
                }


                break;
            case R.id.bEql:
                if (fAdd) {
                    result = num1 + num2;
                    display.setText(result + "");
                    num1=0;
                    num2=0;
                    fAdd=false;
                } else if (fSub) {
                    result = num2 - num1;
                    num1=0;
                    num2=0;
                    fSub=false;
                }
                else if(fDiv) {
                    result = num2 / num1;
                    num1=0;
                    num2=0;
                    fDiv=false;
                }
                else if(fMul){
                    result = num2*num1;
                    num1=0;
                    num2=0;
                    fMul=false;
                }
                    display.setText(result + "");
                break;
            case R.id.bDot:
             if(fDot) {
                 while (v.getId() == bAdd.getId() || v.getId() == bSub.getId() || v.getId() == bMul.getId() || v.getId() == bDiv.getId()) {
                     num1 = num1 / 10;
                     display.setText(num2 + "");
                 }
                 fDot = false;
             }
             else {
                 while (v.getId() != bAdd.getId() || v.getId() != bSub.getId() || v.getId() != bMul.getId() || v.getId() != bDiv.getId()) {
                     num2 = num2 / 10;
                     display.setText(num2 + "");
                 }
                 fDot = true;
             }
                break;
            case R.id.bClr:
                num1=0;
                num2=0;
                result=0;
                fAdd=false;
                fSub=false;
                fMul=false;
                fDiv=false;
                fPre=false;
                display.setText(num1+"");
                break;
            default:
                    break;

        }



    }
}
