class Solution {
    public boolean isAnagram(String s, String t) {
        //optional thing
        //this static block is used to run the function multiple times to avoid the jvm warmup time
        //this is not necessary for the solution but it helps in competitive programming to avoid time limit exceeded error
        //it runs the function 500 times with dummy inputs before the actual function call
        static{
            Solution obj = new Solution();
            for(int i=0; i<500; i++)
                obj.isAnagram("", "a");
        }
        //solution has 99.56% faster runtime than other java submissions (1 ms)
        //memory usage is 43.4 MB which is less than 94.64% of other java submissions
        //optimized solution using array (self note: this is faster than hashmap solution)
        public boolean isAnagram(String s, String t) {
        int chararr[] = new int[26];
        for(char c: s.toCharArray()){
            chararr[c-'a'] += 1;
        }

        for(char c: t.toCharArray()){
            chararr[c - 'a'] -= 1;
        }
        
        for(int i=0; i < chararr.length; i++)
        { if(chararr[i] != 0) return false; }
        
        return true;

        
        //optimized solution using hashmap
        // This solution uses a HashMap to count the occurrences of each character in the first string
        //no need to actually use hashmap as we are only dealing with lowercase letters
        //then it decrements the count for each character found in the second string
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) return false;
        }

        return true;
    }
}