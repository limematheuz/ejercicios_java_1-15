package ejercicio_11;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0.0;
        double promedio = 0.0;
        System.out.println("INICIO DEL PROGRAMA: CALCULO DE NOTAS");

//        for (int i = 0; i <= 3; i++) {
//            System.out.println("Introduce la nota de Ejercicios Entregables");
//            double nota = sc.nextDouble();
//
//            suma = suma + nota;
//        }
//        promedio = suma / 4;
//        System.out.println("El promedio es: " + promedio);


        for (int i = 1; i <= 4; i++){
            String asignatura = "";
            double porcentaje = 0.0;
            double nota = 0.0;
            switch(i){
                case 1:
                    asignatura = "Exercicis entregables: ";
                    porcentaje = 0.1;
                    break;
                case 2:
                    asignatura = "POUs avaluables: ";
                    porcentaje = 0.2;
                    break;
                case 3:
                    asignatura = "Pràctica final: ";
                    porcentaje = 0.4;
                    break;
                case 4:
                    asignatura = "Examen final: ";
                    porcentaje = 0.3;
                    break;
            }
            System.out.println("Introduce la nota " + asignatura);
            nota = sc.nextDouble();
            promedio = promedio + (nota * porcentaje);
        }
        System.out.println("El promedio de la nota es: " + promedio);
    }
}
