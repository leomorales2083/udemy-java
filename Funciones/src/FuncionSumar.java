public class FuncionSumar {
    
    static int sumar(int a, int b){
        var resultado = a + b;
        return resultado;
    }
    
    public static void main(String[] args) {
        int resultado_suma = 0;
        resultado_suma = sumar(5847,8745);

        System.out.println("Resultado de la suma de a+b es: " + resultado_suma);
    }
}
