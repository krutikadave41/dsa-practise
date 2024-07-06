package com.krutika.practise.binarySearch;

public class KokoEatingBananas {

	public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = getMaxSpeed(piles);
        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            if (canEatItAll(piles, h, mid)) {
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    boolean canEatItAll(int[] piles, int h, int mid) {
        int actualHours = 0;
        for (int pile : piles) {
            actualHours += (int) Math.ceil((double) pile / mid);
        }
        
        return actualHours <= h;
    }

    int getMaxSpeed(int[] piles) {
        int maxSpeed = 0;
        for (Integer pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }
        return maxSpeed;
    }
    
    public static void main(String[] args) {
    	 int[] piles = {3,6,7,11};
         int h = 8;
         KokoEatingBananas obj = new KokoEatingBananas();
         System.out.println(obj.minEatingSpeed(piles, h));
	}
}
