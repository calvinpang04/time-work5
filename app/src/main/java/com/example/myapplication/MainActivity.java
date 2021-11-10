package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btt;
    private EditText y;
    private EditText m;
    private EditText d;
    private EditText h;
    private EditText mi;
    private EditText s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        y=(EditText) findViewById(R.id.num1);
        m=(EditText) findViewById(R.id.editTextNumber2);
        d=(EditText) findViewById(R.id.editTextNumber3);
        h=(EditText) findViewById(R.id.editTextNumber4);
        mi=(EditText) findViewById(R.id.editTextNumber5);
        s=(EditText) findViewById(R.id.editTextNumber6);
        btt=(Button) findViewById(R.id.button);
        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tt4=(TextView) findViewById(R.id.textView);
                tt4.setText(y.getText()+"/"+m.getText()+"/"+d.getText()+"   "+h.getText()+":"+mi.getText()+":"+s.getText());
            }
        });
    }
}