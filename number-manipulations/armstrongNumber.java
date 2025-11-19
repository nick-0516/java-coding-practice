/*
 A number is Armstrong if the sum of its digits raised to the power of the number of digits equals the number itself.
Examples:
    153 → 1³ + 5³ + 3³ = 153
    370 → 3³ + 7³ + 0³ = 370
    1634 → 1⁴ + 6⁴ + 3⁴ + 4⁴ = 1634

 */
public class armstrongNumber {
    public static void main(String args[]){
        int num = 371;
        int original = num;

        int digits = String.valueOf(original).length();
        int sum = 0;
    
        while(num>0){
            int digit = num%10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if(sum==original)
            System.out.println(original+" is an Armstrong number");
        else
            System.out.println(original+" is not an Armstrong number");

    }

}
