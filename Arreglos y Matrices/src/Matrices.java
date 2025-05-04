public class Matrices {
    public static void main(String[] args) {
        
        //Declaración de matrices

        //int[][] matriz = new int[4][4];  //Declarar la matriz
        //var mattriz = new int[4][4];

        var centenas = new int[][]{ //Declarar e inicializar los valores de la matriz
            {100,200,300},
            {400,500,600},
            {120,230,101,201},
            {40}
        };

        for(int i = 0; i < centenas.length; i++){
            for(int j = 0; j < centenas[i].length; j++){
                System.out.print(centenas[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
