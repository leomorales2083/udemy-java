import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un Triangulo ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas del triangulo: ");
        var numeroFilas = consola.nextInt();

        for(var fila = 1; fila <= numeroFilas; fila ++){
            var espaciosBlanco = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila -1);
            System.out.printf("%s%s%n", espaciosBlanco, asteriscos);
        }
        consola.close();
    }
}
