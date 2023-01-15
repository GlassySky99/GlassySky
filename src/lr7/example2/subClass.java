package lr7.example2;

public class subClass extends superClass {

    int num;

    public void metodTwo() {
        super.metod();
    }

    public void metodTwo(String a) {
        super.metod(a);
    }

    public void metodTwo(int a)
    {
        this.num = a;
    }

    public void metodTwo(String a, int b)
    {
        this.num = b;
        super.metod(a);
    }

    subClass(String a, int b)
    {
        super(a);
        this.num = b;
    }

    public String toString()
    {
        String getName =  "Name = " + this.getClass().getSimpleName() + "; str= " + super.getStr1() + "; leng = "
                + super.rez() + "; int = " + this.num;
        return getName;
    }
}