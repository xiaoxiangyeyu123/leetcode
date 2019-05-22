package String;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * <p>
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * <p>
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: s = "paper", t = "title"
 * 输出: true
 **/

public class No_205 {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap();
        char ss;
        char tt;
        for (int i = 0; i < s.length(); i++) {
            ss = s.charAt(i);
            tt = t.charAt(i);
            if (map.containsKey(ss)) {
                if (map.get(ss) != tt) {
                    return false;
                }
            } else {
                if (map.containsValue(tt)) {
                    return false;
                }
                map.put(ss, tt);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isIsomorphic("ab", "aa");
    }
}
