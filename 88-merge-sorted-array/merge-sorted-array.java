class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] num = new int[m];
        for(int l=0;l<m;l++){
           num[l]=nums1[l];
        }
        while(i<m && j<n){
           if(num[i]<nums2[j]){
              nums1[k]=num[i];
              i++;
              k++;
           }else{
             nums1[k]=nums2[j];
             j++;
             k++;
           }
        }
        while(i<m){
            nums1[k]=num[i];
            i++;
            k++;
        }
        while(j<n){
            nums1[k]=nums2[j];
            j++;
            k++;
        }
    }
}