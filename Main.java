public class Main {

    public static void main(String[] args) {

    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] getUnitMatrix(int size) {
        int[][] unitMatrix = new int[size][size];
        for (int i = 0; i < unitMatrix.length; i++) {
            for (int j = 0; j < unitMatrix[i].length; j++) {
                if (i == j) {
                    unitMatrix[i][j] = 1;
                } else {
                    unitMatrix[i][j] = 0;
                }
            }
        }
        return unitMatrix;
    }
}
