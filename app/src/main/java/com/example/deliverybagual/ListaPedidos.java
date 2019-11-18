package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListaPedidos extends AppCompatActivity {

    private TextView tituloPedido;
    private Button botaoNovoPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pedidos);

        tituloPedido = findViewById(R.id.tituloPedidos); // ID from component
        botaoNovoPedido = findViewById(R.id.botaoNovoPedido);
    }

    public void Send(View view)
    {
        Intent i = new Intent(this, AdicionarItem.class);
        i.putExtra("data", tituloPedido.getText().toString());
        startActivity(i);
    }
}
