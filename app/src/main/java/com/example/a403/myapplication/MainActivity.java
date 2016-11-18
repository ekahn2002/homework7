package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem;
    TextView textView;
    String su1, su2;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnRem=(Button)findViewById(R.id.btnRem) ;
        textView=(TextView)findViewById(R.id.textView);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su1=editText1.getText().toString();
                su2=editText2.getText().toString();

                if(su1.isEmpty() || su2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "오류 : 값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                    result = Float.parseFloat(su1) + Float.parseFloat(su2);
                    textView.setText("계산 결과 : " + result);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su1=editText1.getText().toString();
                su2=editText2.getText().toString();

                if(su1.isEmpty() || su2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "오류 : 값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                    result = Float.parseFloat(su1) - Float.parseFloat(su2);
                    textView.setText("계산 결과 : " + result);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su1=editText1.getText().toString();
                su2=editText2.getText().toString();

                if(su1.isEmpty() || su2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "오류 : 값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                    result = Float.parseFloat(su1) * Float.parseFloat(su2);
                    textView.setText("계산 결과 : " + result);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su1=editText1.getText().toString();
                su2=editText2.getText().toString();

                if(su1.isEmpty() || su2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "오류 : 값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else if(Float.parseFloat(su2) == 0){
                    Toast.makeText(getApplicationContext(), "오류 : 나눌 수 없습니다", Toast.LENGTH_SHORT).show();
                    return;
                }
                    result = Float.parseFloat(su1) / Float.parseFloat(su2);
                    textView.setText("계산 결과 : " + result);
            }
        });

        btnRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su1=editText1.getText().toString();
                su2=editText2.getText().toString();

                if(su1.isEmpty() || su2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "오류 : 값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
                    result = Float.parseFloat(su1) % Float.parseFloat(su2);
                    textView.setText("계산 결과 : " + result);
            }
        });
    }
}
