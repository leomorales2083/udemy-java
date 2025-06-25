package persona;

public class Persona {
    /*Atributos de la clase persona.. se declaran como privados para que no sean accesibles directamente
    desde otras clases solo desde los metodos getter y setter.*/
    private String nombre; // Atributos de la clase persona
    private String apellido;

    //Se crea el método constructor como público
    /*public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }*/

    void mostrarPersona(){   //Metodo de la clase... 
        System.out.println("Nombre: " + this.nombre); //this nos indica que es un metodo de nuestra clase principal
        System.out.println("Apellido: " + this.apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Cración de Clase y Objetos Persona ***");
        var objeto1 = new Persona(); // ser crea una nueva instancia para la objeto1.
        objeto1.nombre = "Layla";  //podemos acceder a los atributos de la clase persona
        objeto1.apellido = "Acosta";
        objeto1.mostrarPersona(); //accedemos al metodo de la clase persona.
    }

    //Metodos de encapsulamiento get y set
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
}
