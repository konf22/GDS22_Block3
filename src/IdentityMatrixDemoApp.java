public class IdentityMatrixDemoApp {
    public static void main(String[] args) {

        int size = 5;
        int[][] matrix = generateMatrix(size);

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length;y++) {
                System.out.print(matrix[x][y] + " | ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int size){
        int[][] matrix = new int[size][size];

        // your code
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }

        return matrix;
    }
}
