public class Constructores {

    String sms1;
    
    Constructores(){  //Metodo construtor debe tener el mismo nombre de la clase y un modificar de acceso como public/private etc o no tenerlo (opcional). 
        System.out.println("Ejecutando constructor...");
    }

    void mensaje(){
        System.out.println(sms1);
    }

    public static void main(String[] args) {
        var objeto1 = new Constructores();
        objeto1.sms1 = "Hola Mundo";
        objeto1.sms1 = "Segundo mensaje";
        objeto1.mensaje();


    }
}
