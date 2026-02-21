package Arrays_Hashing;

import java.util.HashSet;

public class Contains_Duplicate {

    public boolean hasDuplicate_1(int[] nums) {

        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            temp = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(temp == nums[j]) return true;
            }
        }
        return false;
    }

    public boolean hasDuplicate_2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
