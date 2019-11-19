package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaPedidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pedidos);
        this.setTitle("Pedidos");

        List<String> pedidos = new ArrayList<>(Arrays.asList("Pedido"));
        for (int i = 0; i < 30; i++) {
            pedidos.add("Pedido");
        }
        ListView listView = (ListView) findViewById(R.id.pedidos_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pedidos);
        listView.setAdapter(adapter);
    }

    public void novoPedido(View view)
    {
        Intent i = new Intent(this, AdicionarItem.class);
        //i.putExtra("data", tituloPedido.getText().toString());
        startActivity(i);
    }
}
