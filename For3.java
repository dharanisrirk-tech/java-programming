
import java.util.*;
public class For3 {
    public static void main(String[] args) {
        Scanner s1=new Scanner (System.in);
        int n=s1.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
