//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int filas =0;

        char [][] matriz =new char [8][8];

        for (int i=0;i < matriz.length;i++) {
            System.out.print(matriz[filas][i]);

            for (int j = 0; j < matriz[filas].length; j++) {
                System.out.print(matriz[j][i]);

            }
            System.out.println();
        }
        System.out.println();
    }
}