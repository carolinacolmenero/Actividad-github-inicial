
import java.util.Scanner;

public class App {

    public static double sumar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public static double restar(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public static double multiplicar(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public static double dividir(double primerNumero, double segundoNumero) {
        if (segundoNumero == 0) {
            System.out.println("No se puede dividir entre cero.");
            return 0;
        }
        return primerNumero / segundoNumero;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int primerNumero, segundoNumero;
        String opcion = "";

        System.out.println("Introduce el primer número: ");
        primerNumero = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        segundoNumero = sc.nextInt();

        System.out.println("**CALCULADORA**");
        System.out.println("Elige el calculo que deseas realizar: ");
        System.out.println("- Sumar");
        System.out.println("- Restar");
        System.out.println("- Multiplicar");
        System.out.println("- Dividir");
        
        opcion = sc.next();
        opcion = opcion.toLowerCase();
        switch (opcion) {
            case "sumar":
                System.out.println(sumar(primerNumero, segundoNumero));
                break;
            case "restar":
                System.out.println(restar(primerNumero, segundoNumero));
                break;
            case "multiplicar":
                System.out.println(multiplicar(primerNumero, segundoNumero));
                break;
            case "dividir":
               System.out.println(dividir(primerNumero, segundoNumero));
                break;
            default:
                System.out.println("Operación no válida");
        }

        sc.close();

    }
}