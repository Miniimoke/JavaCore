package Java01;

public class Aim implements Doable {
    private int number;

    public Aim(int number) {
        this.number = number;
    }

    public boolean doIt(Organization organization) {
        return organization.run(number);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + number + " hits";
    }
}
