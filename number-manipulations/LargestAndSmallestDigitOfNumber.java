public class LargestAndSmallestDigitOfNumber {
    public static void main(String args[]){
        int n = 123490856;
        int original=n;
        n=Math.abs(n);
        int largest=0;
        int smallest=n%10;
        if(n==0) smallest = largest = n;
        while(n>0){
            int digit = n%10;
            if(digit>largest) largest=digit;
            if(digit<smallest) smallest=digit;
            n/=10;
        }
        System.out.println("Largest digit of "+original+" is "+largest);
        System.out.println("Smallest digit of "+original+" is "+smallest);

    }
}
