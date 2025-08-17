class Solution {
    public int[] twoSum(int[] nums, int target) {
        // This is an optimized solution using a HashMap to store the indices of the numbers.
        // It has O(n) time complexity, which is much better than the brute force approach
        // This solution iterates through the array once, checking if the complement of the current number exists in the map.
        // If it does, we return the indices of the current number and its complement.
        //HashMap is used to store the numbers and their indices for quick lookup.
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                //if the complement exists in the map, we found the two indices
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return new int[]{}
        // This line returns an empty array if no solution is found.
        // new keywords are used to create a new array with the specified size.

        //my approach O(n^2) time complexity
        // This is a brute force solution that checks every pair of numbers.
        // It is not efficient for large arrays.
        
        // int len = nums.length;
        // int[] indices = new int[2];
        // for(int i=0; i < len; i++){
        //     for(int j=0; j < len; j++){
        //         if(i != j){
        //             if(nums[i] + nums[j] == target){
        //                 indices[0] = i;
        //                 indices[1] = j;
        //                 return indices;
        //             }
        //         }
        //     }
        // }
        //return indices;
    }
}