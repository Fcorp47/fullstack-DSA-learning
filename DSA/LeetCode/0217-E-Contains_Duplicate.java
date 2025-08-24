class Solution {
    public boolean containsDuplicate(int[] nums) {
        // This is an optimized solution using a HashSet to track seen numbers.
        // It has O(n) time complexity, which is much better than the brute force approach
        // This solution iterates through the array once, checking if the number already exists in the set.
        // If it does, we return true indicating a duplicate is found.
        // HashSet is used to store the numbers for quick lookup.
        // hashmaps can also be used but here we dont need to store the count of elements
        // so hashset is more appropriate
       HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;   
            }
            set.add(num);
        }
        return false;
    }
    
}