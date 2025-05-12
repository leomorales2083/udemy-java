public class Aritmetica {
    int operando1;  //No se puede crear con var ya que los valores no se inicializan...
    int operando2;

    void sumar(){ 
        var resultado = operando1 + operando2;
        System.out.printf("Resultado Suma : %d %n", resultado);
    } 

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado resta: " + resultado);
    }

    public static void main(String[] args) {
        var object1 = new Aritmetica();
        object1.operando1 = 23;
        object1.operando2 = 12;
        object1.sumar();
        object1.restar();
    }


}
