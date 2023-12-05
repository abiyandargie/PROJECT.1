

import java.util.ArrayList;
import java.util.List;

public class Person {
    public int id;
    String name;
    int age;

    static boolean parent_permission;


    public Person(int id,boolean parent_permission,String name ,int age) {
        this.id = id;
      name=name.toUpperCase();
        if(name.length()>10){
            this.name=name.substring(0,10);
        }

        else {
            this.name = name;
        }
        this.parent_permission = parent_permission;
        this.age = age;

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

    public void setId(int id) {
        this.id = id;
    }}



