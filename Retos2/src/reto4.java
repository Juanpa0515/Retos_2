import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {
    
     String[][] pro= new String [4][4];
     int [][] precio= new int [4][4];
     String [][] matriz= new String [4][4];

        matriz[0]=new String[] {"0.0","0.1","0.2","0.3"};
        matriz[1]=new String[] {"1.0","1.1","1.2","1.3"};
        matriz[2]=new String[] {"2.0","2.1","2.2","2.3"};
        matriz[3]=new String[] {"3.0","3.1","3.2","3.3"};

     Scanner lectura = new Scanner(System.in);


for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
      System.out.println("coloca el producto en la fila " + i + " y en la columna " + j);
      pro[i][j]=lectura.next();
     }
}
for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
        System.out.println("coloca el precio del producto en la fila " + i + " y en la columna " + j);
        precio[i][j]=lectura.nextInt();
        }
       }
    System.out.println("veamos nuestro catalogo");

for(int i=0;i<4;i++){
    System.out.println("");
    for (int j=0; j < 4; j++){
        System.out.print (matriz[i][j] + "   " + precio[i][j] + "    " + pro[i][j]);
         System.out.print("|\t|");
}
}


System.out.println("");
    lectura.close();
}
    }