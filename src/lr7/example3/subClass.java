package lr7.example3;

public class subClass extends superClass
{
    public char ch;

    subClass(int a, char b)
    {
        this.in = a;
        this.ch = b;
    }

    subClass() {}

    @Override
    public String toString()
    {
        String get =  this.getClass().getSimpleName() + " int = " + this.in + " char = " + this.ch;
        return get;
    }
}
