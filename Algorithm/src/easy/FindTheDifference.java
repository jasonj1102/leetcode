package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author jie
 * @version 1.0
 * success come from self-discipline
 * @date 2020/12/18 18:07
 * 题目：找不同
 */

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for(int i = 0 ;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0 ;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
            if(arr[t.charAt(i)-'a']<0){
                return t.charAt(i);
            }
        }
        return ' ';
    }
}
