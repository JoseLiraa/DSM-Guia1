import java.util.Scanner;

class StructuraCondicionalSimple1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float sueldo;
        System.out.println("Ingrese el sueldo: ");
        sueldo = teclado.nextFloat();
        if (sueldo > 3000) {
            System.out.println("Esta persona debe abonar impuestos");
        }
    }
}