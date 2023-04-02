package lr12;
import java.util.ArrayList;
public class Example10 {
    public static void main(String[] args) {

        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(5);
        inputList.add(10);
        inputList.add(15);
        inputList.add(20);
        inputList.add(25);

        int maxValue = 18;

        ArrayList<Integer> outputList = filterByValue(inputList, maxValue);

        System.out.println(outputList);
    }
    static ArrayList<Integer> filterByValue(ArrayList<Integer> inputList, int maxValue) {
        ArrayList<Integer> outputList = new ArrayList<>();
        for (Integer n : inputList) {
            if (n < maxValue) {
                outputList.add(n);
            }
        }
        return outputList;
    }
}
