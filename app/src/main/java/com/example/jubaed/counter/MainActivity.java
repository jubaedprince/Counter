package com.example.jubaed.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView outputView;
    Button incrementButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton = (Button) findViewById(R.id.incrementButton);
        outputView = (TextView) findViewById(R.id.outputView);
    }

    public void increment(View view){
        outputView.setText(Integer.parseInt(outputView.getText().toString())+1+"");
    }
}
