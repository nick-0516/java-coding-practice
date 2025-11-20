/*
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 

 each row starts and ends with one
 each inner element is sum of aboveLeft and aboveRight
 val=val*(i-j)/(j+1); formula to calculate inner elements.
 for 3rd row 2nd element -> 2
i=2, j=0, val=1 //remember that current val is calculated in the prev step itself, means, element '2'(j=1) is calculated when j=0
1*(2-0)/(0+1)
1*2/1=2

 */
public class pascalsTriangle {
    public static void main(String args[]){
        int n = 5;
        for(int i=0;i<n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            int val=1;
            for(int j=0;j<=i;j++){
                System.out.print(val+" ");
                val=val*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    
}
