import java.util.Scanner;

public class d16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print((char) ('A' + k));
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print((char) ('A' + (l - 1)));
            }
            System.out.println();
        }
    }
}
