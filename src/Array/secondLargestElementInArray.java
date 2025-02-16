package Array;

import java.util.*;


public class secondLargestElementInArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
 
    // Brute Force
    
    //Sort Array
    Arrays.sort(arr);
    int n = arr.length;
    int largest = arr[arr.length-1];
    
    //There might be a case, your 2nd largest element might not exist, In that case,
    //Keep it as -1.
    int secondLargest = -1;
    
    //After finding the largest element, Please check from n-2 upto 0 index
    //If they are not matching with largest element, then arr[i] will be 2nd largest
    for(int i=n-2;i>=0;i--){
        if(arr[i]!=largest){
            secondLargest = arr[i];
            break;
        }
    }
    
    return secondLargest;
    
    }
    
}
