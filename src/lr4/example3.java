package lr4;

public class example3 {
    public static void main(String[] args) {
        int[][] twoDimArray = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
