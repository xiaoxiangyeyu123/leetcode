package String;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 * <p>
 * 输入: "leetcode"
 * 输出: "leotcede"
 **/

public class No_345 {

    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int low = 0;
        int high = s.length() - 1;
        char ch[] = s.toCharArray();

        while (low < high) {
            while (low < high && !set.contains(ch[low]))
                low++;
            char temp = ch[low];
            while (low < high && !set.contains(ch[high]))
                high--;
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
        return new String(ch);
    }
}
