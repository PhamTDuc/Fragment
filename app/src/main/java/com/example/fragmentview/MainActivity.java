package com.example.fragmentview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDetail = findViewById(R.id.tvDetail);

        ArrayList<String> details = new ArrayList<>();
        details.add("Description Detail for One");
        details.add("Description Detail for Two");
        details.add("Description Detail for Three");
        details.add("Description Detail for Four");
    }
}