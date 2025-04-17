import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        var salir = false;

        while(!salir){
            System.out.print("""
                    *** Sistema de Administración de Cuentas ***
                    Menú:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opción: \s """);
             var opcion = consola.nextInt();
             switch (opcion) {
                case 1 -> System.out.println("Creando tu cueta... \n");
                case 2 -> System.out.println("Eliminando cuenta... \n");
                case 3 ->{
                    System.out.println("Saliendo del sistema...  ADIOS");
                    salir = true;
                }
                default -> System.out.println("Opción Inválida....");
             }
        }
        consola.close();
    }
}
