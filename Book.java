import java.util.Scanner;

class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double copies = sc.nextDouble();
        double cost = sc.nextDouble();
        double editing = sc.nextDouble();
        double design = sc.nextDouble();
        double commission = sc.nextDouble();
        double marketing = sc.nextDouble();

        double profit = (copies * cost) + editing + design- commission - marketing;

        System.out.println(profit);
    }
}