public class sumOfDigitsOfNumber {
    public static void main(String args[]){
        int n = 4589;
        int original=n;
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum of digits of "+original+" is "+sum);
    }
}
