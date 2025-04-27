public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("***Operadores Unarios***");

        int a = 3, b = -2, resultado = 0;
        var c = true;

        //Operadores Unarios +
        System.out.println(+a);
        System.out.println(-a);

        //Operadores de incremento y decremento
        System.out.println(++a);   //primero se cambia el valor de la variable (incremento/decremento) y luego se usa
        System.out.println(a++);  //primero se usa el valor de la variable y luego se cambia(decremento o incremento)


    }
}
