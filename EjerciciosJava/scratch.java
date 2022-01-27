class Vehiculo {
    int pasajeros;
    int capacidad;
    int mpg;
}
class Scratch {
    public static void main(String[] args) {
        //AppCompatActivity
        Vehiculo minivan = new Vehiculo();
        Vehiculo sportcar = new Vehiculo();
        int rango1, rango2;

        minivan.pasajeros = 9;
        minivan.capacidad = 15;
        minivan.mpg = 20;

        sportcar.pasajeros = 10;
        sportcar.capacidad = 25;
        sportcar.mpg = 30;

        rango1 = minivan.capacidad * minivan.mpg;
        rango2 = sportcar. capacidad * sportcar.mpg;

        System.out.println("La Minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango1 + " millas");
        System.out.println("El sportcar puede llevar " + sportcar.pasajeros + " pasajeros con un rango de " + rango2 + " millas");
    }
}