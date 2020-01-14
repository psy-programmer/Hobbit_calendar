package com.psyprogrammer.forward;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

/*
App by Zoia Klocheva
 */

public class MainActivity extends AppCompatActivity {
    protected Button button;
    protected CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        calendarView = findViewById(R.id.calendarView);
        button = findViewById(R.id.button);

        View.OnClickListener today = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendarView.setDate(calendarView.getDate());
            }
        };

        button.setOnClickListener(today);
    }


}
