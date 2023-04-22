import java.util.Scanner;

public class doWhile {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        /;int c = input.nextInt();
		do{
            System.out.println("输入你的分数");
            //int c = input.nextInt();
        }while( c <= 60 ){
            System.out.println("不及格");
        }
        System.out.println("及格");
    }
}