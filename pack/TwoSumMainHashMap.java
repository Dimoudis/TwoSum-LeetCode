package pack;

import java.util.HashMap;
import java.util.Map;

public class TwoSumMainHashMap {
    public static void main(String[] args) {
        // Hard-coded array and target
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // HashMap solution
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                found = true;
                break;
            }
            map.put(nums[i], i);
        }

        if (found) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
