public class AreaPerimetroRegtangulo {  

    public static void main(String[] args) {
        
        System.out.println("Perimetro y Area de un Regtangulo");

        var consola = new java.util.Scanner(System.in);

        System.out.print("Ingres el valor de la BASE del regtangulo: ");
        var base = Integer.parseInt(consola.nextLine());

        System.out.print("Ingres el valor de la ALTURA del regtangulo: ");
        var altura = Integer.parseInt(consola.nextLine());

        var area = altura * base;
        var perimetro = (altura + base) * 2;

        System.out.println("\nEl area del rectangulo es: " +area);
        System.out.println("el perimetro del rectangulo es: " + perimetro + "\n");
    }
    
}
