 
public class Person implements Nameable {
     int id;
     String name="unknown";
     int age;
     boolean parentPermission=true;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.parentPermission = parentPermission;
    }

 
public class Person {
        int id;
         String name="unknown";
         int age;
         boolean parentPermission = true;

    public  Person(String name, int age, boolean parentPermission) {

            this.name = name;
            this.age = age;
            this.parentPermission = parentPermission;
        }
        public int getId() {
            return id;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isOfAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return isOfAge() || parentPermission;
    }

    @Override
    public String correctName() {
        return name;
    }
}
