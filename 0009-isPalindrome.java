class Solution {
    public boolean isPalindrome(int x) {
     ArrayList<Integer> al= new ArrayList<>();
     if(x <0) return false;
    int a=x;
    int p;
     while(a!=0){
       p=a%10;
         al.add(p);
         a/=10;
     }
     int start=0;
     int end= al.size()-1;
     while(start<end){
         if(al.get(start) != al.get(end)){
             return false;
         }
         start++;
         end--;
     }
            return true;
    }
}
