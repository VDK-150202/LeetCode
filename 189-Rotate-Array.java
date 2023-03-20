class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> al= new ArrayList<>();
        if(k > nums.length){
            k= k% nums.length;
        }
        int start= nums.length-k;
        for(int i= start; i<nums.length; i++){
            al.add(nums[i]);
        }
        for( int i=0; i<start; i++){
            al.add(nums[i]);
        }
        
      
       for(int i=0; i<nums.length; i++){
           nums[i]= al.get(i);
       }
    }
}
