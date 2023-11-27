public class CapitalizeDecorator extends BaseDecorator {
    public CapitalizeDecorator(Nameable nameable) {
        super(nameable);
    }

    public String correct_name() {
        String originalName = nameable.correct_name();
        return originalName.toUpperCase();
    }
}