package org.example;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] answers = new int[2];
        /*
           array values       3       2     4              target     6
           loop iteration     0       1     2
           data inputted      3,0     2,1   4,2
           if condition       6-3     6-2   6-4
           result             3       4     2

           check if present   no      no    yes

         */
        for (int i =0; i < nums.length; i++) {
            /*
            Not prematurely adding value as key and key as value pair
            to ensure that target like 6 can be the sum of 3 + 3.
             */
            if (map.containsKey(target - nums[i])) {
                answers[1] = i;
                answers[0] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        return answers;
    }

    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        int[] nums = new int[]{2,7,11,15};
        int target1 = 9;
        int[] answers = sum.twoSum(nums, target1);
        System.out.println("{ "+ answers[0] + ", "+ answers[1] +" }");
        int[] nums1 = new int[]{3, 3};
        int target = 6;
        int[] answers1 = sum.twoSum(nums1, target);
        System.out.println("{ "+ answers1[0] + ", "+ answers1[1] +" }");
    }
}
