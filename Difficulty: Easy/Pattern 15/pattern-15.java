
import java.util.Scanner;

class Solution {

    void printTriangle(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print((char) ('A' + (j - 1)));

            }
            System.out.println();
        }
    }
}
