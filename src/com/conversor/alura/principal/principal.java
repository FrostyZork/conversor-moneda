package com.conversor.alura.principal;

import com.conversor.alura.conexion.Connection;
import com.conversor.alura.modelos.FileManager;
import com.conversor.alura.modelos.Moneda;
import com.conversor.alura.modelos.MonedaExchange;
import com.conversor.alura.modelos.MonedaManager;

import java.io.IOException;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Connection conexion =  new Connection();
        MonedaManager monedaManager = new MonedaManager();

        System.out.println("Escriba la moneda principal que desea convertir: ");
        var moneda1 = scanner.nextLine();
        System.out.println("Escriba la moneda hacia la que va a convertir: ");
        var moneda2 = scanner.nextLine();
        System.out.println("Cual es la cantidad de " + moneda1 + " que desea convertir?");
        var cantidad = scanner.nextDouble();

        MonedaExchange monedaExchange = conexion.buscarMoneda(moneda1, moneda2, cantidad);
        if (monedaExchange != null) {
            Moneda moneda = monedaManager.convertirMoneda(monedaExchange);
            monedaManager.agregarMoneda(moneda);
        }
    }
}
