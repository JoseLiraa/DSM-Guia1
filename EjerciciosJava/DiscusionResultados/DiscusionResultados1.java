import java.util.Scanner;

class NumerosDivisibles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, modulo;

        System.out.println("Ingrese el primer valor: ");
        num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        num2 = teclado.nextInt();

        modulo = num1 % num2;
        if(modulo == 0){
            System.out.println("Los numeros " +num1+ " y " +num2+ " SON divisibles entre si");
        }
        else {
            System.out.println("Los numeros " + num1 + " y " + num2 + " NO son divisibles entre si");
        }
    }
}