//4. Напишите программу, в которой использована цепочка наследования из трех
//        классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//        открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//        каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//        значений полей, переданных аргументами конструктору, а также конструктор создания
//        копии
package lr7.example4;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n origin \n \n");
        superClass one = new superClass('a');
        System.out.println(one.toString());

        subClass two = new subClass('b', "sub");
        System.out.println(two.toString());

        subClassTwo three = new subClassTwo('c', "sub2", 1111111);
        System.out.println(three.toString());
        System.out.println("\n clone \n \n");
        superClass a = new superClass(one);
        System.out.println(a.toString());
        superClass b = new subClass(two);
        System.out.println(b.toString());
        superClass c = new subClassTwo(three);
        System.out.println(c.toString());

    }
}