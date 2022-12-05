import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Kindly enter no. for check palindrone: ");
        int num = scnr.nextInt();
        int div = num;
        int rev = 0;
        
        for(;div!=0;div=div/10){
            int rem = div%10;
            rev = rev*10+rem;
        }
        if(rev==num)
        System.out.println(rev +" is palindrone number of "+ num);
        else
        System.out.println(rev +" is not palindrone number of "+ num);
        scnr.close();
    }
    
}
