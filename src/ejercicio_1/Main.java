package ejercicio_1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor entre el 0 y 10");
        int num = sc.nextInt();

        while (num < 0 || num > 10) {
            System.out.println("Debes introducir un valor entre el 0 y 10");
            num = sc.nextInt();
        }
    }
}
