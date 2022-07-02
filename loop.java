import java.util.Scanner;

/**
 * loop
 */
public class loop {

    public static void main(String[] args) {
       int n;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       int sum=1;
       for(int i=0;i<n;i++){
       sum = sum*(n-i);
       }
       System.out.println(sum);
    }
}