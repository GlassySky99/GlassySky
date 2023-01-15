package lr7.example4;

class superClass
{
    public char asya;

    superClass(char a) {
        this.asya = a;
    }

    superClass() {}

    public superClass(superClass copy) {
        this.asya = copy.asya;
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; char = " + this.asya;
        return get;
    }
}
