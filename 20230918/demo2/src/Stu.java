import java.util.Scanner;

public class Stu {
    String name;
    Grade grade;
    Stu[] friends;

    public Stu(String name) {
        this.name = name;
    }

   public Stu(String name, Grade grade, String[] friendNames, String[] gradeNames) {
        this.name = name;
        this.grade = grade;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入"+name+"朋友的数量：");
        int num = in.nextInt();
        friends = new Stu[num];
        for (int i = 0; i < friends.length; i++) {
            System.out.println("请输入第"+(i+1)+"个朋友");
            String n = in.next();
            friends[i] = new Stu(n);
            friends[i].grade = grade;
        }
    }

    public void show() {
        for (Stu f : friends){
            System.out.println(f);
        }
    }
}