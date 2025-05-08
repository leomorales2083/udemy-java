//import java.util.Scanner;

public class FuncionPar {

    static boolean esPar(int numero){
     /*   if(numero % 2 == 0)  metodo if tradicional...
            return true;
        else
            return false;
    */
        return(numero % 2 == 0)? true: false; //función con operador ternario
    }
    public static void main(String[] args) {

        var consola = new java.util.Scanner(System.in);
        System.out.print("Proporcione un valor numerico entero: ");
        var numeroEsPar = Integer.parseInt(consola.nextLine());
        
        System.out.printf("El numero %d, es par? :  %b: %n", numeroEsPar, esPar(numeroEsPar) );

        consola.close();
    }
}
