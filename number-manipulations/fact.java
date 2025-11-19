class fact{
    //recursive method
    static long factorial(int n){
        if (n == 0 || n == 1) return 1;
        return n*factorial(n-1);
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println("Factorial of "+n+" is :"+factorial(n));

        long fact = 1;
        //iterative method
        for(int i = 1; i<=n; i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is :"+fact);
    }
}