package com.example.fragmentview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFragment.ItemSelected {

    FragmentManager manager;
    TextView tvDetail;
    String[] details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDetail = findViewById(R.id.tvDetail);
        details = getResources().getStringArray(R.array.descriptions);
        manager = getSupportFragmentManager();

        if(findViewById(R.id.layout_portrait) !=null)
        {
            manager.beginTransaction()
                    .hide(manager.findFragmentById(R.id.detailFragment))
                    .show(manager.findFragmentById(R.id.listFragment))
                    .commit();
        }
        else
        {
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.detailFragment))
                    .show(manager.findFragmentById(R.id.listFragment))
                    .commit();
        }
    }

    @Override
    public void onItemSelected(int index) {
        tvDetail.setText(details[index]);

        if(findViewById(R.id.layout_portrait) !=null)
        {
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.detailFragment))
                    .hide(manager.findFragmentById(R.id.listFragment))
                    .addToBackStack(null)
                    .commit();
        }

    }
}