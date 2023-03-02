package com.bridgelabz;

public class CouponNumbers {
    
    public static int generateRandomNumber(int n) {
        Random rand = new Random();
        return rand.nextInt(n) + 1;
    }
    
    // Function to generate distinct coupon numbers
    public static int[] generateDistinctCoupons(int n) {
        int[] coupons = new int[n];
        int count = 0;
        
        while (count < n) {
            int coupon = generateRandomNumber(n);
            boolean isDistinct = true;
            
            // Check if the generated coupon number is already present in the array
            for (int i = 0; i < count; i++) {
                if (coupons[i] == coupon) {
                    isDistinct = false;
                    break;
                }
            }
            
            // If the generated coupon number is distinct, add it to the array
            if (isDistinct) {
                coupons[count] = coupon;
                count++;
            }
        }
        
        return coupons;
    }
    
    // Function to find the total random numbers needed to have all distinct numbers
    public static int findTotalRandomNumbers(int n) {
        int[] coupons = new int[n];
        int count = 0;
        int randomCount = 0;
        
        while (count < n) {
            int coupon = generateRandomNumber(n);
            randomCount++;
            boolean isDistinct = true;
            
            // Check if the generated coupon number is already present in the array
            for (int i = 0; i < count; i++) {
                if (coupons[i] == coupon) {
                    isDistinct = false;
                    break;
                }
            }
            
            // If the generated coupon number is distinct, add it to the array
            if (isDistinct) {
                coupons[count] = coupon;
                count++;
            }
        }
        
        return randomCount;
    }
    public static void main(String[] args) {
        int n = 10;
        int[] coupons = generateDistinctCoupons(n);
        
        System.out.println("Distinct coupon numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(coupons[i] + " ");
        }
        System.out.println();
        
        int totalRandomNumbers = findTotalRandomNumbers(n);
        System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumbers);

    }
}
