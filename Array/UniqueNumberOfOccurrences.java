/**
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.
*/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int val : arr) 
        {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        
        for(int val: map.values())
        {
            if(set.contains(val))
                 return false;
            set.add(val);
        }
        
        return true;
        
        // for(Map.Entry<Integer,Integer> entry: map.entrySet())
        // {
        //     if(set.contains(entry.getValue()))
        //         return false;
        //     else
        //         set.add(entry.getValue());
        // }
        // return true;
        
    }
}
