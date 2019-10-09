package edu.ucsb.cs.cs184.yuanxue.yxueProgColorSwap;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.util.TypedValue;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

import static android.util.TypedValue.COMPLEX_UNIT_DIP;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Create a linear layout
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        LinearLayout linearLayout = new LinearLayout(this);
        //linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);



        //Create text view for counter
        final TextView textView = new TextView(this);
        textView.setText("Tap to Change Color");
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,30);

        // The gesture threshold expressed in dp
        final float GESTURE_THRESHOLD_DP = 10.0f;

        // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density;
        // Convert the dps to pixels, based on density scale
        int mGestureThreshold = (int) (GESTURE_THRESHOLD_DP * scale + 0.5f);
        textView.setPadding(0,mGestureThreshold,0,0);



        textView.setLayoutParams(params);


        //Create a button for text
        Button button = new Button(this);
        button.setGravity(Gravity.CENTER_HORIZONTAL);

        button.setText("Tap me !");

        button.setLayoutParams(params);

        // The gesture threshold expressed in dp
        final float GESTURE_THRESHOLD_DP_ = 60.0f;

        // Get the screen's density scale

        // Convert the dps to pixels, based on density scale

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int r = rnd.nextInt(255);
                int g = rnd.nextInt(255);
                int b = rnd.nextInt(255);
                final String rgb = "COLOR: " + r + "r " + g + "g " + b + "b ";
                textView.setText(String.valueOf(rgb));
                textView.setTextColor(Color.rgb(r, b, g));

            }
        });

        //Add to linear layout
        linearLayout.addView(textView);
        linearLayout.addView(button);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ActionBar.LayoutParams.MATCH_PARENT,
                ActionBar.LayoutParams.MATCH_PARENT
        );

        this.addContentView(linearLayout, layoutParams);
        setContentView( linearLayout);
    }






}

