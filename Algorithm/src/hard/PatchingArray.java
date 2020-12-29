package hard;

import java.util.Scanner;

/**
 * @author jie
 * @version 1.0
 * success come from self-discipline
 * @date 2020/12/29 14:16
 * 题目：按要求补齐数组
 * 题解：贪心算法
 */

public class PatchingArray {
    public int minPatches(int[] nums, int n) {
        int index = 0,result = 0;
        long x = 1;
        while (x<=n){
            if(index<nums.length&&nums[index]<=x){
                x+=nums[index];
                index++;
            }else {
                x*=2;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int n = sc.nextInt();
        int[] array = new int[arrayLength];
        for(int i = 0 ; i< arrayLength ; i++){
            array[i] = sc.nextInt();
        }
        PatchingArray patchingArray = new PatchingArray();
        int result = patchingArray.minPatches(array,n);
        System.out.println(result);
    }
}
