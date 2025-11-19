/*
    A sequence where each number is the sum of previous two
 */
public class fibo {
    //recursive method
    static int fibonacci(int n){
        if (n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String args[]){
        int n = 6;

        //iterative method
        int a = 0;
        int b = 1;
        for(int i = 1; i<=n; i++){
            System.out.print(" "+a);
            int next = a+b;
            a = b;
            b = next;    
        }
        //printing recursive result
        System.out.print(" Fibonacci Series of "+n+" : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
