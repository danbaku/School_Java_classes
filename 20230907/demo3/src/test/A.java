package test;

public class A {
    private int age;
    String name;
    boolean status;

    public void setAge(int age){
        if(age<0){
            return;
        }
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
}
