package com.example.deliverybagual;

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
        Intent i = new Intent(this, EscolherChurrascaria.class);
        startActivity(i);
    }
}
