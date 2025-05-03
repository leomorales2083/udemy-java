public class MatrizDinamica {
    public static void main(String[] args) {
        var consola = new java.util.Scanner(System.in);

        System.out.print("Ingrese el numero de filas de la matriz: ");
        var filas = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese le número de columnas: ");
        var columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[filas][columnas];

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.printf("Ingrese el valor de la posición [%d][%d] = ", (i+1), (j+1));
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        //IMPRESIÓN DE MATRIZ

        System.out.println("\nLos valores de la matriz ingresada son: ");
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        consola.close();
    }
}
