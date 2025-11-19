public class palindromeNumber {
    public static void main(String args[]){
        int n = 12321;

        if(isPalindrome(n)) System.out.println(n+" is a Palindrome number");
        else System.out.println(n+" is not a Palindrome number");

    }
    static boolean isPalindrome(int n){
        int original=n;
        int sum = 0;
        while(n>0){
            sum=(sum*10)+(n%10);
            n/=10;
        }
        return sum==original;
    }
}
