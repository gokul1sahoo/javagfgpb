import java.util.Scanner;

class Solution {

    void printTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
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