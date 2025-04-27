import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        
        final var DISTANCIA_PERMITIDA_KM = 3;
        
        var consola = new Scanner(System.in);

        System.out.print("Cuentas con credencial de estudiante (true/false): ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuantos KM vives de la biblioteca: ");
        var distancia = Integer.parseInt(consola.nextLine());

        System.out.printf("Puede acceder a prestamo de libros: %b",tieneCredencial || distancia <= DISTANCIA_PERMITIDA_KM);

    }
    
}
