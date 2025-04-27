import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        
        System.out.println("*** Valor Dnetro del Rango ***");

        final var MINIMO = 0;
        final var MAXIMO = 5;

        System.out.println("Ingrese un valor entre 0 y 5: ");
        var valor = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println(valor >= MINIMO && valor <= MAXIMO);
    }
}
