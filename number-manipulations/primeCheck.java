/*
A number is prime if: It is greater than 1 & It has no divisors except 1 and itself

If a number is divisible by anything greater than √n, the corresponding pair divisor will be below √n.
Example:
    For 36 → divisors:
    1×36, 2×18, 3×12, 4×9, 6×6
    → All pairings appear before √36 = 6

    This optimizes time from O(n) to O(√n).
 */
public class primeCheck {
    public static void main(String args[]){
        int n = 18;
        boolean isPrime = true;
        if(n<=1){
            isPrime=false;
        }
        else{
            for(int i = 2; i<=Math.sqrt(n); i++){ 
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n+" is Prime");
        }else{
            System.out.println(n+" is not Prime");
        }
    }
}
