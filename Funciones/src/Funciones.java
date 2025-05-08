public class Funciones {

    static void saludar(String mensaje){ //Esta función recibe un string con el nombre mensaje
        System.out.println("Mensaje: " + mensaje); //se concatena con el valor encviado desde la función MAIN.
    }

    public static void main(String[] args) {
        saludar("Hola Mundo");
        saludar("Hello World");
    }
    
}
