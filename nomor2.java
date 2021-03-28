
package matrix;
public class nomor2 {
    public static void main(String [] args) {
        int [][] A = {
            {6,8},
            {9,8},
            {6,5},
        
        };
        int [][] B = {
            {4,3},
            {5,2},
            {4,3},
        
        };
        if ((A.length == B.length) && (A[0].length == B[0].length)) { 
            int [][] C = new int [A.length] [A[0].length];
            for(int i= 0; i<A.length; i++) {
                for(int j=0; j<A[0].length; j++) {
                    C [i][j] = A [i][j] - B [i][j];
                    System.out.print(C[i][j]+ " ");
                    
                }
                System.out.println();
            }
        }
        else {
            System.out.print ("ukuran matriks tidak sama");
        }
    }
    
}
