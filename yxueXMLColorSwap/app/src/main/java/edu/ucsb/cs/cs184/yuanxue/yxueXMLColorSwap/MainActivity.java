package edu.ucsb.cs.cs184.yuanxue.yxueXMLColorSwap;



import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //argument 'view' is passed from view that is clicked
    public void incrementCounter(View view) {

        TextView tv = findViewById(R.id.CounterCount);
        Random rnd = new Random();
        int r = rnd.nextInt(255) ;
        int g = rnd.nextInt(255) ;
        int b = rnd.nextInt(255) ;
        final String rgb = "COLOR: " + r + "r " + g + "g " + b + "b ";
        tv.setText(String.valueOf(rgb));
        tv.setTextColor(Color.rgb(r,b,g));

    }
}

