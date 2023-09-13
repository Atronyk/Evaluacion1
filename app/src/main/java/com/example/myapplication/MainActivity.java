package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "SE INICIO un TOAST", Toast.LENGTH_SHORT).show();
        et1 = (EditText) findViewById(R.id.et1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 =(RadioButton) findViewById(R.id.rb2);
        comprobarRB1();
        comprobarRB2();
    }

    public void siguiente(View v){
        Intent sig = new Intent(this,MainActivity2.class);
        startActivity(sig);

    }

    public void comprobarRB1(){
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tipo = rb1.getText().toString();
                Toast.makeText(MainActivity.this, "El radio es : " + tipo, Toast.LENGTH_SHORT).show();

            }
        });

    }
    public void comprobarRB2(){
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tipo = rb2.getText().toString();
                Toast.makeText(MainActivity.this, "El radio es : " + tipo, Toast.LENGTH_SHORT).show();

            }
        });

    }
    public void capturarID(View v){
        if (et1.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "El ID esta vacio", Toast.LENGTH_SHORT).show();
        }else {
            int id= Integer.parseInt(et1.getText().toString());
            Toast.makeText(MainActivity.this, "El ID es: " + id, Toast.LENGTH_SHORT).show();
        }
    }

    public void mostrarToast(View v){
        Toast.makeText(MainActivity.this, "ABRISTE UN TOAST", Toast.LENGTH_SHORT).show();

    }
    public void mostraralet(View v){
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setCancelable(true);
        b.setTitle("OK");
        b.setMessage("Esto es una alerta");
        b.show();

    }
}