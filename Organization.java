package Java01;

public class Organization {

    protected String name;
    protected int run_limit;

    public boolean run(int length) {
        return run_limit > length;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + name;
    }
}
