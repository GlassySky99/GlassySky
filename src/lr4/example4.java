package lr4;

public class example4 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
