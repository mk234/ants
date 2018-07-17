class Ant {
    private char name;
    private Color color;
    private Direction direction;

    Ant(char name, Direction direction, Color color) {
        this.name = name;
        this.direction = direction;
        this.color = color;
    }

    Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return color + " ant " + name;
    }
}
