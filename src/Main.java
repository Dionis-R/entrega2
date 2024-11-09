//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int filas =0;
        char x = 'D';
        int i = 0;
        int j=0;
        char [] []matriz =new char [8][8];

            for ( i = 0; i < matriz.length; i++) {
                for(j=0;j<matriz[i].length;j++) {
                    if ((i % 2 == 0) &&(j %2==0)) {
                        matriz[i][j] = x;
                    }else if((i%2!=0) && (j%2!=0)) {
                        matriz[i][j] = x;

                    }
                    System.out.print(matriz[i][j]);

                }
                    System.out.println();

            }


    }
}