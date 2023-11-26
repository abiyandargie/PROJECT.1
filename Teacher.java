public class Teacher extends Person {
    private String specialization;
    private boolean parent_permission = true;

    public Teacher(String id, String name, boolean parent_permission, String specialization) {
        super(id, name, parent_permission);
        this.specialization = specialization;
    }

    public boolean can_use_services() {
        return true;
    }
}