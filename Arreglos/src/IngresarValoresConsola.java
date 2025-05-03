public class IngresarValoresConsola {
    public static void main(String[] args) {
        
        var consola = new java.util.Scanner(System.in); //Leer los valores ingresados por consola..

        System.out.print("Proporciona la longuitud del arreglo: ");
        var longuitudArreglo = Integer.parseInt(consola.nextLine());  //Almacenamos la longuitud del arreglo 

        var enteros = new int[longuitudArreglo];  //creamos e inicializamos el arreglo con el valor proporcionado.

        for(int i = 0; i< longuitudArreglo; i++){
            System.out.print("Ingrese el valor[" + (i+1) + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }

        System.out.print("Los valores almacenados en el arreglo son: { ");
        for(var i = 0; i < longuitudArreglo; i++)
            System.out.print(enteros[i] + " ");
        System.out.println("}");



    consola.close();

    }
}
