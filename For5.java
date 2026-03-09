
import java.util.*;
public class For5 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
            System.out.println(fact);
        }
    }
}
