package Array;

class Solution {
    public static int largest(int[] arr) {
    
    for(int i=0; i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
    }
    
    return arr[arr.length-1];
    
        
    }
}
