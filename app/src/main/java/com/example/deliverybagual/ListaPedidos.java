package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListaPedidos extends AppCompatActivity {
    ArrayAdapter<Pedido> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pedidos);
        this.setTitle(R.string.pedidos);

        adapter = new ArrayAdapter<Pedido>(this, android.R.layout.simple_list_item_1);

        ListView listView = findViewById(R.id.listaPedidos);
        final Context context = this;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(context, InformacoesPedido.class);
                Pedido pedido = adapter.getItem(position);
                intent.putExtra("pedido", pedido);
                startActivity(intent);
            }
        });

        listView.setAdapter(adapter);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Pedido pedido = (Pedido) intent.getSerializableExtra("pedido");
        if (pedido != null) {
            adapter.add(pedido);
        }
    }

    public void novoPedido(View view)
    {
        Intent i = new Intent(this, AdicionarItem.class);
        i.putExtra("pedido", new Pedido());
        startActivity(i);
    }
}
