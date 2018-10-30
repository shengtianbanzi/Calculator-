package com.example.shj.calculator_1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnCE,btnZF,btnPFG,btnDEL,btnPLUS,btnMinus,btnMul,btnDiv,btnPoint,btnEqual,btnSin,btnCos,btnTan,btnLog,btnSquare,btnCube,btnAbs,btnDao,btnBinary,btnOctal,btnHex,btnExp;
    private String opt = "+";
    private double n1 = 0.0;
    private TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //获取按钮id
        btn0 = findViewById(R.id.buttonZero);
        btn1 = findViewById(R.id.buttonOne);
        btn2 = findViewById(R.id.buttonTwo);
        btn3 = findViewById(R.id.buttonThree);
        btn4 = findViewById(R.id.buttonFour);
        btn5 = findViewById(R.id.buttonFive);
        btn6 = findViewById(R.id.buttonSix);
        btn7 = findViewById(R.id.buttonSeven);
        btn8 = findViewById(R.id.buttonEight);
        btn9 = findViewById(R.id.buttonNine);
        btnCE = findViewById(R.id.buttonClear);
        btnZF = findViewById(R.id.buttonZF);
        btnPFG = findViewById(R.id.buttonPFG);
        btnDEL = findViewById(R.id.buttonDEL);
        btnPLUS = findViewById(R.id.buttonPlus);
        btnMinus = findViewById(R.id.buttonMinus);
        btnMul = findViewById(R.id.buttonMul);
        btnDiv = findViewById(R.id.buttonDiv);
        btnPoint = findViewById(R.id.buttonPoint);
        btnEqual = findViewById(R.id.buttonEqual);
        btnSin = findViewById(R.id.buttonSin);
        btnCos = findViewById(R.id.buttonCos);
        btnTan = findViewById(R.id.buttonTan);
        btnLog = findViewById(R.id.buttonLog);
        btnSquare = findViewById(R.id.buttonSquare);
        btnCube = findViewById(R.id.buttonCube);
        btnAbs = findViewById(R.id.buttonAbs);
        btnDao = findViewById(R.id.buttonDao);
        btnBinary = findViewById(R.id.buttonBinary);
        btnOctal = findViewById(R.id.buttonOctal);
        btnHex = findViewById(R.id.buttonHex);
        btnExp = findViewById(R.id.buttonExp);


        //设置监听器
        btn0.setOnClickListener(listener);
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
        btn9.setOnClickListener(listener);
        btnCE.setOnClickListener(listener);
        btnZF.setOnClickListener(listener);
        btnPFG.setOnClickListener(listener);
        btnDEL.setOnClickListener(listener);
        btnPoint.setOnClickListener(listener);
        btnPLUS.setOnClickListener(listener);
        btnMinus.setOnClickListener(listener);
        btnMul.setOnClickListener(listener);
        btnDiv.setOnClickListener(listener);
        btnEqual.setOnClickListener(listener);
        btnSin.setOnClickListener(listener);
        btnCos.setOnClickListener(listener);
        btnTan.setOnClickListener(listener);
        btnLog.setOnClickListener(listener);
        btnSquare.setOnClickListener(listener);
        btnCube.setOnClickListener(listener);
        btnAbs.setOnClickListener(listener);
        btnDao.setOnClickListener(listener);
        btnBinary.setOnClickListener(listener);
        btnOctal.setOnClickListener(listener);
        btnHex.setOnClickListener(listener);
        btnExp.setOnClickListener(listener);

    }

    //设置监听器；
    private OnClickListener listener = new OnClickListener () {
        @SuppressLint("SetTextI18n")
        public void onClick(View v) {
            //显示输入的数字
            EditText editText = findViewById(R.id.editText1);
            TextView textView = findViewById(R.id.textView1);
            Button btn =(Button)v;

            try{

                label:
                switch (btn.getId()) {

                    case R.id.buttonOne:
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 1);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }

                    case R.id.buttonTwo:
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 2);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }


                    case R.id.buttonEqual:
                    {
                        switch(opt) {

                            case "+":
                                double n2;
                            {
                                String str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                textView.setText(n1 + opt + n2 + "=");
                                editText.setText((n1 + n2) + "");
                                break;
                            }

                            case "-":
                            {
                                String str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                textView.setText(n1 + opt + n2 + "=");
                                editText.setText((n1 - n2) + "");
                                break;
                            }

                            case "*":
                            {
                                String str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                textView.setText(n1 + opt + n2 + "=");
                                editText.setText((n1 * n2) + "");
                                break;
                            }

                            case "/":
                            {
                                String str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                if (n2 == 0) {
                                    editText.setText("");
                                    textView.setText("除数不能为0!");
                                    break label;
                                }

                                else{
                                    textView.setText(n1 + opt + n2 + "=");
                                    editText.setText((n1 / n2) + "");
                                }
                                break;
                            }
                        }

                        break;
                    }

                    case R.id.buttonThree:
                    {
                        editText.setText(editText.getText().toString() + 3);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }

                    case R.id.buttonFour:
                    {
                        editText.setText(editText.getText().toString() + 4);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }

                    case R.id.buttonFive:
                    {
                        editText.setText(editText.getText().toString() + 5);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }

                    case R.id.buttonSix:
                    {
                        editText.setText(editText.getText().toString() + 6);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }

                    case R.id.buttonSeven:
                    {
                        editText.setText(editText.getText().toString() + 7);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }

                    case R.id.buttonEight:
                    {
                        editText.setText(editText.getText().toString() + 8);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }

                    case R.id.buttonNine:
                    {
                        editText.setText(editText.getText().toString() + 9);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }

                    case R.id.buttonZero:
                    {
                        textView.setText(n1 + opt + 10);
                        editText.setText(editText.getText().toString() + 0);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }

                    case R.id.buttonPoint:
                    {
                        String str = editText.getText().toString();
                        if (str.indexOf(".") != -1) //判断字符串中是否已经包含了小数点，如果有就什么也不做
                        {

                        } else //如果没有小数点
                        {
                            switch (str) {
                                case "0":
//如果开始为0，
                                    editText.setText(("0" + "."));
                                    break;
                                case "":
//如果初时显示为空，就什么也不做

                                    break;
                                default:
                                    editText.setText(str + ".");
                                    break;
                            }
                        }
                        break;
                    }

                    case R.id.buttonDiv:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "/";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }

                    case R.id.buttonMul:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "*";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }

                    case R.id.buttonMinus:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "-";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }

                    case R.id.buttonPlus:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "+";
                        textView.setText(n1 + opt);
                        editText.setText("");
                        break;
                    }

                    case R.id.buttonPFG:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        if (n1 < 0) {
                            editText.setText("");
                            textView.setText("负数没有平方根!");
                        } else {
                            editText.setText(Math.sqrt(n1) + "");
                            textView.setText(n1 + "的平方根:");
                        }

                        break;
                    }

                    case R.id.buttonZF:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        if (str.length() > 0)
                            editText.setText(-n1 + "");
                        textView.setText(-n1 + "");
                        break;
                    }

                    case R.id.buttonClear:
                    {
                        String str = editText.getText().toString();
                        if (str.length() > 0)
                            editText.setText("");
                        break;
                    }

                    case R.id.buttonDEL:
                    {
                        String str = editText.getText().toString();
                        if (str.length() > 0)
                            editText.setText(str.substring(0, str.length() - 1));
                        break;
                    }

                    case R.id.buttonSin:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(Math.sin(n1) + "");
                        textView.setText(n1 + "的正弦值:");
                        break;
                    }

                    case R.id.buttonCos:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(Math.cos(n1) + "");
                        textView.setText(n1 + "的余弦值:");
                        break;
                    }

                    case R.id.buttonTan:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(Math.tan(n1) + "");
                        textView.setText(n1 + "的正切值:");
                        break;
                    }

                    case R.id.buttonLog:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(Math.log(n1) + "");
                        break;
                    }

                    case R.id.buttonSquare:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(Math.pow(n1,2) + "");
                        textView.setText(n1 + "的平方:");
                        break;
                    }

                    case R.id.buttonCube:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(Math.pow(n1,3) + "");
                        textView.setText(n1 + "的立方:");
                        break;
                    }

                    case R.id.buttonAbs:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(Math.abs(n1) + "");
                        textView.setText(n1 + "的绝对值:");
                        break;
                    }

                    case R.id.buttonDao:
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        editText.setText(1/(n1) + "");
                        textView.setText(n1 + "");
                        break;
                    }

                    case R.id.buttonBinary:
                    {
                        String str = editText.getText().toString();
                        n1 = Integer.parseInt(str);
                        editText.setText(Integer.toBinaryString((int) n1) + "");
                        textView.setText(n1 + "");
                        break;
                    }

                    case R.id.buttonOctal:
                    {
                        String str = editText.getText().toString();
                        n1 = Integer.parseInt(str);
                        editText.setText(Integer.toOctalString((int) n1) + "");
                        textView.setText(n1 + "");
                        break;
                    }

                    case R.id.buttonHex:
                    {
                        String str = editText.getText().toString();
                        n1 = Integer.parseInt(str);
                        editText.setText(Integer.toHexString((int) n1) + "");
                        textView.setText(n1 + "");
                        break;
                    }

                    case R.id.buttonExp:
                    {
                        String str = editText.getText().toString();
                        n1 = Integer.parseInt(str);
                        editText.setText(Math.exp(n1) + "");
                        textView.setText(n1 + "");
                        break;
                    }

                }
            }catch(Exception ignored){}
        }
    };

}







