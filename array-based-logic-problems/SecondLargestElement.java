import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String args[]){
        int arr[]={23,40,20,11,55};
        int second_largest;
        if(arr.length==0){
            System.out.println("Empty array!!");
            return;
        }else if(arr.length==2){
            second_largest=Math.min(arr[0],arr[1]);
            System.out.println("Second largest element of array is "+second_largest);
            return;
        }
        Arrays.sort(arr);
        System.out.println("Second largest element of array is " + arr[arr.length-2]);
    }
}
