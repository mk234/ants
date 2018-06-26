public class Ant {
    private char name;
    private Color color;
    private Direction direction;

    public Ant(char name, Direction direction, Color color) {
        this.name = name;
        this.direction = direction;
        this.color = color;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return color + " ant " +  name;
    }
}
