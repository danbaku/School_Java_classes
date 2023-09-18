public class Test2 {
    public static void main(String[] args) {
        A a = new A();
        String[]colors = {"red","yellow","blue","green"};
        for(int i = 0; i < a.arr3.length; i++){
            a.arr3[i] = new Apple(colors[i%colors.length]);
        }
    }
}
