import java.util.Scanner;


public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly Enter a number for Armstrong no.: ");
        int num = sc.nextInt();
        int div=num;
        int count = 0;
        int arm = 0;

        for(;div!=0;div=div/10){
            count++;
        }
        div = num;
        for(int i=0;i<=count-1;i++){
            int Pow_vlue = 1;
            for(int j=0;j<=count-1;j++){
                int rem = div%10;
                Pow_vlue = Pow_vlue*rem;
            }
            arm = arm + Pow_vlue;
            div = div/10;
        }
        if(num==arm)
        System.out.println("Given number "+ num +" is armstrong number of "+ arm);
        else
        System.out.println("Given number "+ num +" is not armstrong number of "+ arm);
    
        sc.close();
    }
}
