import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int[] response = twoSum(nums, 9);
        System.out.println(response);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[0];
    }
}
