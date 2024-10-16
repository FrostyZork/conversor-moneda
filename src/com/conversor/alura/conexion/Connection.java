package com.conversor.alura.conexion;

import com.conversor.alura.modelos.MonedaExchange;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {

    private String API_KEY = "27356ee5b7eace9ce9ce6331";
    private String URL_1 = "https://v6.exchangerate-api.com/v6/";
    private String URL_2 = "/pair/";
    private Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

    public MonedaExchange buscarMoneda(String moneda1, String moneda2, double cantidad) throws IOException, InterruptedException {
        String direccion = URL_1 + API_KEY + URL_2 + moneda1 + "/" + moneda2 + "/" + cantidad;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println("Respuesta JSON: " + json);

        return gson.fromJson(json, MonedaExchange.class);

    }


}
