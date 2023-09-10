package test;

public class test {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        System.out.println(A.m1);
        A.e();
        System.out.println(a.age);
        a = null;
    }
}
