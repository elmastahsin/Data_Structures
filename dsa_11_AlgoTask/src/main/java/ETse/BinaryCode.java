package ETse;

public class BinaryCode {


        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4};
            cardinalitySort(nums);
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        public static int binaryCardinality(int n) {
            int count = 0;
            while (n > 0) {
                count += n & 1;
                n >>= 1;
            }
            return count;
        }

        public static void cardinalitySort(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (binaryCardinality(nums[j]) > binaryCardinality(nums[j+1]) ||
                            (binaryCardinality(nums[j]) == binaryCardinality(nums[j+1]) && nums[j] > nums[j+1])) {
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }
        }
    }

