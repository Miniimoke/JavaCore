package Java01;

import java.util.Arrays;

public class Match {

    Doable[] shots;

    public Match(Doable[] shots) {
        this.shots = shots;
    }

    public void doIt(Team team) {
        for (Doable shot : shots)
            team.doIt(shot);
    }

    @Override
    public String toString() {
        return Arrays.toString(shots);
    }
}
