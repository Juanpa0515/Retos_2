import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {

        char[][] calculadora = new char[4][4];
        
        calculadora[0]=new char[] {'7','8','9','x'};
        calculadora[1]=new char[] {'4','5','6','-'};
        calculadora[2]=new char[] {'1','2','3','+'};
        calculadora[3]=new char[] {'0','.','=','/'};

    Scanner lectura = new Scanner(System.in);
    System.out.println("calculadora" );
for(int i=0;i<4;i++){
    System.out.println("");
    for (int j=0; j < 4; j++) {
        System.out.print (calculadora[i][j]);
         System.out.print("\t");
}
}
    lectura.close();
}
    }