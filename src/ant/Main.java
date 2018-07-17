package ant;

class Main {
    public static void main(String[] args) {

        int greenAnts;
        int blueAnts;
        int steps;
        Ant[] ants;
        ColonyInitialization colonyInitialization = new ColonyInitialization();

        greenAnts = colonyInitialization.getInputNumber("Zadej pocet zelenych mravencu: ");
        blueAnts = colonyInitialization.getInputNumber("Zadej pocet modrych mravencu: ");
        steps = colonyInitialization.getInputNumber("Zadej pocet kroku: ");
        Run run = new Run();
        ants = run.initialize(greenAnts, blueAnts);
        System.out.println("Vstupni kolonie mravencu");
        run.print(ants);
        ants = run.move(steps, ants);
        System.out.println("Vystupni kolonie mravencu");
        run.print(ants);
    }


}
