import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {

        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123456";

        var consola = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Ingrese su contraseña: ");
        var password = consola.nextLine();

        var autenticado = USUARIO_VALIDO.equals(usuario) && PASSWORD_VALIDO.equals(password);

        System.out.printf("El usuario y clave son: %b", autenticado);
        
    }
}


