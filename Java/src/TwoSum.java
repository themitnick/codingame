import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static void main(String[] args) {
        TwoSum app = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = app.twoSum2(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (seen.containsKey(complement)) {
                return new int[] {
                        seen.get(complement), i
                };
            }

            seen.put(nums[i], i);
        }

        throw new IllegalArgumentException(
                "Aucune solution trouvée"
        );
    }
}
