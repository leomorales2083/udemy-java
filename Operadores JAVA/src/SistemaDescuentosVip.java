import java.util.Scanner;

public class SistemaDescuentosVip {
    public static void main(String[] args) {

        final int NO_PRODUCTOS_DESCUENTO = 10;

        var consola = new Scanner(System.in);

        System.out.print("Cuantos productos compraste hoy?: ");
        var productos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes una membresia de la tienda (true/flase)?: ");
        var tieneMembresia = Boolean.parseBoolean(consola.nextLine());

        System.out.printf("Tiene acceso al descuento VIP: %b ", productos >= NO_PRODUCTOS_DESCUENTO && tieneMembresia == true);
        
 
        
    }
}
