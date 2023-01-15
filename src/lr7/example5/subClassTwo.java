package lr7.example5;

class subClassTwo extends superClass
{
    protected char max;

    subClassTwo(String a, char c)
    {
        this.max = c;
        this.asiya = a;
    }

    @Override
    public String toString()
    {
        String getName = "Name = " + this.getClass().getSimpleName() + " String = " + this.asiya
                + " Char = " + this.max;
        return getName;
    }
}
