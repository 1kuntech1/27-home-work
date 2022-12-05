import java.util.Scanner;

public class add_evn_od_plce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly enter the no. for addition of even and odd place: ");
        int num = sc.nextInt();
        int div=num;
        int count=0,pow=1;
        int even_add=0,odd_add=0;

        for(;div!=0;div=div/10){
            count++;
            pow=pow*10;
        }
        div = num;
        pow=pow/10;
        for(int i=1;i<=count;i++){
            int rem=div/pow;

            if(i%2==0)
            even_add=even_add+rem;
            else
            odd_add=odd_add+rem;

            div=div%pow;
            pow=pow/10;
        }
        System.out.println(even_add +" is even addition of "+ num +"\n"+ odd_add +" is odd addition of "+ num);

        sc.close();
    }
    
}
