package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carrinho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrinho);

        List<String> itens = new ArrayList<>(Arrays.asList("Item"));
        for (int i = 0; i < 30; i++) {
            itens.add("Item");
        }
        ListView listView = findViewById(R.id.listaItens);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
        listView.setAdapter(adapter);
    }

    public void adicionarMaisItens(View view)
    {
        Intent i = new Intent(this, AdicionarItem.class);
        //i.putExtra("data", tituloPedido.getText().toString());
        startActivity(i);
    }

    public void agendarEntrega(View view)
    {
        Intent i = new Intent(this, AgendarEntrega.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                //.setTitle("Closing Activity")
                .setMessage(R.string.desejacancelarpeiddo)
                .setPositiveButton(R.string.cancelarpeiddo, new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Carrinho.this, ListaPedidos.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(i);
                        finish();
                    }

                })
                .setNegativeButton(R.string.continuar, null)
                .show();
    }
}
