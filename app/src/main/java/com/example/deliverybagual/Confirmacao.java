package com.example.deliverybagual;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Confirmacao extends AppCompatActivity {
    private TextView message;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmacao);
        this.setTitle(R.string.confirmacaoDoPedido);
        TextView title = (TextView) findViewById(R.id.confirmationTitle);
        title.setVisibility(View.VISIBLE);
        message = findViewById(R.id.message);
        message.setVisibility(View.VISIBLE);
        Button b = (Button) findViewById(R.id.confirmationButton);
        b.setVisibility(View.VISIBLE);
    }

    public void finalizaPedido(View view){
        Intent i = new Intent(this, ListaPedidos.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Pedido p = new Pedido();
        p.addItem("Carne");
        p.setChurrascaria("Churrascaria1");
        p.setTimeInfo(1,1,1,1,1);
        i.putExtra("pedido", p);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, ListaPedidos.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Pedido p = new Pedido();
        i.putExtra("pedido", p);
        startActivity(i);
    }
}
