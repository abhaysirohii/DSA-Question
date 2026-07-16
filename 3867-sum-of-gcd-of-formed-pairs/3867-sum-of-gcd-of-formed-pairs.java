class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] mx = new int[n];
        int[] prefix = new int[n];
        mx[0] = nums[0];
        for (int i = 1; i < n; i++) {
            mx[i] = Math.max(mx[i - 1], nums[i]);
        }
        for (int i = 0; i < n; i++) {
            prefix[i] = gcd(nums[i], mx[i]);
        }
        Arrays.sort(prefix);
        long sum = 0;
        int left=0;
        int right=n-1;
        while(left<right){
            sum+=gcd(prefix[left],prefix[right]);
            left++;
            right--;
        }
        return sum;
    }

    private int gcd(int a, int b) {
      while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}