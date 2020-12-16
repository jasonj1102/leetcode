package easy;

import java.util.HashMap;

/**
 * @author jie
 * @version 1.0
 * success come from self-discipline
 * @date 2020/12/16 17:25
 * 题目名称：单词规律
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        boolean flag = true;
        String[] str1 = s.split(" ");
        HashMap<Character,String> hashMap = new HashMap<>();
        if(pattern.length()!=str1.length){
            flag = false;
        }else {
            for(int i = 0 ; i<pattern.length(); i++){
                if(!hashMap.containsValue(str1[i])&&!hashMap.containsKey(pattern.charAt(i))){
                    hashMap.put(pattern.charAt(i),str1[i]);
                }else if(hashMap.containsKey(pattern.charAt(i))){
                    if(!hashMap.get(pattern.charAt(i)).equals(str1[i])){
                        flag = false;
                    }
                }else {
                    flag = false;
                }
            }
        }
       return flag;
    }

    public static void main(String[] args) {
        WordPattern w = new WordPattern();
        String s1 = "abba";
        String s2 = "dog cat cat dog";
        System.out.println(w.wordPattern(s1,s2));
    }
}
