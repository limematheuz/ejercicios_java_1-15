package ejercicio_3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("La figura esta en buen estado? 1. si/ 2. no");
        int estado = sc.nextInt();

        System.out.println("Cual es el precio de la figura?");
        double precioAntes = sc.nextDouble();
        double precioDespues = 0;

        switch (estado) {
            case 1:
                precioDespues = precioAntes * 1.25;
                System.out.println("El precio de la figura es: " + precioDespues);
                break;
            case 2:
                precioDespues = precioAntes * 1.10;
                System.out.println("El precio de la figura es: " + precioDespues);
                break;
            default:
                System.out.println("No se permite otro numero");
        }
    }
}
