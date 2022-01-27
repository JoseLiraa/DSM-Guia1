import java.util.*;

class Ejemplo1 {
    public static void main(String[] args) {
        //Creando objeto de la clase Scanner
        Scanner in = new Scanner(System.in);
        //obtener el primer dato
        System.out.println("¿Como te llamas? ");
        String nombre = in.nextLine();

        //obtener el segundo dato
        System.out.println("¿Cuantos años tienes? ");
        int edad = in.nextInt();

        //mostrar el resultado en la consola
        System.out.println("Hola, " + nombre + ". El año que viene tendrás " + (edad + 1) + " años");
    }
}