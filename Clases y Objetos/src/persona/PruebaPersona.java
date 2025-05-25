package persona;

public class PruebaPersona {

    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos Persona ***");

        var objeto1 = new Persona("Layla", "Acosta"); //Se crea una nueva instancia 
        objeto1.mostrarPersona();

        var objeto2 = new Persona("Ian","Gomez");
        objeto2.mostrarPersona();
    }
    
}
