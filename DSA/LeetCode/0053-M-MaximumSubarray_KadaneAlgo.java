class Solution {
    public int maxSubArray(int[] nums) {

        //53 // Maximum Subarray
        // Approach: Kadane's Algorithm
        // Kadane's Algorithm is an efficient way to find the maximum sum of a contiguous subarray in an array of integers.
        // The idea is to iterate through the array while keeping track of the current subarray sum
        // and the maximum sum found so far. If the current subarray sum becomes negative, we reset it to zero,
        // as starting a new subarray from the next element would be more beneficial.
        //actual approach
        //o(n) time complexity
        //o(1) space complexity
        int maxsum = nums[0];
        int currentsum = nums[0];
        for(int i=1; i < nums.length; i++){
            
                currentsum = Math.max(nums[i], currentsum + nums[i]);
                maxsum = Math.max(maxsum, currentsum);  
        }
        return maxsum;

        //slightly modified approach
        int maxsum = nums[0];
        int currentsum = 0; 
        for(int num : nums){
            currentsum += num;
            if(currentsum > maxsum){
                maxsum = currentsum;
            }
            if(currentsum < 0){
                currentsum = 0;
            }
        }
        return maxsum;

        //brute force approach
        //o(n^2) time complexity
        int maxtotal=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0; i < nums.length; i++){
            currentsum=0;
            for(int j=i; j < nums. length; j++){
               currentsum = currentsum + nums[j];
               maxtotal = Math.max(maxtotal, currentsum);
            }
        }
        return maxtotal;
    }