
import java.util.Scanner;

public class Interfas_1 {

    public static void main(String[] args) {

        double x, y;
        Calculadora_v1 oper = new Calculadora_v1();
        Scanner escribir = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println(" Ingrese el primer número: ");
        x = escribir.nextDouble();
        System.out.println(" Ingrese el segundo número: ");
        y = escribir.nextDouble();
        
        System.out.println("la suma es: " + oper.sumar(x, y));
        System.out.println("la resta es: " + oper.restar(x, y));
        System.out.println("la multiplicar es: " + oper.multiplicar(x, y));
        System.out.println("la dividir es: " + oper.dividir(x, y));
    }
}