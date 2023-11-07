package com.example.fibonanciproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView show_count;
    private int count = 1;
    private long fibNMinus = 1;
    private long fibNMinus2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show_count = findViewById(R.id.show_count);
    }
    public void countTop(View view){
        if (count == 0) {
            show_count.setText("0");
        }else if (count ==1 ){
            show_count.setText("1");
        }else {
            long fibCurrent = fibNMinus + fibNMinus2;
            fibNMinus2 = fibNMinus;
            fibNMinus = fibCurrent;
            show_count.setText(String.valueOf(fibCurrent));
        }
        count++;
    }
}