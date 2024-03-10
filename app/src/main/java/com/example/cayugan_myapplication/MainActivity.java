package com.example.cayugan_myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myTitle;
    TextView myName;
    TextView myDisplay;
    EditText myInput;
    Button myClick;
    Button myClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myName = findViewById(R.id.txtName);
        myDisplay = findViewById(R.id.txtDisplay);
        myClick = findViewById(R.id.btnClick);
        myClear = findViewById(R.id.btnClear);
        myInput = findViewById(R.id.txtInputName);
//myDisplay.setText("HELLO POGI!");
        myClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = myInput.getText().toString();
                myDisplay.setText("HELLO "+name+"!");
            }
        });
        myClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDisplay.setText("HELLO WORLD!");
            }
        });
    }
}