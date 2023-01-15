package lr7.example3;

public class superClass
{
    public int in;

    superClass(int a) {
        this.in = a;
    }

    superClass() {}

    @Override
    public String toString()
    {
        String get =  this.getClass().getSimpleName() + " int = " + this.in;
        return get;
    }
}
