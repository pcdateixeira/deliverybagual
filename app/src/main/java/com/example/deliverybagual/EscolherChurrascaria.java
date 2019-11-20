package com.example.deliverybagual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EscolherChurrascaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escolher_churrascaria);

        List<String> churrascarias = new ArrayList<>(Arrays.asList(
                "Churrascaria A",
                "Churrascaria B",
                "Churrascaria C",
                "Churrascaria D"));

        ListView listView = findViewById(R.id.listaChurrascarias);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, churrascarias);
        listView.setAdapter(adapter);
    }
}
