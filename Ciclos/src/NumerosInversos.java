public class NumerosInversos {
    
    public static void main(String[] args) {
        System.out.println("*** Numeros Inversos ***");
        
        var contador = 10;

        do {
            System.out.print(contador-- + " ");
        } while (contador >= 1);
        System.out.println("\n");
    }
}
