class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for(int i = m - 1; i >= 0; i--) {
            int carry = 0;

            for(int j = n - 1; j >= 0; j--) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int sum = a * b + result[i + j + 1] + carry;

                result[i + j + 1] = sum % 10;

                carry = sum / 10;
            }

            result[i] = carry;
        }

        String ans = "";
        int i = 0;

        while(i < result.length && result[i] == 0) {
            i++;
        }

        while(i < result.length) {
            ans = ans + result[i];
            i++;
        }

        if(ans.length() == 0) {
            return "0";
        }

        return ans;
    }
}