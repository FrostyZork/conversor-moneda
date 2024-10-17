package com.conversor.alura.modelos;

import java.util.ArrayList;
import java.util.List;

public class MonedaManager {

    private List<Moneda> monedas = new ArrayList<>();

    public Moneda convertirMoneda(MonedaExchange monedaExchange){

        Moneda moneda = new Moneda(monedaExchange);
        System.out.println("Moneda convertida: " + moneda);
        return moneda;
    }

    public void agregarMoneda(Moneda moneda) {

        monedas.add(moneda);
    }

    public List<Moneda> getMonedas(){
        return monedas;
    }
}
