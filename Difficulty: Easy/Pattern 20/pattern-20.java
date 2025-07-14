class Solution {

    void printTriangle(int n) {
        // code here
        int i, j, k, l, m;
        for (i = 1; i <= n; i++) { // upper portion
            for (j = 1; j <= i; j++) { // upper left star
                System.out.print("*");
            }
            for (j = 1; j <= 2 * (n - i); j++) { // middle upper space
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) { // upper right star
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) { // lower portion
            for (j = 1; j <= i; j++) { // left star
                System.out.print("*");
            }
            for (j = 1; j <= 2 * (n - i); j++) { // middle space
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) { // right star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}