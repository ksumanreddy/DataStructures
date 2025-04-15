class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int total = n+m;
        int[] nums = new int[total];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                nums[k++]=nums1[i];
                i++;
            }else{
                nums[k++]=nums2[j];
                j++;
            }
        }
        while(i<n){
            nums[k++]=nums1[i++];
        }
        while(j<m){
           nums[k++]=nums2[j++];
        }
        int index = total/2;
        if(total%2 == 0){
            return (nums[index]+nums[index-1])/2.0;
        }
        return (double) nums[index];
    }
}