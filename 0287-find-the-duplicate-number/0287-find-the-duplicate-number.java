class Solution {
    public int findDuplicate(int[] nums) {

        boolean[] a = new boolean[nums.length];

        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if(a[num] == true) {
                return num;
            }

            a[num] = true;
        }

        return -1;
    }
}