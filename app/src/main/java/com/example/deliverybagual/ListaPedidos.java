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
import java.util.List;

public class ListaPedidos extends AppCompatActivity {
    private int num_pedidos = 5;
    public Pedidos pedidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pedidos);
        this.setTitle(R.string.pedidos);


        List<String> pedidos_mock = new ArrayList<>(Arrays.asList("Pedido"));
        for (int i = 0; i < num_pedidos; i++) {
            pedidos_mock.add("Pedido");
        }

        ArrayAdapter<String> adapter;

        try {
            Pedido p = (Pedido) getIntent().getSerializableExtra("pedido");
            if (p != null) {
                pedidos.addPedido(p);
            }

            List<String> l = new ArrayList<>();

            for(Pedido ped : pedidos.pedidoList){
                l.add(ped.getDeliverInfo());
            }
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, l);
        }
        catch (NullPointerException e) {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pedidos_mock);
        }


        ListView listView = findViewById(R.id.listaPedidos);
        final Context context = this;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(context, InformacoesPedido.class);
                startActivity(intent);
            }
        });

        listView.setAdapter(adapter);
    }

    public void novoPedido(View view)
    {
        Intent i = new Intent(this, AdicionarItem.class);
        startActivity(i);
    }
}
