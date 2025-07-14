class Solution {

    void printTriangle(int n) {
       int  r=n;
        // code here
        int i, j, k, l, m;
        for (i = r; i >= 1; i--) { // lower portion
            for (j = 1; j <= i; j++) { // left star
                System.out.print("*");
            }
            for (j = 1; j <= 2 * (r - i); j++) { // middle space
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) { // right star
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 1; i <= r; i++) { // upper portion
            for (j = 1; j <= i; j++) { // upper left star
                System.out.print("*");
            }
            for (j = 1; j <= 2 * (r - i); j++) { // middle upper space
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) { // upper right star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}