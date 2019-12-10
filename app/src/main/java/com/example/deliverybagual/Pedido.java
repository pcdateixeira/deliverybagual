package com.example.deliverybagual;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pedido implements Serializable {
    public ArrayList<Item> items = new ArrayList<Item>();
    public Churrascaria churrascaria;
    public Date dataEntrega;
    public boolean entregaImediata;

    public void addItem(String name, int amount){
        Item i = new Item(name,amount);
        items.add(i);
    }

    public void addItem(String name){
        Item i = new Item(name);
        items.add(i);
    }

    public void removeItem(String name){
        for(Item item : items){
            if(item.getName() == name){
                items.remove(item);
            }
        }
    }

    public void setChurrascaria(Churrascaria churrascaria){
        this.churrascaria = churrascaria;
    }

    public void setDataEntrega(Date date){
        this.dataEntrega = date;
    }

    public void decreaseItemAmount(String name){
        for(Item item : items){
            if(item.getName() == name){
                item.decreaseAmount();
            }
        }
    }

    public String getInfoText() {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = format1.format(dataEntrega.getTime());

        String infoText = "Itens:\n";

        for (Item item : items) {
            infoText += item + "\n";
        }

        infoText += "\nChurrascaria:\n" + churrascaria.nome + "\n\nValor:\nR$ " + churrascaria.valor
                 +  "\n\nData de entrega:\n" + formattedDate;

        return infoText;
    }

    @NonNull
    @Override
    public String toString() {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = format1.format(dataEntrega.getTime());

        return churrascaria + "\nData de entrega: " + formattedDate;
    }
}
