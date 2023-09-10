package test;

public class test {
    public static void main(String[] args) {
        //1字节， -128~127
        byte b = 127;
        //2字节
        short s = 23;
        //4字节
        int i = 3333;
        //8字节
        long l = 33333333;

        //4字节
        float f = 3.14f;
        //8字节
        double d = 3.14;

        //2字节 0-65535
        char c = 'a';
        c = 97;
        c = 65;
        System.out.println(c);

        boolean bo = true;
        c = '\\';
        c = '\'';
    }
}
