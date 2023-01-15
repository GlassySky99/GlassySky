package lr7.example3;

public class subClassTwo extends subClass
{
    public String name;


    subClassTwo(int a, char b, String c)
    {
        this.in = a;
        this.ch = b;
        this.name = c;
    }

    @Override
    public String toString()
    {
        String get = this.getClass().getSimpleName() + " int = " + this.in + " char = " + this.ch
                + " String = " + this.name;
        return get;
    }
}
