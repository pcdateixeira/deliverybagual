package com.example.deliverybagual;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Item implements Serializable {
    private String name;
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String item) {
        this.name = item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void decreaseAmount(){
        if(this.amount > 0){
            this.amount--;
        }
    }


    Item(String item_name, int amount){
        this.name = item_name;
        this.amount = amount;
    }

    Item(String item_name){
        this.name = item_name;
        this.amount = 1;
    }


    @NonNull
    @Override
    public String toString() {
        return name + "\n" + amount;
    }
}
