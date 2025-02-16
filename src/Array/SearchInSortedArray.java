//{ Driver Code Starts
package Array;
import java.io.*;



class gfg {

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int k = Integer.parseInt(read.readLine());

            SearchInSortedArray obj = new SearchInSortedArray();

            System.out.println(obj.searchInSorted(arr, k));
        }
    }
}
// } Driver Code Ends


class SearchInSortedArray {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        
        return false;
    }
}