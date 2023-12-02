public class Teacher extends Person {
     String specialization;
    public Teacher(int id, String name, boolean parent_permission, String specialization,int age) {
        super(Integer.parseInt(String.valueOf(id)), name, parent_permission,age);
        this.specialization = specialization;
    }

}