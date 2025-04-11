class Solution {
    public int removeDuplicates(int[] nums) {
       int n = nums.length;
       int k=0;
       HashSet<Integer> map = new HashSet<>();
       for(int i=0;i<n;i++){
          if(!map.contains(nums[i])){
            map.add(nums[i]);
            nums[k]=nums[i];
            k++;
          }
       }
       return map.size();
    }
}