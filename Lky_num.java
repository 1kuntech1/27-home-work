import java.util.Scanner;

public class Lky_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kindly enter the no.: ");
        int num = scanner.nextInt();
        int div = num;
        int pow = 1;
        while(div!=0){
            int rem = div%10;
            div = div/10;
            pow = pow*10;
        }
        pow=pow/10;
        div=num;
        int count = 0,Lucky = 0;
        while(div!=0){
            int rem = div/pow;
            div = div%pow;
            pow=pow/10;
            count++;
            if(count%2==0){
                Lucky=Lucky+(rem*rem);
            }
        }
        if(Lucky%9==0)
        System.out.println("Given no. " +num+ " is Luck noumber");
        else
        System.out.println("Given no. " +num+ " is not Lucky number");

        scanner.close();
    }
}
