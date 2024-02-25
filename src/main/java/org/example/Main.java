package org.example;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,20,100,200,300,400,500,1002,1003,100004};

        System.out.println("the number "+ foundNum(1002,nums) + " founded");
    }

    public  static int foundNum(int goal, int[] nums) {

        int low = 0;
        int high = nums.length - 1;


        int kh = 0;


        while (high>= low){
            int middleIndex = (low+high) / 2;
            if (nums[middleIndex] == goal){
                kh = nums[middleIndex];
                break;
            }else if (nums[middleIndex]> goal){
                high = middleIndex - 1;
            } else {
                low = middleIndex + 1;
            }
        }

        return kh;
    }
}