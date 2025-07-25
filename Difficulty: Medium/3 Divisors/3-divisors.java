class Solution {
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q) {
        int MAX = 1000000;
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        // Sieve of Eratosthenes
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Precompute all prime squares
        ArrayList<Long> primeSquares = new ArrayList<>();
        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) {
                long square = 1L * i * i;
                primeSquares.add(square);
            }
        }

        // Process each query
        ArrayList<Integer> res = new ArrayList<>();
        for (Long n : query) {
            int count = 0;
            for (Long sq : primeSquares) {
                if (sq <= n) count++;
                else break;
            }
            res.add(count);
        }

        return res;
    }
}
