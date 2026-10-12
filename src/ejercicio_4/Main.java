import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce la cantidad de chicos: ");
    int chicos = scanner.nextInt();


    Scanner scaner =  new Scanner(System.in);
    System.out.println("Introduce la cantidad de chicas: ");
    int chicas = scaner.nextInt();

    int total = chicas + chicos;
    System.out.println("El total de alumnos es: " + total);

    double porcentajeChicas = (double) chicas /total * 100;
    double porcentajeChicos = (double)chicos/ total * 100;

    System.out.println("El porcentaje de chicos es: " + porcentajeChicos + "%");
    System.out.println(("El porcentaje de chicas es:" + porcentajeChicas + "%"));
}
