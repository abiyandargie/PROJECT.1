public class Decorator implements Nameable {
    protected Nameable nameable;

    public Decorator(Nameable nameable) {
        this.nameable = nameable;
    }

    public String correct_name() {
        return nameable.correct_name();
    }
}