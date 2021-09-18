package Java01;

public class HW1 {

    public static void main(String[] args) {
        Match cource = new Match(new Doable[] {
                new Aim(50)});
        Team team = new Team("NaVi", new Organization[] {
                new Player("Simple"),
                new Player("Electronic"),
                new Player("BoombI4"),
                new Player("Perfecto"),
                new Player("B1T")});

        System.out.println(team);
        cource.doIt(team);
        team.showResults();
    }

}
