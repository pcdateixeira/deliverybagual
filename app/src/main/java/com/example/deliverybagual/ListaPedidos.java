package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaPedidos extends AppCompatActivity {
    private int num_pedidos = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pedidos);
        this.setTitle(R.string.pedidos);

        List<String> pedidos = new ArrayList<>(Arrays.asList("Pedido"));
        for (int i = 0; i < num_pedidos; i++) {
            pedidos.add("Pedido");
        }
        ListView listView = findViewById(R.id.listaPedidos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pedidos);
        listView.setAdapter(adapter);
    }

    public void novoPedido(View view)
    {
        Intent i = new Intent(this, AdicionarItem.class);
        startActivity(i);
    }
}
