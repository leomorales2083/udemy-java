import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);

        System.out.println("Ingresa un dato entero: ");
        var valor = Integer.parseInt(consola.nextLine());

        System.out.printf("Variable dentro de rango: %b",valor >= 1 && valor <= 10);

        System.out.printf("\nVariable fuera de rango: %b",!(valor >= 1 && valor <= 10));
        


    }
}
