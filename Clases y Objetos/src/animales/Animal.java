package animales;

public class Animal {

    // Métodos
    // Con la palabra protected le damos mas seguridades a los métodos ya que solo
    // pueden acceder los hijos de estas clases
    protected void comer() {
        System.out.println("Como muchas veces al día...");
    }

    protected void dormir() {
        System.out.println("Duermo muchas horas al día");
    }

}

class Perro extends Animal {

    public void hacerSonido() {
        System.out.println("Puedo ladrar...");
    }

    @Override // Indica que un método esta sobreescribiendo el comportamineto en el método
              // padre.
    protected void dormir() {
        System.out.println("Duermo 15 horas al día");
        System.out.println("Método de la clase padre..");
        super.dormir(); // permite volver a llamar al método original.. antes de ser sobreescrito.
    }

}

class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("Ejemplo de Herencia");
        System.out.println("Clase padre, soy un animal..");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        // animal1.hacerSonido(); //Este método no existe en la clase padre Animal...

        System.out.println("\nClase hija.. soy un perro");
        var perro1 = new Perro(); // cramos una nueva instancia de la clase Perro y podemos acceder a los métodos
                                  // de la clase padre.
        perro1.hacerSonido();
        perro1.comer();
        perro1.dormir();
    }
}
