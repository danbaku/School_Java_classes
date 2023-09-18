package test;

public class Ghost {
    int m;
    static Person catchPerson(int choice){
        switch (choice) {
            case 0:
                return new Stu();
            case 1:
                return new Teacher();
            case 2:
                return new Worker();
            default:
                return new Person();
        }
    }
    static void eat(Person p){
        p.say();
        if (p instanceof Teacher){
            ((Teacher)p).lesson();
        }else if (p instanceof Stu){
            ((Stu)p).buyTea();
        }else if (p instanceof Worker){
            ((Worker)p).touchFish();
        }
    }
}
