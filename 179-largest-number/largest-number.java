class Solution {
    public String largestNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        list.sort((a,b)-> ("" +b+a).compareTo(""+a+b));
        if(list.get(0)==0) return "0";
        StringBuilder sb = new StringBuilder();
        for(int num : list){
            sb.append(num);
        }

        return sb.toString();
    }
}