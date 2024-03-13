package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num2 = findViewById(R.id.num2);
        num1 = findViewById(R.id.num1);
        add=findViewById(R.id.button);
    }
    public void sum(View view){
        int i= Integer.parseInt(num1.getText().toString());
        int j=Integer.parseInt(num2.getText().toString());
        int k=i+j;
        Toast.makeText(this, "Addition :"+k+"ok ka mng", Toast.LENGTH_SHORT).show();
    }
}