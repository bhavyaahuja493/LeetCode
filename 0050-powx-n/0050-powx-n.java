class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        long power = n; //stack overflow prevent
        if (power<0) {
            x = 1/x;
            power = -power; //power is used so that stack doesnot overflow
        }
        while (power>0) {
            if (power % 2 == 1) {
          res= res * x;}
            x=  x * x;
            power = power/2;
        }
        return res;
    }
}