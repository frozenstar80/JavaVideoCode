package nestedloop;
import java.util.Scanner;

public class MathematicalTable {

//Print table from 1 to N

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

       for(int i=1;i<=n;i++){
        for(int j =1 ; j<=10;j++){
System.out.print(i*j+" ");
        }
        System.out.println();
       }

        
    }
}
