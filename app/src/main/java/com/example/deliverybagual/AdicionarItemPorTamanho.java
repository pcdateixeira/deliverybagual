package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AdicionarItemPorTamanho extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_item_por_tamanho);
        tv1 = findViewById(R.id.textView1);
        String texto = getIntent().getStringExtra("tipo");
        tv1.setText(texto);
    }
}
