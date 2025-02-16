package Array;
import java.util.*;

public class secondLargestElementInArrayOptimal {

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
 
    int largest = arr[0];
    int secondLargest = -1;
    int n = arr.length;
    
    for(int i=1;i<n;i++){
        if(arr[i]>largest){
            secondLargest = largest;
            largest = arr[i];
        }else if(arr[i]<largest && arr[i]> secondLargest) {
             secondLargest = arr[i];
        }
    }
    
    return secondLargest;
    
    }
    
}