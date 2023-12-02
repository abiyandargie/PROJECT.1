public class Person implements Nameable {
     public int id;
     String name;
      int age;

   static boolean parent_permission;

    public Person(int id, String name, boolean parent_permission,int age) {
        this.id = id;
        this.name = name;
        this.parent_permission = parent_permission;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }



    public boolean of_age() {
        return age >= 18;
    }

    public boolean can_use_services() {
        return of_age() || parent_permission;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void addRental() {
        this.addRental();
    }
}