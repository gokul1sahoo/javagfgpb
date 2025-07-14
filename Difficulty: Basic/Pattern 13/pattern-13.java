import java.util.Scanner;

class Solution {

    void printTriangle(int n) {
        // code here
        int number =0;
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                number++;
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}