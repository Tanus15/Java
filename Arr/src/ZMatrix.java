import java.util.*;
import java.util.ArrayList;

public class ZMatrix {
    /**public static void setZeros(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i = 0; i < row.size(); i++) {
            for (int j = 0; j < n; j++) {
                arr[row.get(i)][j] = 0;

            }

        }
        for (int i = 0; i < col.size(); i++) {
            for (int j = 0; j < m; j++) {
                arr[j][col.get(i)] = 0;
            }
        }

    }*/

    public static void main(String[] args) {
        int[][] a={{1,2,3},
                  {2,0,7},
                  {3,4,5}};
        setZeros(a);
    }

}