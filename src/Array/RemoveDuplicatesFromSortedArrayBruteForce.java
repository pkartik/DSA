package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArrayBruteForce {
    public int removeDuplicates(int[] nums) {
    Set<Integer> set = new HashSet<>();
    
    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
    }

    int index = 0;

    for(int it : set){
        nums[index]=it;
        index++;
    }

    return index;

    }  
}


//TC : NlogN (To insert into Set) + N
//SC : O(N)
