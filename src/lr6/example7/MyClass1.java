package lr6.example7;

public class MyClass1 {
    public static int[] Set(char[] set){
        int[] charCode = new int[set.length];
        for (int i = 0; i < set.length; i++)
        {
            charCode[i] = set[i];
        }
        return charCode;
    }
}
