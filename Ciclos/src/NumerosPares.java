public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Pares del 1 al 20 ***\n");
        
        var contador = 1;
        while (contador <= 20) {
            if (contador % 2 == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
        System.out.println("\n");
    }
}
