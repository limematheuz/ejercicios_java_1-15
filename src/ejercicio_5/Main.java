package ejercicio_5;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double precioGranCalifornia = 73490;
        double precioCamperFullEquip = 93490;
        double perdidaPorKm = 0.0000001;

        System.out.println("Que coche quieres?");

        switch (sc.next()){
            case "1":
                precioGranCalifornia = precioGranCalifornia * perdidaPorKm;
                break;
            case "2":
                precioCamperFullEquip = precioCamperFullEquip * perdidaPorKm;
                break;
            default:

        }

        System.out.println("Cuantos km ha recorrido?");
        double kmRecorridos = sc.nextDouble();

        double valorPerdido = precioGranCalifornia * kmRecorridos * perdidaPorKm;

        System.out.println("El valor perdido es de: " + Math.round(valorPerdido * 100.0)/100.0 + " €");

        double precioFinal = precioGranCalifornia - valorPerdido;
        System.out.println("El precio final es de: " + Math.round(precioFinal * 100.0)/100.0 + "€");
    }
}
