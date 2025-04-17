public class SumaAcumulativa{

    public static void main(String[] args) {

        System.out.println("*** Suma Acumulativa ***");

        final var MAXIMO = 5;
        int numero = 1, acumulativa = 0;

        while(numero <= MAXIMO){
            System.out.println("Acumulado + numero --> " + acumulativa + " + " + numero);
            acumulativa += numero;
            System.out.println(acumulativa);
            numero++;
        }
            
    }
    
}
