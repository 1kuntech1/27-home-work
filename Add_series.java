import java.util.Scanner;

public class Add_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kindly Enter the the digit= ");
        float num = scanner.nextInt();
        System.out.println("Where you want add series 1/nth form.");
        float frn = 0;

        while(num!=0){
            frn = frn+1/num;
            num--;
        }
        System.out.println("The series addition= " + frn);
        scanner.close();
    }
}
