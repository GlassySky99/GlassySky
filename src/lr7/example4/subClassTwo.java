package lr7.example4;

class subClassTwo extends subClass
{
    public int masyanya;

    subClassTwo(char a, String b, int c)
    {
        this.asya = a;
        this.charli = b;
        this.masyanya = c;
    }

    public subClassTwo(subClassTwo copy)
    {
        this.asya = copy.asya;
        this.charli = copy.charli;
        this.masyanya = copy.masyanya;
    }

    @Override
    public String toString()
    {
        String get = "Name = " + this.getClass().getSimpleName() + "; char = " + this.asya + "; String = " + this.charli
                + "; Count = " + this.masyanya;
        return get;
    }
}
