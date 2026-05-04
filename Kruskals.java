import java.util.*;
public class Kruskals{

    //print karwalete h bhai log ek bar check karne ke liye
    public static void printMatrix(int[][] mat){
    for(int i = 0; i < mat.length; i++){
        for(int j = 0; j < mat[i].length; j++){
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
}


    public static int[][] createMatrix(int v , int [][] e){
        int[][] adjMatrix =new int[v][v];
        for(int i =0;i<e.length ; i++){
            int x =e[i][0]-1;
            int y =e[i][1]-1;
            int w =e[i][2];
            adjMatrix[x][y] = w;
            adjMatrix[y][x] = w;
        }
        return adjMatrix;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of vertices :");
        int v = input.nextInt();
        System.out.println("Enter the number of Edges :");
        int e = input.nextInt();
        int[][] e_w = new int[e][3];
        System.out.println("Enter the Edges and weight like this ( x y w ) :");
        for(int i = 0; i< e ; i++){
            e_w[i][0]= input.nextInt();
            e_w[i][1]= input.nextInt();
            e_w[i][2]= input.nextInt();
        }
        System.out.println("Adj Matrix : ");
        int[][] graph = createMatrix(v, e_w);
        printMatrix(graph);
        

        
    }
}
