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

public class EscolherChurrascaria extends AppCompatActivity {
    private Pedido pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escolher_churrascaria);

        this.pedido = (Pedido) getIntent().getSerializableExtra("pedido");

        List<Churrascaria> churrascarias = new ArrayList<>(Arrays.asList(
                new Churrascaria("Churrascaria A", "60,00"),
                new Churrascaria("Churrascaria B", "50,00"),
                new Churrascaria("Churrascaria C", "65,00"),
                new Churrascaria("Churrascaria D", "55,00")));

        ListView listView = findViewById(R.id.listaChurrascarias);

        final ArrayAdapter<Churrascaria> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, churrascarias);
        listView.setAdapter(adapter);

        final Context context = this;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Churrascaria churrascaria = adapter.getItem(position);
                pedido.setChurrascaria(churrascaria);

                Intent intent = new Intent(context, ResumoPedido.class);
                intent.putExtra("pedido", pedido);
                startActivity(intent);
            }
        });
    }
}
