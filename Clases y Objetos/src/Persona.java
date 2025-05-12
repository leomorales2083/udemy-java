public class Persona {
    String nombre; // Atributos de la clase persona
    String apellido;

    void mostrarPersona(){   //Metodo de la clase... 
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    /*void agregarPersona(){
        System.out.println("Ingresa tu nombre: ");
        var consola = new java.util.String(System.in);
        nombre = consola;

    }*/

    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos Persona ***");
        var objeto1 = new Persona(); //Se crea una nueva instancia 
        objeto1.nombre = "Layla";  //se accede a todos los metodos y atributos de la clase persona..
        objeto1.apellido = "Acosta";
        objeto1.mostrarPersona();

        var objeto2 = new Persona();
        objeto2.nombre = "Ian";
        objeto2.apellido = "Gomez";
        objeto2.mostrarPersona();
    }
}
