import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
         //declaramos variables tipo int
        int n = 4, i, vidas=4;
        //declaramos variables tipo string
        String nombre,oculta="casa";
        //usamos arreglos
        String[] palabra = new String[] { "c","a","s","a" };
        String[] letras = new String[3];
        //sccaner
        Scanner lectura = new Scanner(System.in);
        //Tenemos que aclararle a l ususario sus dudas antes de que el mismo se las haga por eso imprimimos una serie de mensajes dando las reglas claras
        System.out.println("Reglas del juego");
        System.out.println("Regla 1 toda letra ingresada debe estar en minuscula,");
        System.out.println("Regla 2:solo tendra 4 intentos,");
        System.out.println("Regla 3:si tiene alguna sospecha de la letra puede ingresarla para comparar, ");
        System.out.println("Regla 4:debe tener presente cada hacierto para adivinar la palaba le descontara una vida.");
        System.out.println("Ingresa un nombre de usuario por el cual te conocera el sistema");
        nombre=lectura.nextLine();
       //usamos el ciclo for para que se repita el sistema un numero n de veces que el sisteme le asigne al usuario 
       for (i = 0; i < n; i++) {
        System.out.println("vidas actuales "+vidas);
        System.out.println("por favor digite la letra ");
        letras[i]=lectura.next();
        if(letras[i].equals(palabra[0])){
            System.out.println(" has adivinado la letra "+palabra[0]);
        }
        else if(letras[i].equals(palabra[1])){
            System.out.println(" has adivinado la letra "+palabra[1]);
        }
        else if(letras[i].equals(palabra[2])){
            System.out.println(" has adivinado la letra "+palabra[2]);
        }
        else if(letras[i].equals(palabra[3])){
            System.out.println(" has adivinado la letra "+palabra[3]);
        }
        else if(letras[i].equals(oculta)){
            System.out.println("excelente descubriste la palabra oculta que es "+oculta);
            break;
        }
        else if(vidas==0){
            break;
        }
        else if(letras[i]!=palabra[i]){
            System.out.println("no has asertado pierdes una vida "+ (vidas --));
        }
    }
    System.out.println("gracias por jugar");
    lectura.close();
    
}
}
