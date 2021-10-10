package com.example.a1918129dandy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
    }

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class Segitiga extends AppCompatActivity {
        EditText etAlas , etTinggi;
        Button button;
        TextView tvHasil;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_segitiga);
            etAlas = findViewById(R.id.etAlas);
            etTinggi = findViewById(R.id.etTinggi);
            tvHasil = findViewById(R.id.tvHasil);
            button = findViewById(R.id.button3);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String Alas = etAlas.getText().toString().trim();
                    String Tinggi = etTinggi.getText().toString().trim();
                    boolean isEmpty = false;
                    boolean isInvalid = false;
                    if(TextUtils.isEmpty(Alas)){
                        isEmpty=true;
                        etAlas.setError("HEM");
                    }
                    if(TextUtils.isEmpty(Tinggi)){
                        isEmpty=true;
                        etTinggi.setError("HAH");
                    }
                    Double a = toDouble(Alas);
                    Double t = toDouble(Tinggi);
                    if (a==null){
                        isInvalid=true;
                        etAlas.setError("isi ");
                    }
                    if(t==null){
                        isInvalid=true;
                        etTinggi.setError("angka");
                    }

                    if(!isEmpty && !isInvalid){
                        double luas = 0.5 * a * t;
                        tvHasil.setText(String.valueOf(luas));
                    }
                }
            });
        }
        private Double toDouble(String value){
            try {
                return Double.valueOf(value);
            }catch (NumberFormatException e){
                return null;
            }

        }
    }

}