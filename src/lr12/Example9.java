package lr12;
import java.util.ArrayList;
public class Example9 {
    public static void main(String[] args) {

        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("qwerty");
        inputList.add("1 2 3");
        inputList.add("ab@cde");
        inputList.add("hello!");

        ArrayList<String> outputList = filterByChars(inputList);

        System.out.println(outputList);
    }

    static ArrayList<String> filterByChars(ArrayList<String> inputList) {
        ArrayList<String> outputList = new ArrayList<>();
        for (String s : inputList) {
            if (s.matches("[a-zA-Z]+")) {
                outputList.add(s);
            }
        }
        return outputList;
    }
}
