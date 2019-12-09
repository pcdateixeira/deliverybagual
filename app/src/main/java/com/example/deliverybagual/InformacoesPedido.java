package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InformacoesPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacoes_pedido);

        Pedido pedido = (Pedido) getIntent().getSerializableExtra("pedido");

        TextView textView = findViewById(R.id.info);

        textView.setText(pedido.getInfoText());
    }
}
