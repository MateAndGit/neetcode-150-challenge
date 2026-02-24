package Arrays_Hashing;

public class Products_of_Array_Except_Self {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int sum = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i == j) {
                    continue;
                }
                sum *= nums[j];
            }
            result[i] = sum;
        }

        return result;
    }
}
