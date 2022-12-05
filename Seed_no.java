import java.util.Scanner;

public class Seed_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kindly Enter the no.: ");
        int num = scanner.nextInt();

        System.out.print("Kindly Enter the seed no.: ");
        int seed = scanner.nextInt();
        int div=num;
        int seed_num=num;
        while(div!=0){
            int rem=div%10;
            div=div/10;
            seed_num=seed_num*rem;
        }
        if(seed_num==seed)
        System.out.println("Given no. "+ num +" is seed of "+ seed_num);
        else
        System.out.println("Given no. "+ num +" is not seed of "+ seed_num);
        scanner.close();
    }
}
