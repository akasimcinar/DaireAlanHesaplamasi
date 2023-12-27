import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        int r = scan.nextInt();
        double alan = Math.PI * r * r;
        double cevre = Math.PI * r;

        System.out.println("Darirenin Alanı : " + alan);
        System.out.println("Darirenin Çevresi : " + cevre);
    }
}