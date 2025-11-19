//Reverse a number without converting to string.
public class reverseNumber {
    public static void main(String[] args) {
        int n = 1531243;
        int revNum = 0;
        while(n>0){
            revNum = (revNum*10)+(n%10);
            n/=10;
        }
        System.out.println(revNum);
    }
}
