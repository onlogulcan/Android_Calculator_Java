package com.example.mysecondproject;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class grid extends AppCompatActivity
{


    private TextView txt;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btncarp;
    private Button btntopla;
    private Button btnbol;
    private Button btncikar;
    private Button btnhesapla;
    private Button btntemizle;
    float Res1, Res2;
    boolean topla, cikar, carp, bol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridd);
        txt= (EditText) findViewById(R.id.yazdirilacaktext);
        btn1 =(Button) findViewById(R.id.btn1);
        btn2 =(Button) findViewById(R.id.btn2);
        btn3 =(Button) findViewById(R.id.btn3);
        btn4 =(Button) findViewById(R.id.btn4);
        btn5 =(Button) findViewById(R.id.btn5);
        btn6 =(Button) findViewById(R.id.btn6);
        btn7 =(Button) findViewById(R.id.btn7);
        btn8 =(Button) findViewById(R.id.btn8);
        btn9 =(Button) findViewById(R.id.btn9);
        btn0 =(Button) findViewById(R.id.btn0);
        btnbol= (Button) findViewById(R.id.btnbol) ;
        btncarp= (Button) findViewById(R.id.btncarp) ;
        btntopla= (Button) findViewById(R.id.btntopla) ;
        btncikar= (Button) findViewById(R.id.btncikar) ;
        btnhesapla= (Button) findViewById(R.id.btnsonuc) ;
        btntemizle=(Button) findViewById(R.id.btnTemizle);

        tıklanma();




    }
    private void tıklanma() {
        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText()+ "1");
                        return;
                    }
                }
        );
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText()+ "2");
                        return;
                    }
                }
        );
        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText()+ "3");
                        return;
                    }
                }
        );
        btn4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText()+ "4");
                        return;
                    }
                }
        );
        btn5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText() +"5");
                        return;
                    }
                }
        );
        btn6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText()+ "6");
                        return;
                    }
                }
        );
        btn7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText()+ "7");
                        return;
                    }
                }
        );btn8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText()+ "8");
                        return;
                    }
                }
        );
        btn9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText()+ "9");
                        return;
                    }
                }
        );
        btn0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText()+ "0");
                        return;
                    }
                }
        );
        btntopla.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (txt== null){
                            txt.setText("");
                        }
                        else{
                            Res1=Float.parseFloat(txt.getText()+"");
                            topla=true;
                            txt.setText(null);

                        }
                    }
                }
        );
        btncikar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (txt== null){
                            txt.setText("");
                        }
                        else{
                            Res1=Float.parseFloat(txt.getText()+"");
                            cikar=true;
                            txt.setText(null);

                        }
                    }
                }
        );
        btncarp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (txt== null){
                            txt.setText("");
                        }
                        else{
                            Res1=Float.parseFloat(txt.getText()+"");
                            carp=true;
                            txt.setText(null);

                        }
                    }
                }
        );
        btnbol.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (txt== null){
                            txt.setText("");
                        }
                        else{
                            Res1=Float.parseFloat(txt.getText()+"");
                            bol=true;
                            txt.setText(null);

                        }
                    }
                }
        );
        btnhesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Res2=Float.parseFloat(txt.getText()+"");
               if(topla==true){
                   txt.setText(Res1+Res2+"");
                   topla=false;
               }
                if(cikar==true){
                    txt.setText(Res1-Res2+"");
                    topla=false;
                }
                if(carp==true){
                    txt.setText(Res1*Res2+"");
                    topla=false;
                }
                if(bol==true){
                    txt.setText(Res1/Res2+"");
                    topla=false;
                }
            }
        });
        btntemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
            }
        });

    }

}
