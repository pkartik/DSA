package Array;
class MoveZerosToEndBruteForce {
    public void moveZeroes(int[] nums) {

    int n = nums.length;
    int j = 0;
    int count = 0;
     
    for(int i=0; i<n; i++){
        if(nums[i]==0){
            count++;
        }
    }
    
    int[] arrWithoutZeros = new int[n-count];

    for(int i=0; i<n; i++){

        if(nums[i]!=0){
           arrWithoutZeros[j]=nums[i];
           j++;
        }
    }

    for(int i=0;i<n;i++){
        if(i<(n-count)){
            nums[i]=arrWithoutZeros[i];
        }else{
            nums[i]=0;
        }
    }

    }
}