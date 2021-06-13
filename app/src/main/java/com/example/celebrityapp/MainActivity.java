package com.example.celebrityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView btn1, btn2, btn3, tv;
    View img, v1;
    int a = 1, score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        img = findViewById(R.id.View1);
        v1 = findViewById(R.id.View2);
        tv = findViewById(R.id.upper);
    }

    public void act11(View view) {
        if(a == 1){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            btn1.setText("RYEN RAYNONDS");
            btn2.setText("VIN DIESEL");
            btn3.setText("SAMUEL L.JACKSON");
            img.setBackgroundResource(R.drawable.samuel);
            v1.setBackgroundResource(R.drawable.stage2);
            score = score + 1;
            a = a + 1;
        }

        else if(a == 2){
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            btn1.setText("WENDY WILLIAMS");
            btn2.setText("MARTHA STEWARD");
            btn3.setText("MONICA LUWISKY");
            img.setBackgroundResource(R.drawable.marthasteward);
            v1.setBackgroundResource(R.drawable.stage3);
            a = a + 1;
        }
        else if(a == 3){
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            img.setBackgroundResource(R.drawable.score);
            btn1.setText("Stage 1");
            btn2.setText("Stage 2");
            btn3.setText("Stage 3 completed");
            tv.setText("YOUR SCORE IS " + score);
            a = a + 1;
        }
    }

    public void act12(View view) {
        if(a == 1){
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            btn1.setText("RYEN RAYNONDS");
            btn2.setText("VIN DIESEL");
            btn3.setText("SAMUEL L.JACKSON");
            img.setBackgroundResource(R.drawable.samuel);
            v1.setBackgroundResource(R.drawable.stage2);
            a = a + 1;
        }

        else if(a == 2){
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            btn1.setText("WENDY WILLIAMS");
            btn2.setText("MARTHA STEWARD");
            btn3.setText("MONICA LUWISKY");
            img.setBackgroundResource(R.drawable.marthasteward);
            v1.setBackgroundResource(R.drawable.stage3);
            a = a + 1;
        }
        else if(a == 3){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            img.setBackgroundResource(R.drawable.score);
            btn1.setText("Stage 1");
            btn2.setText("Stage 2");
            btn3.setText("Stage 3 completed");
            score = score + 1;
            tv.setText("YOUR SCORE IS " + score);
        }
    }

    public void act13(View view) {
        if(a == 1){
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            btn1.setText("RYEN RAYNONDS");
            btn2.setText("VIN DIESEL");
            btn3.setText("SAMUEL L.JACKSON");
            img.setBackgroundResource(R.drawable.samuel);
            v1.setBackgroundResource(R.drawable.stage2);
            a = a + 1;
        }



        else if(a == 2){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            btn1.setText("WENDY WILLIAMS");
            btn2.setText("MARTHA STEWARD");
            btn3.setText("MONICA LUWISKY");
            img.setBackgroundResource(R.drawable.marthasteward);
            v1.setBackgroundResource(R.drawable.stage3);
            score = score + 1;
            a = a + 1;
        }
        else if(a == 3){
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            img.setBackgroundResource(R.drawable.score);
            btn1.setText("Stage 1");
            btn2.setText("Stage 2");
            btn3.setText("Stage 3 completed");
            tv.setText("YOUR SCORE IS " + score);
            a = 0;
        }
    }


}