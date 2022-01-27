import java.util.Scanner;

class Coordenadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int coordenadaX, coordenadaY, puntos=0;
        int primerCuadrante=0, sugundoCuadrante=0, tercerCuadrante=0, cuartoCuadrante=0;
        int banderax, banderay;

        System.out.print("Ingrese la cantidad de puntos a procesar: ");
        puntos = teclado.nextInt();

        for (int f=1; f <= puntos; f++){
            System.out.print("Ingrese la coordenada X del punto "+ f + ": ");
            coordenadaX = teclado.nextInt();
            System.out.print("Ingrese la coordenada Y del punto "+ f + ": ");
            coordenadaY = teclado.nextInt();

            //Se analiza si los valores de  'x' y 'y' son positivos o negativos
            if(coordenadaX >= 0){
                banderax=1;
            }
            else{
                banderax=0;
            }
            if(coordenadaY >= 0){
                banderay=1;
            }
            else{
                banderay=0;
            }

            //Se identifica el cuadrente
            if(banderax == 1 && banderay == 1){
                primerCuadrante++;
            }else if(banderax == 0 && banderay == 0 ){
                tercerCuadrante++;
            }else if(banderax == 1 && banderay == 0 ){
                cuartoCuadrante++;
            }else if(banderax == 0 && banderay == 1 ){
                sugundoCuadrante++;
            }
        }
        System.out.println("La cantidad de puntos en el PRIMER cuadrante son: " +primerCuadrante);
        System.out.println("La cantidad de puntos en el SEGUNDO cuadrante son: " +sugundoCuadrante);
        System.out.println("La cantidad de puntos en el TERCERO cuadrante son: " +tercerCuadrante);
        System.out.println("La cantidad de puntos en el CUARTO cuadrante son: " +cuartoCuadrante);
    }
}