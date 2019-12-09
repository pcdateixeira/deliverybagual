package com.example.deliverybagual;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class Pedidos implements Serializable {
    private static Pedidos pedidos = new Pedidos();

    public ArrayList<Pedido> pedidoList = new ArrayList<Pedido>();

    private Pedidos(){

    }

    public void addPedido(Pedido p){
        this.pedidoList.add(p);
    }
}
