
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int operacion;
        double resultado,val1,val2;


        System.out.println();
        do {

            System.out.println("Daniel Alejandro Castellanos Rodriguez");
            System.out.println("202200176");
            System.out.println();

            Scanner op = new Scanner(System.in);
            System.out.println("¡¡¡Bienvenido a la calculadora!!!");
            System.out.println("Digite el primer valor a valuar");
            val1 = op.nextInt();
            System.out.println("Digite el segundo valor a valuar");
            val2 = op.nextInt();

            System.out.println("------------------------------------------------");
            System.out.println("                  CAlCULADORA");
            System.out.println("------------------------------------------------");
            System.out.println("- Presione 1 realizar una suma (+)");
            System.out.println("- Presione 2 realizar una resta (-)");
            System.out.println("- Presione 3 realizar una multiplicación (*)");
            System.out.println("- Presione 4 realizar una división (/)");
            System.out.println("¿Qué desea hacer?");
            operacion = leer.nextInt();




            switch (operacion) {
                case 1:
                    resultado = val1 + val2;
                    System.out.println("-------------------------------------------");
                    System.out.println("El resultado solicitado es  " + resultado);
                    System.out.println("-------------------------------------------");
                    break;
                case 2:
                    resultado = val1 - val2;
                    System.out.println("-------------------------------------------");
                    System.out.println("El resultado solicitado es  " + resultado);
                    System.out.println("-------------------------------------------");
                    break;
                case 3:
                    resultado = val1 * val2;
                    System.out.println("-------------------------------------------");
                    System.out.println("El resultado solicitado es  " + resultado);
                    System.out.println("-------------------------------------------");
                    break;
                case 4:
                    resultado = val1 / val2;
                    System.out.println("-------------------------------------------");
                    System.out.println("El resultado solicitado es  " + resultado);
                    System.out.println("-------------------------------------------");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }

        } while (operacion != 5);

    }
}