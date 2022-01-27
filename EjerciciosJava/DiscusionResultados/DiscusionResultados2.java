import java.util.Scanner;

class NotasAlumnos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int sumaMayores =0, sumaMenores=0, valor;

        for (int f=1; f <= 10; f++){
            System.out.print("Ingrese la nota "+ f + ": ");
            valor = teclado.nextInt();
            if(valor >= 7){
                sumaMayores++;
            }
            else{
                sumaMenores++;
            }
        }

        System.out.print("La cantidad de alumnos con nota mayor o igual a 7 son: ");
        System.out.println(sumaMayores);
        System.out.print("La cantidad de alumnos con nota menor a 7 son: ");
        System.out.println(sumaMenores);
    }
}