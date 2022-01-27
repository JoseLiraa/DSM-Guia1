import java.util.Scanner;

class EstructuraRepetitivaFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma =0, valor, promedio;
        for (int f=1; f <= 10; f++){
            System.out.print("Ingrese el valor "+ f + ": ");
            valor = teclado.nextInt();
            suma += valor;
        }

        System.out.print("La suma es: ");
        System.out.println(suma);
        promedio = suma / 10;
        System.out.print("El promedio es: ");
        System.out.print(promedio);
    }
}