import java.util.Scanner;

public class doWhile {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        //int c = input.nextInt();
        System.out.println("输入你的分数");
        int c = 50;
        while( c <= 60 ){
            System.out.println("不及格");
            c = input.nextInt();
        }
        System.out.println("及格");
    }
}