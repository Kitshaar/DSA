package org.example;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        int[] answers = new int[2];
        for(int i = 0; i < N; i++)
        {
            for (int j = i+1; j < N; j++)
            {
                if(target == nums[i] + nums[j])
                {
                    answers[0] = i;
                    answers[1] = j;
                    break;
                }
            }

        }
        return answers;
    }

    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        int[] nums = new int[]{2,7,11,15};
        int[] nums1 = new int[]{3, 2, 4};
        int target = 6;
        int[] answers = sum.twoSum(nums1, target);
        System.out.println("{ "+ answers[0] + ", "+ answers[1] +" }");
    }
}
