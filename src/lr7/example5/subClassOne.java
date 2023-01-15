package lr7.example5;

class subClassOne extends superClass
{
    protected int charli;

    subClassOne(String a, int b)
    {
        this.charli = b;
        this.asiya = a;
    }

    @Override
    public String toString()
    {
        String getName = "Name = " + this.getClass().getSimpleName() + " String = " + this.asiya
                + " Int = " + this.charli;
        return getName;
    }
}
