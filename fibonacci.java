import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21.... -> Fibonacci Series

int a = 0 ;
int b = 1;
Scanner sc =  new Scanner(System.in);
int n = sc.nextInt();

System.out.print(a + "," + b);
for (int i=0;i<n-2;i++){
    int t = a;
    a = b;
    b = t + b;
    System.out.print("," + b);
}
    }
}
