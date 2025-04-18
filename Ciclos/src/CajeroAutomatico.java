public class CajeroAutomatico {
    public static void main(String[] args) {
        
        var consola = new java.util.Scanner(System.in);
        var salir = false;
        var saldo = 1000.00;
        var deposito = 0;
        var retiro = 0;
    
        while(!salir){
            System.out.print("""
                    *** Aplicación de Cajero Automático ***
                    Menú:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");
                    var opcion = consola.nextInt();
             switch (opcion) {
                case 1 -> System.out.printf("Tu Saldo es $%.2f \n\n",saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: $");
                    retiro = consola.nextInt();
                    if(retiro > saldo)
                        System.out.println("El monto del retiro excede su saldo.. Saldo actual $" + saldo);
                    else{
                        saldo -= retiro;
                        System.out.printf("Tu nuevo Saldo es: $%.2f \n", saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: $");
                    deposito = consola.nextInt();
                    saldo += deposito;
                    System.out.printf("Tu nuevo Saldo es: $%.2f \n", saldo);
                }
                case 4 ->{
                    System.out.println("Saliendo del sistema... Gracias por utilizar nuestros cajeros...");
                    salir = true;
                }
                default -> System.out.println("Opción Inválida....");
             }
        }
    consola.close();
    }
}
