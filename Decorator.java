public class BaseDecorator implements Nameable {
    protected Nameable nameable;

    public BaseDecorator(Nameable nameable) {
        this.nameable = nameable;
    }

    public String correct_name() {
        return nameable.correct_name();
    }
}