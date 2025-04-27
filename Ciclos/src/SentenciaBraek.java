public class SentenciaBraek {
    public static void main(String[] args) {
        
        System.out.println("** Sentencia Break y Continue ***");

        for(var i = 1; i < 10; i++){
            if( i % 2 == 0){
                System.out.print(i + " ");
                break;
            }
        }
        System.out.println("");
        
        //Imprimir solo numeros pares CONTINUE

        for(var numero = 1; numero < 10; numero++){
            if(numero % 2 == 1)
                continue;
            System.out.print(numero + " "); // numeros pares
        }
        System.out.println();
    }
}
