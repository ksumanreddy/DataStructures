class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0;
        int n=nums.length;
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=nums[i];
        }

        for(int i=0;i<n;i++){
            if(num[i]!=val){
                nums[k++]=num[i];
            }
        }
        return k;
    }
}