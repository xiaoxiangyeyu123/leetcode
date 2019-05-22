package String;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 **/

public class No_242 {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (smap.containsKey(s.charAt(i))) {
                smap.put(s.charAt(i), smap.get(s.charAt(i)) + 1);
            } else {
                smap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (tmap.containsKey(t.charAt(i))) {
                tmap.put(t.charAt(i), tmap.get(t.charAt(i)) + 1);
            } else {
                tmap.put(t.charAt(i), 1);
            }
        }
        for (Character temp : smap.keySet()) {
            int sNums = smap.get(temp);
            if (tmap.containsKey(temp)) {
                int tNums = tmap.get(temp);
                if (tNums != sNums) {
                    return false;
                }
            } else {
                return false;
            }

        }
        return true;
    }

}
