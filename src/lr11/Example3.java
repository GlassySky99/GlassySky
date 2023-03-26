package lr11;
public class Example3 {
    static void arrayFill(int[] arrayI, int length){
        if (length ==0)
        {
            return;
        }
        arrayI[--length] = length;
        arrayFill(arrayI,length);
    }
    static void arrayPrint(int[] arrayI, int length)
    {
        if (length==0)
        {
            return;
        }
        System.out.print(arrayI[--length]+ " ");
        arrayPrint(arrayI,length);

    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        int x = 6;
        arrayFill(arr,x);
        arrayPrint(arr,x);

    }
}
