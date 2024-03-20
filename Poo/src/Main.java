import java.util.Scanner;

public class Main {
    public static double suma(double x, double y) {
        return x + y;
    }

    public static double resta(double x, double y) {
        return x - y;
    }

    public static double multiplicar(double x, double y) {
         return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        double x, y, resultado;

        do {
            System.out.println("\n\tCalculadora de operaciones basicas");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    x = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    y = scanner.nextInt();
                    resultado = suma(x, y);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    x = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    y = scanner.nextInt();
                    resultado = resta(x, y);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    x = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    y = scanner.nextInt();
                    resultado = multiplicar(x, y);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    x = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    y = scanner.nextInt();
                    if (y != 0) {
                        resultado = division(x, y);
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("La division no puede realizarse. ");
                    }
                    break;
            }

        } while (opcion != 5);
    }
}