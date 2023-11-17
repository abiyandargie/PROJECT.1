public class CapitalizeDecorator extends Decorator {
    public CapitalizeDecorator(Nameable nameable) {
        super(nameable);
    }

    @Override
    public String correctName() {
        String name = nameable.correctName();
        return name.toUpperCase();
    }
}
