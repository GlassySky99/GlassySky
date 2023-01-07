package lr6.example1;

public class Main {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();

        System.out.println(myClass1.ch1);
        System.out.println(myClass1.str1);

        myClass1.setCh1OrStr1('l');
        myClass1.setCh1OrStr1("Привет");

        System.out.println(myClass1.ch1);
        System.out.println(myClass1.str1);

        char[] chars1 = new char[] {'П', 'о', 'к', 'а', '!'};

        myClass1.setCh1OrStr1(chars1);
        System.out.println(myClass1.str1);

        char[] chars2 = new char[] {'Ц'};

        myClass1.setCh1OrStr1(chars2);
        System.out.println(myClass1.ch1);
    }
}
