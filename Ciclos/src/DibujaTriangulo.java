import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un Triangulo ***");

        var consola = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas del triangulo: ");
        var filas = consola.nextInt();


        for(var fila = 1; fila <= filas; fila ++){
            for(var espacio = filas; espacio >= 1; espacio --){
                System.out.println(" ");
                for (var k = fila; k < filas; k=+2)
                    System.out.print("*");
            }
        }

        consola.close();

    }
}
