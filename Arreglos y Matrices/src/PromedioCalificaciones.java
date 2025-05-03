public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");

        var consola = new java.util.Scanner(System.in);

        var sumaCalificaciones = 0;

        System.out.print("Ingrese la cantidad de calificaciones a agregar: ");
        var numeroCalificaciones = Integer.parseInt(consola.nextLine());

        var calificaciones = new int [numeroCalificaciones];

        for (int i = 0; i < numeroCalificaciones; i++){
            System.out.print("Ingrese la calificación [" + (i+1) +"]: ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
            sumaCalificaciones += calificaciones[i];
        }

        System.out.printf("\nEl promedio de las calificaciones es: %d %n", sumaCalificaciones/numeroCalificaciones);

        consola.close();
    }
    
}
