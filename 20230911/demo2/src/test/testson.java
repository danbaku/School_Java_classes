package test;

public class testson extends test {
    void m1(){

    }
    void m1(int... a){
        System.out.println("这是一个可变参数,调用时，可传任意多个参数");
        for (int i : a) {
            System.out.println(i);
        }
    }
}
