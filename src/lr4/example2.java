package lr4;

public class example2 {
    public static void main(String[] args) {
        int figure = 10;
        int z;
        for (int i=0; i<figure; i++){
            z=0;
            for (int j=0; j<=i;j++){
                System.out.print("+");
                z=z+1;
            }
            System.out.println();
        }
    }
}
