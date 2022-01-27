import java.util.Scanner;

class EstructuraRepetitivaDoWhile2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0, cant = 0, valor, promedio;

        do {
            System.out.print("Ingrese un valor (0 para finalizar): ");
            valor = teclado.nextInt();
            if(valor != 0){
                suma += valor;
                cant++;
            }
        }
        while (valor != 0);
        if (cant != 0) {
            promedio = suma / cant;
            System.out.print("El promedio de los valores ingresado es: ");
            System.out.print(promedio);
        }
        else {
            System.out.print("No se ingresaron valores");
        }
    }
}