public class Calculadora {
    public static void main(String[] args) {
        
        var consola = new java.util.Scanner(System.in);
        var salir = false;
        var primerValor = 0.0;
        var segundoValor = 0.0;
        var resultado = 0.0;

        while(!salir){
            System.out.print("""
                    *** Calculadora en JAVA ***
                    Menú:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una opción:\s""");
                    var opcion = consola.nextInt();

                    if(opcion >= 1 && opcion <=4){
                        System.out.print("Ingrese el primer Valor: ");
                        primerValor = consola.nextInt();
                        System.out.print("Ingresa el segundo Valor: ");
                        segundoValor = consola.nextInt();
                    }

                    switch (opcion) {
                        case 1 -> {
                            resultado = primerValor + segundoValor;
                            System.out.printf("El resultado de la suma: %.2f %n%n", resultado);
                        }

                        case 2 -> {
                            resultado = primerValor - segundoValor;
                            System.out.printf("El resultado de la resta: %.2f %n%n", resultado);
                        }

                        case 3 -> {
                            resultado = primerValor * segundoValor;
                            System.out.printf("El resultado de la multiplicación: %.2f %n%n", resultado);
                        }

                        case 4 -> {
                            if(segundoValor == 0)
                                System.out.println("No se puede dividir para el valor de 0...");
                            else{
                            resultado = primerValor / segundoValor;
                            System.out.printf("El resultado de división: %.2f %n%n", resultado);
                            }
                        }

                        case 5 ->{
                            System.out.println("Cerrando la calculadora.....\n");
                            salir = true;
                        }

                        default -> System.out.println("Opción Inválida....");
                    }
        }
    consola.close();
    }
}
