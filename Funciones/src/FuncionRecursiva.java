public class FuncionRecursiva {

    //Imprimir los numeros del 1 al 5 usando una función recursiva

    //Función Recursiva

    static void funcionRecursiva(int numero){
        //Caso Base
        if(numero == 1)
            System.out.print(numero + " ");
        else{
            //Caso recursivo
            //System.out.print(numero + " "); imprimir de manera descendente.
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(10);
        System.out.println();
    }
    
}
