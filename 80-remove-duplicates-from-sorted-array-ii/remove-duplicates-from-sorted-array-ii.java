class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                if(freq<2){
                    map.put(nums[i],freq+1);
                    nums[k++]=nums[i];
                }
            }else{
              map.put(nums[i],1);
              nums[k++]=nums[i];
            }
        }
        return k;
    }
}