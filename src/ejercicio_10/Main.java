package ejercicio_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas ventas ha hecho??");
        // int numVentas;
        int numVentas = sc.nextInt();

        System.out.println("Cuanto cobras??");
        //int sueldoBase;
        int sueldoBase = sc.nextInt();

        int ventaTotal = 0;

        // y por aqui tambien

        for (int i = 0; i < numVentas; i++) {
            System.out.println("venta numero " + i + ":");
            int valor;
            valor = sc.nextInt();


            // ventaTotal = ventaTotal + valor;
            ventaTotal += valor;
        }

        float beneficios = 0.1f * ventaTotal;
        float ganancia = sueldoBase + beneficios;

        // hago un cambio

        System.out.println("Has ganado: " + ganancia);
    }

}
