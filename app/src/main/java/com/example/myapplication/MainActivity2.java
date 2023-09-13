package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {
    private Button btn33,btn44;
    private ProgressBar pb1;
    int contador;
    private RatingBar bar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn33 = (Button) findViewById(R.id.btn33);
        anterior ();
        pb1 =(ProgressBar) findViewById(R.id.pb1);
        prog();
        btn44 = (Button) findViewById(R.id.btn44);
        bar1 =(RatingBar) findViewById(R.id.bar1);

    }
    public void anterior(){
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ant  = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(ant);
            }
        });

    }
    public void prog(){
        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                contador ++;
                pb1.setProgress(contador);
                if (contador == 100)
                    t.cancel();
            }
        };
        t.schedule(tt,0,100);
    }
    public void cuantasEstrellas(View v){
        Toast.makeText(MainActivity2.this, "ah otorgado:  "+ bar1.getRating()+" estrellas", Toast.LENGTH_SHORT).show();

    }
}