package com.conversor.alura.modelos;

import com.google.gson.annotations.SerializedName;

public class Moneda {

    @SerializedName("base_code")
    private String moneda1;
    @SerializedName("target_code")
    private String moneda2;
    @SerializedName("conversion_result")
    private double cantidad;

    public Moneda(MonedaExchange monedaExchange) {

        this.moneda1 = monedaExchange.base_code();
        this.moneda2 = monedaExchange.target_code();
        this.cantidad = monedaExchange.conversion_result();

    }

    public String getMoneda1() {
        return moneda1;
    }

    public String getMoneda2() {
        return moneda2;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "La cantidad de " + moneda1 +
                " es equivalente a " + cantidad +
                " " + moneda2;
    }
}
