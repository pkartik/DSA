package Array;
class RotateArrayInRightByKEleBruteForce {
    public void rotate(int[] nums, int k) {

    int[] temp = new int[k];
    int n = nums.length;

    if (n == 0)
      return;
    k = k % n;

    if (k > n)
      return;

    for(int i=n-k; i<n;i++){
        temp[i-(n-k)]=nums[i];
    }

    for(int i=n-1; i>=k;i--){
        nums[i]=nums[i-k];
    }

    for(int i=0;i<k;i++){
        nums[i]=temp[i];
    }
    
    }
}