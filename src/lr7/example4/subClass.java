package lr7.example4;

class subClass extends superClass
{
    public String charli;

    subClass(char a, String b)
    {
        this.asya = a;
        this.charli = b;
    }

    subClass() {
    }

    public subClass(subClass copy)
    {
        this.asya = copy.asya;
        this.charli = copy.charli;
    }

    @Override
    public String toString()
    {
        String get = "Name = " + this.getClass().getSimpleName() + "; char = " + this.asya + "; String = " + this.charli;
        return get;
    }
}
