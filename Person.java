public class Person implements Nameable {
    private String id;
    private String name;
    private int age;

    private boolean parent_permission;

    public Person(String id, String name, boolean parent_permission) {
        this.id = id;
        this.name = name;
        this.parent_permission = parent_permission;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean of_age() {
        return age >= 18;
    }

    public boolean can_use_services() {
        return of_age() || parent_permission;
    }

    public String correct_name() {
        return name;
    }
}