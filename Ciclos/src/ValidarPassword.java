public class ValidarPassword {
    public static void main(String[] args) {
        
        var consola = new java.util.Scanner(System.in);
        
        System.out.print("Ingrese una contraseña de al menos 6 caracteres: ");
        String password = consola.nextLine();
        
       while(password.length() < 6){
            System.out.print("Contraseña inválida!!!!!");
            System.out.print("\nIngresa nuevamente una contraseña: ");
            password = consola.nextLine();
        }
        
        System.out.println("El valor del password es valido!!! " + password);
        consola.close();

    }
}
