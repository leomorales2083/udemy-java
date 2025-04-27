import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Genración Venta de Tickets ***");

        var consola = new Scanner(System.in);

        System.out.print("Precio Leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio Pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio Galletas: ");
        var precioGalletas = Double.parseDouble(consola.nextLine());

        System.out.print("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.print("Tiene algún cupon con descuento (%)?: ");
        var tieneCupon = Integer.parseInt(consola.nextLine());

        var subtotal = precioLeche + precioPan + precioGalletas + precioPlatanos;

        var descuento = subtotal * tieneCupon / 100;
        
        var subtotalConDescuento = subtotal - descuento;
        
        //Calculo con impuestos.
        var impuesto = subtotalConDescuento * 0.15;
        var total = subtotalConDescuento + impuesto;

        System.out.printf("""
                \nSubtotal: $%.2f
                Valor de descuento: $%.2f (%d%%)
                Subtotal con descuento: $%.2f
                Impuesto (15%%): $%.2f      
                Total: $%.2f
                """, subtotal, descuento, tieneCupon, subtotalConDescuento, impuesto, total);
    }
    
}
