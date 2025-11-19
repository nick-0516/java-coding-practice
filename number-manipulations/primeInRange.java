public class primeInRange {
     public static void main(String[] args) {
        int start = 10;
        int end = 50;

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;          // 2 is prime
        if (n % 2 == 0) return false;     // skip even numbers

        for (int i = 3; i <= Math.sqrt(n); i+=2) { // i+=2 -> we have already skiped even numbers above, no point testing with even numbers
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}