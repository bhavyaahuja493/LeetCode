class Solution {
    public int maxDepth(String s) {
         int count=0;
        int max=0;
         for (char ch : s.toCharArray()){//convert krne ke liye
         if(ch=='('){
         count++;
         if(count>max)
         {
            max=count;
         }}
         else if(ch==')')
         {
            count--;
         }
        }
         return max;
         }
        }