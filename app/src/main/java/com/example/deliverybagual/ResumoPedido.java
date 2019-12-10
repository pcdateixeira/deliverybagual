package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResumoPedido extends AppCompatActivity {
    private Pedido pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resumo_pedido);

        this.pedido = (Pedido) getIntent().getSerializableExtra("pedido");

        TextView textView = findViewById(R.id.info);

        textView.setText(pedido.getInfoText());
    }

    public void confirmarPedido(View view)
    {
        Intent i = new Intent(this, Confirmacao.class);
        i.putExtra("pedido", this.pedido);
        startActivity(i);
    }
}
