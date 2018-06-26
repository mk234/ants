import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int greenAnts;
        int blueAnts;
        int steps;

        greenAnts = getInputNumber("Zadej pocet zelenych mravencu: ");
        blueAnts = getInputNumber("Zadej pocet modrych mravencu: ");
        int length = greenAnts + blueAnts;
        steps = getInputNumber("Zadej pocet kroku: ");

        char[] alphabet = getAlphabet(length);
        Ant[] ants = allocationAntsArray(alphabet, greenAnts, blueAnts);
        System.out.println("Vstupni kolonie mravencu");
        print(ants);
        ants = antsMove(steps, ants);
        System.out.println("Vystupni kolonie mravencu");
        print(ants);
    }

    private static int getInputNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int number;
        while (true) {
            String line = sc.nextLine();
            try {
                number = Integer.parseInt(line);
                if (number > 0)
                    return number;
                System.out.println("Cislo musi byt kladne! Zkus to znovu.");
            } catch (NumberFormatException e) {
                System.out.println("Musis zadat cislo! Zkus to znovu.");
            }
        }
    }

    private static Ant[] antsMove(int steps, Ant[] ants) {
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

    private static void switchAnts(Ant[] antsCopy, int i) {
        Ant pom = antsCopy[i];
        antsCopy[i] = antsCopy[i + 1];
        antsCopy[i + 1] = pom;
    }

    private static void print(Ant[] ants) {
        for (Ant ant : ants) {
            System.out.println(ant);
        }
    }

    private static char[] getAlphabet(int length) {
        char[] alphabet = new char[length];
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) (65 + i);
        }
        return alphabet;
    }


    private static Ant[] allocationAntsArray(char[] alphabet, int greenAnts, int blueAnts) {
        Ant[] ants = new Ant[greenAnts + blueAnts];
        for (int i = 0; i < greenAnts; i++) {
            ants[i] = new Ant(alphabet[i], Direction.R, Color.GREEN);

        }
        for (int i = greenAnts; i < (greenAnts + blueAnts); i++) {
            ants[i] = new Ant(alphabet[i], Direction.L, Color.BLUE);
        }
        return ants;
    }
}
