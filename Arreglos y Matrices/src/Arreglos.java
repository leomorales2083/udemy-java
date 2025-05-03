public class Arreglos {
    public static void main(String[] args) throws Exception {
        System.out.println("*** Declaración de un arreglo ***");

       int[] enteros; //declaramos el arreglo
       enteros = new int[5]; //inicializaos el arreglo..

       enteros[0] = 20;

       //Declarar e inicializar en una sola línea..

       int[] numeros = new int[3]; //declaramos el arreglo y lo inicializamos en una sola línea

       var palabras = new String[4]; // no se puede declrar como var un arrelo vacío

       


        for(int i = 0; i < palabras.length; i++){
            System.out.print(numeros[i]);
            System.out.println(palabras[i]);
        }     

      
    }
}
