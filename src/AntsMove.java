import java.util.Arrays;

 class AntsMove {

    Ant[] antsMove(int steps, Ant[] ants) {
        Ant[] antsCopy;
        for (int y = 0; y < steps; y++) {
            antsCopy = Arrays.copyOf(ants, ants.length);
            for (int i = 0; i < ants.length - 1; i++) {
                if (ants[i].getDirection() == Direction.R && ants[i + 1].getDirection() == Direction.L) {
                    switchAnts(antsCopy, i);
                    i++;
                }
            }
            ants = Arrays.copyOf(antsCopy, antsCopy.length);
        }
        return ants;
    }

    private void switchAnts(Ant[] antsCopy, int i) {
        Ant pom = antsCopy[i];
        antsCopy[i] = antsCopy[i + 1];
        antsCopy[i + 1] = pom;
    }
}
