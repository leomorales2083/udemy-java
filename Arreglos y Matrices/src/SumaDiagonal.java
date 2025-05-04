public class SumaDiagonal {
    public static void main(String[] args) {
        
        var sumaDiagonal = 0;
        var centenas = new int[][]{ //Declarar e inicializar los valores de la matriz
            {32,200,300},
            {400,101,600},
            {700,800,2},
        };

        for(var fila = 0; fila < centenas.length; fila++){
            for(var columna = 0; columna < centenas[fila].length; columna++){
                if (fila == columna){
                    sumaDiagonal += centenas[fila][columna];
                }
            }
        }

        System.out.println(sumaDiagonal);

    }
    
}
