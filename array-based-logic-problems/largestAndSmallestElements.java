public class largestAndSmallestElements {
    public static void main(String args[]){
        int arr[]={23,40,20,11,55};
        if(arr.length==0){
            System.out.println("Empty array!!");
            return;
        }
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest) largest=arr[i];
            if(arr[i]<smallest) smallest=arr[i];
        }
        System.out.println("\n Largest element in array is"+ largest);
        System.out.println("Smallest element in array is "+ smallest);
    }
}
