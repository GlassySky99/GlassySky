package lr6.example3;

public class Main {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        myClass1.Min(5,6,7,4);
        myClass1.Max(5,6,7,4);
        myClass1.Avarage(5,6,7,4);

        System.out.println();

        int[] vv = new int[]{6, 7, 8, 9, 5, 4};
        myClass1.Max(vv);
        myClass1.Min(vv);
        myClass1.Avarage(vv);
    }
}