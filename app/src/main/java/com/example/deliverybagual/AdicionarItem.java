package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AdicionarItem extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_item);
        tv1 = findViewById(R.id.textView1);
        String texto = getIntent().getStringExtra("data");
        tv1.setText(texto);
    }
}
