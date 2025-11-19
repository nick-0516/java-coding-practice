public class noOfDigitsInNumber {
    public static void main(String args[]){
        int n = 0;
        int original=n;
        int count=0;
        n = Math.abs(n); //converting to +ve number before looping(nothing wrong in looping -ve number too)
        if(n==0) count=1;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.println("Number "+original+" has "+count+" digits in it.");
    }
}
