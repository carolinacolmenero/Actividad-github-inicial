
import java.util.Scanner;
 
public class App {
 
 
    public static void main(String[] args) {
        // Hacer un bucle que le pida al usuario dos números y una operación
        // (sumar, restar, multiplicar, dividir)
        // podéis hacerlo ofreciendo opciones numéricas 
        // (1. Sumar / 2. Restar / 3. Multiplicar / 4.Dividir)
        // Muestra por pantalla el resultado
        // Vuelve al comienzo del bucle
 

        // Ejemplo para llamar a una función:
        // System.out.println("Resultado: " + sumar(primerNumero, segundoNumero));

        Scanner sc = new Scanner(System.in);
        int primerNumero, segundoNumero;
        boolean bucle = true;

        while(bucle == true){
            System.out.println("Introduce el primer número: ");
            primerNumero = sc.nextInt();

            System.out.println("Introduce el segundo número: ");
            segundoNumero = sc.nextInt();

            
        }
        
    }
 
}
 