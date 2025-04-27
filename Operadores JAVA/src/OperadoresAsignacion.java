public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("Operadores de asignación");

        var miNumero = 10;  //Cuando se declara como tipo VAR se debe dar un valor a la variable de manera obligatoria.
        int miNumero2;
        miNumero2 = 2;

        //Asignación compuesta

        miNumero += 5; //Incremento el valor de la variable
         System.out.println(miNumero);

        miNumero *= 2;
        System.out.println(miNumero);

        //Asignación de variables multiples

        int a = 10, b = 15, c = 20;
        System.out.printf("a = %d b = %d c = %d", a, b, c);  //Impresión de numeros con formato
        

    }
}
