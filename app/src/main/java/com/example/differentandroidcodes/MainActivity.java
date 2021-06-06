package com.example.differentandroidcodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView,imageView1,imageView2,imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.firstImage);
        imageView1 = findViewById(R.id.secondImage);
        imageView2 = findViewById(R.id.thirdImage);
        imageView3 = findViewById(R.id.fourthImage);

        imageView.setOnClickListener(v -> Toast.makeText(MainActivity.this, "First Image In Horizontal Scroll View", Toast.LENGTH_SHORT).show());

        imageView1.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Second Image In Horizontal Scroll View", Toast.LENGTH_SHORT).show());

        imageView2.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Third Image In Horizontal Scroll View", Toast.LENGTH_SHORT).show());

        //In this i have used lambda expression and normal expression to define the onClick function.
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Fourth Image In Horizontal Scroll View", Toast.LENGTH_SHORT).show();
            }
        });
    }
}