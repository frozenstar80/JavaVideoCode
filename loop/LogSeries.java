package loop;
import java.util.Scanner;

/**
 * LogSeries
 */
public class LogSeries {

    public static void main(String[] args) {
        int n;
      float  sum = 0 ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (float i=1;i<n;i++){
if(i%2==0){
    sum -= 1/i;
}else{
    sum += 1/i;
}
        }

        System.out.println(sum);
    }
}