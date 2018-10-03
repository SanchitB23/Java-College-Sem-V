import java.util.*;

class test {
    public static void main(String[] args) {
        int wh = 7;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total hours worked");
        int hours = scan.nextInt();

        int amt = 1000;

        if (hours > wh) {
            int extra = hours - wh;
            System.out.println("Extra hours worked = " + extra);

            int pay = amt * extra;
            System.out.println("Amount payable = " + pay);

        } else {
            System.out.println("Chup. Kuch extra nahi hai!");
        }
    }
}