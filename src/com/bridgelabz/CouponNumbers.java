package com.bridgelabz;

import java.util.Random;

public class CouponGenerator {
    // Returns a random integer between 1 and n (inclusive)
    public static int generateRandomNumber(int n) {
        Random rand = new Random();
        return rand.nextInt(n) + 1;
    }
    
    // Returns total number of random numbers needed to generate all n distinct coupon numbers
    public static int generateDistinctCoupons(int n) {
        boolean[] coupons = new boolean[n]; // stores whether each coupon has been generated yet
        int count = 0; // keeps track of the number of random numbers generated
        int distinctCount = 0; // keeps track of the number of distinct coupons generated
        
        while (distinctCount < n) {
            int coupon = generateRandomNumber(n);
            count++;
            
            if (!coupons[coupon - 1]) {
                coupons[coupon - 1] = true;
                distinctCount++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
      
         Scanner sc=new Scanner(System.in);
         int a = sc.nextInt();
        int count = generateDistinctCoupons(a);
        
        System.out.println("Total random numbers needed to generate all " + n + " distinct coupons: " + count);
    }
}
