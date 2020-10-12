package com.example.studentwsb.kalkulatorwalut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void przelicz(View view){
        EditText editText = findViewById(R.id.editText);
        String kwotaString = editText.getText().toString();
        double kwotaDouble = Double.parseDouble(kwotaString);
        double dolaryDouble = kwotaDouble * 0.260839;
        String dolaryString = String.format("%.2f",dolaryDouble);
        Toast.makeText(this, dolaryString + " $", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
