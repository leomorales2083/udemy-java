public class Aritmetica {
    int operando1;  //No se puede crear con var ya que los valores no se inicializan...
    int operando2;

    public Aritmetica(int op1, int op2){ //Construtor con valores... recibe 2 parámetroos
        operando1 = op1;
        operando2 = op2;

    }

    public void sumar(){ 

        
        var resultado = operando1 + operando2;
        System.out.printf("Resultado Suma : %d %n", resultado);
    } 

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado resta: " + resultado);
    } 

    public static void main(String[] args) {
        
        var aritmetica1 = new Aritmetica(101, 114);
        //aritmetica1.operando1 = 23;
        //aritmetica1.operando2 = 12;
        aritmetica1.sumar();
        aritmetica1.restar();

        var aritmetica2 = new Aritmetica(47, 56);
        //aritmetica2.operando1 = 5786;
        //aritmetica2.operando2 = 1478;
        aritmetica2.sumar();
        aritmetica2.restar();
    }


}
