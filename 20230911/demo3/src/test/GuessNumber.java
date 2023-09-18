package test;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    //定义游戏菜单函数
    public static void menu() {
        System.out.println("**************************");
        System.out.println("******  1. play     ******");
        System.out.println("******  0. exit     ******");
        System.out.println("**************************");
    }

    //定义游戏函数
    public static void game() {
        Random rand = new Random();
        int ret = rand.nextInt(1000) + 1;

        int guess = 0;
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        while (true) {
            if (flag <= 2){
                System.out.print("请猜数字:>");
                guess = scanner.nextInt();
                if (guess < (ret-50))
                    System.out.println("猜小了");
                else if (guess > (ret+50))
                    System.out.println("猜大了");
                else {
                    System.out.println("恭喜你，猜对了!");
                    break;
                }
            }else{
                System.out.println("很遗憾，猜错了，游戏结束");
                break;
            }
            flag++;
        }
    }

    public static void main(String[] args) {
        int input = 0;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            System.out.print("请选择>:");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    game();
                    break;
                case 0:
                    System.out.println("退出游戏");
                    break;
                default:
                    System.out.println("选择错误，重新选择");
                    break;
            }
        } while (input != 0);
    }
}