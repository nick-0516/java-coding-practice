/*
A number is Strong if the sum of factorial of its digits equals the number itself.

Examples:
    145 → 1! + 4! + 5! = 1 + 24 + 120 = 145 
    2 → 2! = 2 
    40585 → also a strong number
 */
public class strongNumber {
    public static void main(String args[]){
        int n=145;
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum+=factorial(digit);
            n/=10;
        }
        if(sum==original) System.out.println(original+" is a Strong number");
        else System.out.println(original+" is not a Strong number");
    }
    static int factorial(int n ){
        if(n==1||n==0) return 1;
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
}
