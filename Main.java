class Main{
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
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