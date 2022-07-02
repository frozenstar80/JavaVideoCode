package loop;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int flag =0;
        for(int i = 1;i<n-1;i++){
            if(n%(n-i)==0)
            {
                
                System.out.println("Not a prime number");
                flag=1;
                break;
            }
        }
        if(flag==0 && n!=1){
            System.out.println("A Prime Number");
        }
        if(n==1){
            System.out.println("Neither Prime nor Composite No. ");
        }

        
    }
}
