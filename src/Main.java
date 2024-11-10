import java.util.Scanner;                       //importando la clase Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int i = 0;                                        //declaracion indice filas
        int j=0;                                          //declaracion indice columas
        String mensaje= "introduce el caracter que quieres \n" +
                " que aparezca en el tablero";

       final char [] []matriz =new char [8][8];           //declaracion de matriz v
                                                          // con constante.

        System.out.println(mensaje);
        Scanner inputx =new Scanner(System.in);           //leyendo el caracter desde teclado
        char x =inputx.next().charAt(0);                  //usamos la funcion next indicando
                                                          //que solo queremos la posicion 0.


            for ( i = 0; i < matriz.length; i++) {        //bucle for para las filas
                for(j=0;j<matriz[i].length;j++) {         //bucle for para las columnas
                    if ((i % 2 == 0) &&(j %2==0)) {       //usamos el modulo para diferenciar entre fila y columna par de las que no lo son
                        matriz[i][j] = x;                 //sustituimos con el valor char la fila y la columna que son par con el caracter dado en el scanner
                    }else if((i%2!=0) && (j%2!=0)) {      //usamos el modulo para definir las filas y columnas que son impares.
                        matriz[i][j] = x;                 //sustituimos la fila y la columna que son impares con el caracter leido desde teclado

                    }
                    System.out.print(matriz[i][j]);

                }
                    System.out.println();

            }


    }
}