package com.example.fragmentview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFragment.ItemSelected {

    TextView tvDetail;
    ArrayList<String> details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDetail = findViewById(R.id.tvDetail);

        details = new ArrayList<>();
        details.add("Description Detail for One");
        details.add("Description Detail for Two");
        details.add("Description Detail for Three");
        details.add("Description Detail for Four");
    }

    @Override
    public void onItemSelected(int index) {
        tvDetail.setText(details.get(index));
    }
}