package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AgendarEntrega extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private Pedido pedido;

    Calendar calendar = Calendar.getInstance();
    private DatePicker datePicker;
    private TimePicker timePicker;
    private CheckBox entregaImediata;
    private Button proximo;

    private int anoDaEntrega=-1;
    private int mesDaEntrega=-1;
    private int diaDaEntrega=-1;
    private int horaDaEntrega=-1;
    private int minutoDaEntrega=-1;

    View.OnClickListener first_radio_listener = new View.OnClickListener(){
        public void onClick(View v) {
            timePicker.setEnabled(!timePicker.isEnabled());
            datePicker.setEnabled(!datePicker.isEnabled());
            if(!timePicker.isEnabled()){
                timePicker.setVisibility(View.GONE);
                datePicker.setVisibility(View.GONE);
            } else{
                timePicker.setVisibility(View.VISIBLE);
                datePicker.setVisibility(View.VISIBLE);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agendar_entrega);

        this.pedido = (Pedido) getIntent().getSerializableExtra("pedido");

        entregaImediata = (CheckBox) findViewById(R.id.entregaImediata);
        entregaImediata.setVisibility(View.VISIBLE);
        entregaImediata.setOnClickListener(first_radio_listener);
        proximo = (Button) findViewById(R.id.botaoProximo2);
        proximo.setVisibility(View.VISIBLE);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        // Gets the date from the user.
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);

        anoDaEntrega = year;
        mesDaEntrega = month;
        diaDaEntrega = dayOfMonth;
    }



    public void irParaPedidos(View view){

        this.pedido.setDataEntrega(calendar.getTime());
        this.pedido.entregaImediata = entregaImediata.isChecked();

        Intent i = new Intent(this, EscolherChurrascaria.class);
        i.putExtra("pedido", this.pedido);
        startActivity(i);
    }
}
