import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, pares = 0, impares=0;

        do {
            System.out.print("Ingrese un numero entero (0 para finalizar): ");
            numero = teclado.nextInt();
            if(numero % 2 == 0){
                if(numero != 0) {
                    pares++;
                }
            }
            else{
                impares++;
            }
        }
        while (numero != 0);
        System.out.println("La cantidad de numeros PARES ingresados es: "+pares);
        System.out.println("La cantidad de numeros IMPARES ingresados es: "+impares);

    }
}