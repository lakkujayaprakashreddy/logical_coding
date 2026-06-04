package com.tek.HDFC;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2 (optional): Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        return -1; // no majority element
    }
}
