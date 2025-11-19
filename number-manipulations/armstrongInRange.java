public class armstrongInRange {
    public static void main(String[] args) {
        int start = 150;
        int end = 400;

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;

        int digits = String.valueOf(original).length();
        int sum = 0;
    
        while(n>0){
            int digit = n%10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }
}

