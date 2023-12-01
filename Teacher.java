public class Teacher extends Person {
     String specialization;
     boolean parent_permission = true;

    public Teacher(int id, String name, boolean parent_permission, String specialization,int age) {
        super(Integer.parseInt(String.valueOf(id)), name, parent_permission,age);
        this.specialization = specialization;
    }

    public boolean can_use_services() {
        return true;
    }
}