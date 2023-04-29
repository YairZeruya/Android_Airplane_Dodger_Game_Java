package com.example.hw1.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hw1.Fragments.RecordFragment;
import com.example.hw1.Fragments.MapFragment;
import com.example.hw1.R;

public class RecordsActivity extends AppCompatActivity {
    private RecordFragment recordsFragment;
    private MapFragment mapFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.records_screen);
        initFragments();
        beginTransactions();
    }

    private void beginTransactions() {
        getSupportFragmentManager().beginTransaction().add(R.id.main_FRAME_records, recordsFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.main_FRAME_map, mapFragment).commit();
    }

    private void initFragments() {
        recordsFragment = new RecordFragment();
        mapFragment = new MapFragment();
    }
}