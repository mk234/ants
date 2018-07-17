import java.util.Scanner;

 class ColonyInitialization {


     Ant[] allocationAntsArray(char[] alphabet, int greenAnts, int blueAnts) {
        Ant[] ants = new Ant[greenAnts + blueAnts];
        for (int i = 0; i < greenAnts; i++) {
            ants[i] = new Ant(alphabet[i], Direction.R, Color.GREEN);

        }
        for (int i = greenAnts; i < (greenAnts + blueAnts); i++) {
            ants[i] = new Ant(alphabet[i], Direction.L, Color.BLUE);
        }
        return ants;
    }

     char[] getAlphabet(int length) {
        char[] alphabet = new char[length];
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) (65 + i);
        }
        return alphabet;
    }

     int getInputNumber(String message) {
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
}
