package Flow_of_Control;

import java.util.Scanner;

public class whileloopuserinput {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num1 = sc.nextInt();
        while(a<=10){
            System.out.println(a*num1);
            a++;
        }
    }
}
