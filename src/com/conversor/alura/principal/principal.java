package com.conversor.alura.principal;

import com.conversor.alura.conexion.Connection;

import java.io.IOException;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Connection conexion =  new Connection();

        System.out.println("Escriba la moneda que desea utilizar");
        var moneda = scanner.nextLine();
        conexion.buscarMoneda(moneda);
    }
}
