package lr4;

public class example1 {
    public static void main(String[] args) {
        int figure = 11;
        int i;
        int j;
        int z;
        for (i=1; i<=figure; i++){
            z=0;
            for (j=-11; j<=figure;j++){
                System.out.print("+");
                z=z+1;
            }
            System.out.println();
        }
    }
}
