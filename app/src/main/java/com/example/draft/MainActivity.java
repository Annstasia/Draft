package com.example.draft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Aunteficator aunteficator = new Aunteficator(MainActivity.this);
        int state = aunteficator.line;
        Toast.makeText(this, "state="+state, Toast.LENGTH_LONG).show();
        if (state == 0){
            aunteficator.authIN();
        }
    }
}
