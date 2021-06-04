package com.myapplicationdev.android.demonavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NewActivity extends AppCompatActivity implements View.OnClickListener {

    private ActionBar ab;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ab = getSupportActionBar();
        fab = findViewById(R.id.add_fab);
        fab.setOnClickListener(this::onClick);

        // Displays the Arrow Button / Icon in the Action Bar
        ab.setDisplayHomeAsUpEnabled(true);

        // The Back Arrow Button will go back to the previous activity
        // (1) Put Parent Activity of this Activity as Main Activity in the manifest file
        // (2) Implement onOptionsItemSelected method

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_fab:
                Toast.makeText(
                        this, "You clicked the add floating action button", Toast.LENGTH_SHORT).show();
        }
    }

}