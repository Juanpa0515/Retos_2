import java.util.Scanner;

public class reto1{
    public static void main(String[] args) {
        String nombre,palabra;
        char [] vector;
         int izquierda=0, derecha;
         Scanner lectura = new Scanner(System.in);{
         System.out.println("Bienvenido, Este programa te va a yudar a saber si la palabra es un palindromo");
         System.out.println("Ingresa un nombre con el te conocera el sistema de ahora en adelante");
         nombre=lectura.nextLine();
         System.out.println("Por favor ingrese la palabra");
         palabra = lectura.next();
         //usamos la funcion toLoweCase para que el valor se devuelva en minusculas de la cadena que en este caso es palabra esta realizando la llamada
         palabra = palabra.toLowerCase();
         vector=palabra.toCharArray();
         //Usamos el length para que podamos leer todos los valores
         derecha=vector.length -1;
         //hacemos uso de el ciclo while para hacinarle la condicion que si izquierda es menor que derecha abra un IF
         // con otra condicion y sigamos con la condicional hasta terminar con unos breack para que el sistema se demore 
         //un segundo en mostrar o madar a la otra condicion
         while(izquierda< derecha){
            if(vector[izquierda] == vector[derecha]){
                derecha --;
                izquierda ++;
            } else{
                System.out.println("querido usuario:"+nombre+", la palabra no es un palindromo");
                break;
            }
         }
         if(izquierda ==derecha){
            System.out.println("querido usuario:"+nombre+", la palabra "+palabra+" es un palindromo ");
         }
         lectura.close();
    }
}
 }
