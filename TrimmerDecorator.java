public class TrimmerDecorator extends BaseDecorator {
    public TrimmerDecorator(Nameable nameable) {
        super(nameable);
    }

    public String correct_name() {
        String originalName = nameable.correct_name();
        if (originalName.length() > 10) {
            return originalName.substring(0, 10);
        } else {
            return originalName;
        }
    }
}