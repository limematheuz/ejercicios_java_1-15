package ejercicio_2;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double descuento = 0.2;

        System.out.println("Eres VIP? 1.si / 2.no");
        int vip = sc.nextInt();

        System.out.println("Cuanto has pagado?");
        double monto = sc.nextDouble();
        double total = monto - (monto * descuento);

        if (vip == 1 || monto >= 200){
            System.out.println("Recibes el descuent del 20%, el total a pagar es: " + total);
        }

    }
}

