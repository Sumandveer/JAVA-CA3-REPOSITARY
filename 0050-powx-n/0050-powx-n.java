
class Solution {
    public double myPow(double x, int n) {
        long p = n;
        double ans = 1;

        if(p < 0) {
            p = -p;
        }

        while(p > 0) {
            if(p % 2 == 1) {
                ans = ans * x;
            }

            x = x * x;
            p = p / 2;
        }

        if(n < 0) {
            ans = 1 / ans;
        }

        return ans;
    }
}
