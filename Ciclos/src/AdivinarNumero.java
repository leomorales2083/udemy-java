public class AdivinarNumero {
    public static void main(String[] args) {
        System.out.println("*** Adivinar Numero ***");

        var consola = new java.util.Scanner(System.in);
        var ramdom = new java.util.Random();


        var numeroSecreto = ramdom.nextInt(50) + 1; //Genera un número aleatorio entre 1 y 50 (en decimal se debe formatear a entero).
        var count = 0; //numero de intentos
        var numero = 0; //numero ingresado por el usuario
        final var INTENTOS_MAXIMOS = 5; //Intentos máximos para adivinar el número randomico.
        
        
        System.out.println(numeroSecreto);  // Me permite ver el numero generado

        while (numero != numeroSecreto  && count < INTENTOS_MAXIMOS) {
            System.out.print("Adivina el numero secreto (1-50): ");
            numero = consola.nextInt();

            if(numero < numeroSecreto)
                System.out.println("El numero secreto es mayor...");
            else if(numero > numeroSecreto) 
                System.out.println("el numero secreto es menor...");
            
            count++;
        }

        if(numero == numeroSecreto)
            System.out.println("Fealicidades adivinaste el numero secreto en " + count + " intentos");
        else
            System.out.println("Terminar tu numero de intetos.. el numero secreto era: " + numero);

        consola.close();

    }
}
