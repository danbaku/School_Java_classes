package test;

public class person {
    int age;
    String name;

    public void walk(){
        System.out.println(name + "在散步");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
