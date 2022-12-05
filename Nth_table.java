import java.util.Scanner;

public class Nth_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly enter the number as far as you want to print the tableo: ");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=10;j++){
                int table = i*j;
               
                System.out.println( i +" * "+ j +" = " + table );
                if(j==10){
                    System.out.println();
                    System.out.println();}
            }
        }
        sc.close();
    }
}
