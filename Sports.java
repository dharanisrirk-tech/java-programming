import java.util.Scanner;

class Sports{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double registration = sc.nextDouble();
        double broadcast = sc.nextDouble();
        double sponsor = sc.nextDouble();
        double prize = sc.nextDouble();
        double rent = sc.nextDouble();
        double advertising = sc.nextDouble();

        double fund = registration + broadcast + sponsor - prize - rent - advertising;

        System.out.println(fund);
    }
}
