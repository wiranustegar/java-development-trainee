import java.util.Scanner;
public class SupermarketDummy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total Belanja: ");
        double total = Double.parseDouble(sc.nextLine());

        System.out.print("Member (y/n): ");
        boolean member = sc.nextLine().equalsIgnoreCase("y");

        float discount = .1f;

        if((total >= 1000) && (total <= 10000)){
            discount *= 2;
        } else {
            discount *= 3;
        }

        if(member){
            discount += .05;
        }

        System.out.println("Total Belanja anda: $" + total);
        System.out.println("discount anda: $" + total*discount);
        System.out.println("Total harus bayar: $" + (total-(total*discount)));
    }
}