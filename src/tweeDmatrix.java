import java.util.Arrays;

public interface tweeDmatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        int value = 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = value++;
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();


        }

    }
}
