package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AdicionarItemPorTamanho extends AppCompatActivity {
    private Pedido pedido;
    private String tipoItem;

    private TextView titulo;
    private RadioButton radioPorcaoPequena;
    private RadioButton radioPorcaoGrande;
    private Button botaoAdicionar;
    private Button botaoCarrinho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_item_por_tamanho);

        titulo = findViewById(R.id.titulo);
        radioPorcaoPequena = findViewById(R.id.radioPorcaoPequena);
        radioPorcaoGrande = findViewById(R.id.radioPorcaoGrande);
        botaoAdicionar = findViewById(R.id.botaoAdicionar);
        botaoCarrinho = findViewById(R.id.botaoCarrinho);

        this.pedido = (Pedido) getIntent().getSerializableExtra("pedido");

        this.tipoItem = getIntent().getStringExtra("tipo");

        switch(this.tipoItem) {
            case "Maminha":
                titulo.setText(R.string.maminha);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Picanha":
                titulo.setText(R.string.picanha);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Costela":
                titulo.setText(R.string.costela);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Ripa da chuleta":
                titulo.setText(R.string.chuleta);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
            case "Pernil":
                titulo.setText(R.string.maminha);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Lombo":
                titulo.setText(R.string.lombo);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Linguiça":
                titulo.setText(R.string.linguica);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Bisteca":
                titulo.setText(R.string.bisteca);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
            case "Peito":
                titulo.setText(R.string.peito);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Coxa":
                titulo.setText(R.string.coxa);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Sobrecoxa":
                titulo.setText(R.string.sobrecoxa);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Coraçãozinho":
                titulo.setText(R.string.coracao);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
            case "Polenta":
                titulo.setText(R.string.polenta);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Pão de alho":
                titulo.setText(R.string.paoalho);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Xixo":
                titulo.setText(R.string.xixo);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
                break;
            case "Salada de maionese":
                titulo.setText(R.string.maionese);
                radioPorcaoPequena.setText(R.string.porcaopequena);
                radioPorcaoGrande.setText(R.string.porcaogrande);
        }
        titulo.setVisibility(View.VISIBLE);
        radioPorcaoPequena.setVisibility(View.VISIBLE);
        radioPorcaoGrande.setVisibility(View.VISIBLE);
    }

    public void adicionaItem(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton selectedButton = (RadioButton) findViewById(selectedId);
        CharSequence tamanhoItem = selectedButton.getText();

        this.pedido.addItem(tipoItem + ", " + tamanhoItem);

        Intent i = new Intent(this, Carrinho.class);
        i.putExtra("pedido", this.pedido);
        startActivity(i);
    }

    public void verCarrinho(View view)
    {
        Intent i = new Intent(this, Carrinho.class);
        i.putExtra("pedido", this.pedido);
        startActivity(i);
    }
}
