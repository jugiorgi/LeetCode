import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean contains = containsDuplicate(nums);
        System.out.println("Contains duplicate: " + contains);

        nums = new int[]{1, 2, 3, 1};
        contains = containsDuplicate(nums);
        System.out.println("Contains duplicate: " + contains);

        nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        contains = containsDuplicate(nums);
        System.out.println("Contains duplicate: " + contains);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }

        return false;
    }
}
