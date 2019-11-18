package com.example.a2atividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editText1); // ID from component
        button1 = findViewById(R.id.button1);
    }

    public void Send(View view)
    {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("data", et1.getText().toString());
        startActivity(i);
    }
}
