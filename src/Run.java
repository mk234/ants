class Run {

    private ColonyInitialization colonyInitialization = new ColonyInitialization();
    private AntsMove antsMove = new AntsMove();

    void print(Ant[] ants) {
        for (Ant ant : ants) {
            System.out.println(ant);
        }
    }

    Ant[] initialize(int greenAnts, int blueAnts) {
        int length = greenAnts + blueAnts;
        char[] alphabet = colonyInitialization.getAlphabet(length);
        return colonyInitialization.allocationAntsArray(alphabet, greenAnts, blueAnts);

    }

    Ant[] move(int steps, Ant[] ants) {
        ants = antsMove.antsMove(steps, ants);
        return ants;
    }
}
