package lr7.example5;

class superClass
{
    protected String asiya;

    superClass() {}

    superClass(String a) {
        this.asiya = a;
    }

    @Override
    public String toString()
    {
        String getName = "Name = " + this.getClass().getSimpleName() + " String = " + this.asiya;
        return getName;
    }

    public void check(subClassOne two, subClassTwo three)
    {
        System.out.println(((subClassOne) two).toString());
        System.out.println(((subClassTwo) three).toString());
    }
}
