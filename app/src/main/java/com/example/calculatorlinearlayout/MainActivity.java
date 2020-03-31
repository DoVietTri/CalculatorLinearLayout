package com.example.calculatorlinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtView;
    Button btnCE, btnC, btnBS, btnChia, btnCong, btnTru, btnNhan, btnCongorTru, btnCham, btnBang,
            btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Double var1, var2, ans;
    Boolean add = false, sub = false, mul = false, div = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onset();
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText() == "0") {
                    txtView.setText("0");
                } else {
                    txtView.setText(txtView.getText() + "0");
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText() == "0") {
                    txtView.setText("1");
                } else {
                    txtView.setText(txtView.getText() + "1");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText() == "0") {
                    txtView.setText("2");
                } else {
                    txtView.setText(txtView.getText() + "2");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText() == "0") {
                    txtView.setText("3");
                } else {
                    txtView.setText(txtView.getText() + "3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText() == "0") {
                    txtView.setText("4");
                } else {
                    txtView.setText(txtView.getText() + "4");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText() == "0") {
                    txtView.setText("5");
                } else {
                    txtView.setText(txtView.getText() + "5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText() == "0") {
                    txtView.setText("6");
                } else {
                    txtView.setText(txtView.getText() + "6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText() == "0") {
                    txtView.setText("7");
                } else {
                    txtView.setText(txtView.getText() + "7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText() == "0") {
                    txtView.setText("8");
                } else {
                    txtView.setText(txtView.getText() + "8");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText() == "0") {
                    txtView.setText("9");
                } else {
                    txtView.setText(txtView.getText() + "9");
                }
            }
        });
        btnCham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + ".");
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(btnCong);
                buttonFalse();
                add = true;
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(btnTru);
                buttonFalse();
                sub = true;
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(btnNhan);
                buttonFalse();
                mul = true;
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVar1();
                colorChange(btnChia);
                buttonFalse();
                div = true;
            }
        });

        btnCongorTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtView.getText().toString() == ""){
                    txtView.setText("");
                } else {
                    double k = Double.parseDouble(txtView.getText().toString());
                    double result;
                    if (k > 0 || k < 0) {
                        result = -k;
                        txtView.setText(String.valueOf(result));
                    }
                }
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add) {

                    reset();
                } else if (sub) {

                    reset();
                } else if (mul) {

                    reset();
                } else if (div) {
                    reset();
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allReset();
            }
        });
        btnBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = txtView.getText().length();
                int number = length - 1;
                String store;
                if (length > 0) {
                    StringBuilder back = new StringBuilder(txtView.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    txtView.setText(store);
                }
            }
        });
        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(txtView.getText().toString());
                if (sub) {
                    ans = var1 - var2;
                }
                else if (add) {
                    ans = var1 + var2;
                }
                else if (mul) {
                    ans = var1*var2;
                }
                else if (div) {
                    ans = var1/var2;
                } else {
                    ans = ans + 0;
                }
                txtView.setText(String.valueOf(ans));
                btnBang.setEnabled(false);
                reset();
            }
        });
    }

    public void onset() {
        txtView = (TextView) findViewById(R.id.txtView);
        btnCE = (Button) findViewById(R.id.btnCE);
        btnC  = (Button) findViewById(R.id.btnC);
        btnBS = (Button) findViewById(R.id.btnBS);
        btnChia = (Button) findViewById(R.id.btnChia);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnCongorTru = (Button) findViewById(R.id.btnCongorTru);
        btnCham = (Button) findViewById(R.id.btnCham);
        btnBang = (Button) findViewById(R.id.btnBang);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
    }



    //Set giá trị cho 1 chuỗi được nhập vào
    public void setVar1() {
        var1 = Double.parseDouble(txtView.getText().toString());
    }

    //Đổi màu các nút khi được click vào
    public void colorChange(Button b) {
        b.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }

    public void enabled(Button b) {
        b.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        b.setEnabled(false);
    }

    //đưa trạng thái không các nút k đc click vào nữa và đưa text về rỗng
    public  void buttonFalse() {
        btnCong.setEnabled(false);
        btnTru.setEnabled(false);
        btnNhan.setEnabled(false);
        btnChia.setEnabled(false);

        txtView.setText("");
    }

    public void reset() {
        btnCong.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        btnTru.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        btnNhan.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        btnChia.setBackgroundColor(getResources().getColor(R.color.colorGrey));

        btnCong.setEnabled(true);
        btnTru.setEnabled(true);
        btnNhan.setEnabled(true);
        btnChia.setEnabled(true);
        btnBang.setEnabled(true);
        add = false;
        sub = false;
        mul = false;
        div = false;
    }

    //Thiết lập cho sự kiện khi click vào nút C
    public void allReset() {
        btnCong.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        btnTru.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        btnNhan.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        btnChia.setBackgroundColor(getResources().getColor(R.color.colorGrey));

        btnCong.setEnabled(true);
        btnTru.setEnabled(true);
        btnNhan.setEnabled(true);
        btnChia.setEnabled(true);
        btnBang.setEnabled(true);
        add = false;
        sub = false;
        mul = false;
        div = false;

        txtView.setText("0");
    }
}
