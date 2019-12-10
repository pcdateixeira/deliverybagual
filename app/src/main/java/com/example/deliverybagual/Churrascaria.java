package com.example.deliverybagual;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Churrascaria implements Serializable {
    public String nome;
    public String valor;

    public Churrascaria(String nome, String valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @NonNull
    @Override
    public String toString() {
        return this.nome + "\n" + "Valor: R$ " + this.valor;
    }
}
