import java.util.Scanner;

public class deci_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly Enter the no. for conver into binary: ");
        int num = sc.nextInt();
        int div= num;
        int[] binaryNum = new int[1000];
        int i=1;

        while(div!=0){
            int rem = div%2;
            div = div/2;
            binaryNum[i]=rem;
            i++;
        }
        for(int j = i-1;j!=0;j--)
        System.out.print(binaryNum[j]);
        System.out.println(" is the binary number of "+ num);
            sc.close();
    }
}
