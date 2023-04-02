package lr12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("Short");
        inputList.add("Medium length");
        inputList.add("Very very very very very very very very very very very very very very very very very very long");

        int minLength = 20;

        ArrayList<String> outputList = filterByLength(inputList, minLength);

        System.out.println(outputList);
    }
    static ArrayList<String> filterByLength(ArrayList<String> inputList, int minLength) {
        ArrayList<String> outputList = new ArrayList<>();
        for (String s : inputList) {
            if (s.length() > minLength) {
                outputList.add(s);
            }
        }
        return outputList;
    }
}

