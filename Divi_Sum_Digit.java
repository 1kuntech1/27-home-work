import java.util.Scanner;

public class Divi_Sum_Digit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eneter the No.= ");
        int num = scanner.nextInt();

        int div=num;
        int add = 0;
        //int i = 0;
        while(div!=0){
            int rem = div%10;
            div = div/10;
            add = add+rem;
           // System.out.println(add);
        }
        if(num%add==0)
        System.out.println("Given no. "+num+" is divisible by sum of digits.");
        else
        System.out.println("Given no. "+num+" is not divisible by sum of digits.");
        scanner.close();
    }
}