//teacher class
public class Teacher extends Person {
    private String specialization;

    public Teacher(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }//

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}