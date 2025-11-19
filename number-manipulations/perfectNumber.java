/*
A number is Perfect if the sum of its proper divisors (excluding the number itself) is equal to the number.
Example:
    6 → divisors: 1, 2, 3 → sum = 6 
    28 → divisors: 1, 2, 4, 7, 14 → sum = 28 
    496, 8128 (also perfect numbers)

 */
public class perfectNumber {
    public static void main(String args[]){
        int n = 496;

        if(isPerfect(n)){
            System.out.println(n+" is a Perfect number");
        }else{
            System.out.println(n+" is not a Perfect number");
        }
    }
    static boolean isPerfect(int n){
        if(n<=1) return false;
        int sum=0;
        for(int i=1; i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
}