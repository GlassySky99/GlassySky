package lr7.example2;

public class superClass
{
    private String str1;

    public void metod() {}

    public void metod(String a) {
        this.str1 = a;
    }

    superClass(String str1) {
        metod(str1);
    }

    public int rez()
    {
        return this.str1.length();
    }

    public String toString()
    {
        String getName =  "Name = " + this.getClass().getSimpleName() + "; string= " + this.str1
                + "; length = " + this.rez();
        return getName;
    }

    public String getStr1() {
        return this.str1;
    }

}
