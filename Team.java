package Java01;

import java.util.Arrays;

public class Team {

    private String name;
    private Organization[] organizations;
    private String result;

    public Team(String name, Organization[] organizations) {
        this.name = name;
        this.organizations = organizations;
        result = "";
    }

    public void doIt(Doable shot) {
        result += shot.toString() + "\n";
        for (Organization organization : organizations)
            result += " " + organization + " " + shot.doIt(organization) + "\n";
    }

    public void showResults() {
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "Team: " + name + " " + Arrays.toString(organizations);
    }
}
