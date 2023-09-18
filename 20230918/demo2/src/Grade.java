public class Grade {
    String name;
    public Grade(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                '}';
    }
}