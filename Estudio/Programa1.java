package Estudio;

public class Programa1 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo :3");

        //creando una matriz de dos dimensiones, para hacer calculos donde debe escribir cada caracter
        for (int i=0; i<6; i++) {
            for (int j=0; j<7; j++) {
                if ((i==0 && j%3 != 0)||(i==1 && j%3==0)||(i-j == 2 || i+j == 8 )) {
                System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("  ");
            System.out.println();
        }
        
    }
    //*Version 1.0 creo que se puede simplificar mas con una matriz (array) en int [][] :) */
}
