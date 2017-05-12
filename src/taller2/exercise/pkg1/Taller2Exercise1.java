
package taller2.exercise.pkg1;
/**
 *
 * @author Sebastian Baldion
 */
public class Taller2Exercise1 {

    public static void main(String[] args) {
        int[] A = {4, 8, 12, 16, 20};
        int i, j;
        int n = 2;
        int minimo = Math.abs(A[0] - A[1]);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i != j) {
                    int distancia = Math.abs(A[i] - A[j]);
                    if (distancia < minimo) {
                        minimo = distancia;
                    }
                }
            }
        }
        System.out.println("Distancia minima: \n"+minimo);
    }
    
}
