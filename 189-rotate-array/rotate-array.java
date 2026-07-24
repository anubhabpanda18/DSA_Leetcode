class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        ArrayList<Integer> temp = new ArrayList<>();

        // Store last k elements
        for(int i = n - k; i < n; i++) {
            temp.add(nums[i]);
        }

        // Shift remaining elements
        for(int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Copy temp to front
        for(int i = 0; i < k; i++) {
            nums[i] = temp.get(i);
        }
    }
}