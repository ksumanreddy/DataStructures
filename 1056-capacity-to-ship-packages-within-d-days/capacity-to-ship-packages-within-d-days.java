class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = largestSum(weights);
        int high = sumOfweights(weights);
        int ans = low;
        while(low<=high){
           int mid = low + (high-low)/2;
           if(isPossible(weights,days,mid)){
              ans = mid;
              high = mid-1;
           }else{
            low = mid+1;
           }

        }
        return ans;
    }
    public boolean isPossible(int[] weights ,int days,int mid){
        int numberOfDays=1;
        int countWeights =0;
        for(int i=0;i<weights.length;i++){
            countWeights  += weights[i];
           if(countWeights>mid){
              countWeights = weights[i];
              numberOfDays++;
              if(numberOfDays>days){
                return false;
              }
           }
        }
        return true;
    }
    private int largestSum(int[] weights){
        int largestSum = Integer.MIN_VALUE;
       for(int num : weights){
         largestSum = Math.max(num,largestSum);
       }
       return largestSum;
    }
    private int sumOfweights(int[] weights){
        int sum =0;
        for(int num : weights){
            sum += num;
        }
        return sum;
    }
}