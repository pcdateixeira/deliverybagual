package com.example.deliverybagual;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;

public class Pedido implements Serializable {
    public ArrayList<Item> items = new ArrayList<Item>();
    public String churrascaria;
    public String preco;
    public int anoDaEntrega=-1;
    public int mesDaEntrega=-1;
    public int diaDaEntrega=-1;
    public int horaDaEntrega=-1;
    public int minutoDaEntrega=-1;

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

    public void setChurrascaria(String churrascaria){
        this.churrascaria = churrascaria;
    }

    public void setPreco(String preco){
        this.preco = preco;
    }

    public void setTimeInfo(int ano, int mes, int dia, int hora, int minuto){
        this.anoDaEntrega = ano;
        this.mesDaEntrega = mes;
        this.diaDaEntrega = dia;
        this.horaDaEntrega = hora;
        this.minutoDaEntrega = minuto;
    }

    public void decreaseItemAmount(String name){
        for(Item item : items){
            if(item.getName() == name){
                item.decreaseAmount();
            }
        }
    }

    public String getInfoText() {
        String infoText = "Itens:\n";

        for (Item item : items) {
            infoText += item + "\n";
        }

        infoText += "\nChurrascaria:\n" + churrascaria + "\n\nValor:\nR$ " + preco;

        return infoText;
    }

    @NonNull
    @Override
    public String toString() {
        return horaDaEntrega + ":" + minutoDaEntrega + " - " +
                diaDaEntrega + "/" + mesDaEntrega + "/" + anoDaEntrega +
                churrascaria;
    }
}
