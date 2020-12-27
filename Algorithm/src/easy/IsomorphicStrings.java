package easy;

import java.util.HashMap;

/**
 * @author jie
 * @version 1.0
 * success come from self-discipline
 * @date 2020/12/27 14:58
 * 题目：同构字符串
 * 解法：通过双向的映射，创建两个哈希表
 */

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> h1 = new HashMap<>();
        HashMap<Character,Character> h2 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i), y = t.charAt(i);
            if ((h1.containsKey(x) && h1.get(x) != y) || (h2.containsKey(y) && h2.get(y) != x)) {
                return false;
            }
            h1.put(x, y);
            h2.put(y, x);
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings i = new IsomorphicStrings();
        i.isIsomorphic("aa","ab");
    }
}
