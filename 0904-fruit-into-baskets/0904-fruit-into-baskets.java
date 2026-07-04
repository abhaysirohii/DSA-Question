class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) {
            return 0;
        }

        // Map to store the frequency of each fruit type in our current window
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Add the current fruit to our basket
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            // If we have more than 2 types of fruit, shrink the window from the left
            while (basket.size() > 2) {
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1);
                
                // If the count drops to 0, completely remove the fruit type from the basket
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                left++; // Move the left pointer forward
            }

            // Calculate the maximum window size seen so far
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}