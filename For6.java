import java.util.*;
public class For6 {
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        boolean isPrime=true;
        if(n<2){
            System.out.println("It is not prime number");
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("It is  prime number");
        }
        else{
            System.out.println("It is not a prime number");
}
    }
}