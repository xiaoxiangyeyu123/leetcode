package String;

import java.util.Stack;

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 示例 2：
 * <p>
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 示例 3：
 * <p>
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 **/

public class No_151 {
    public static String reverseWords(String s) {
        String[] strArr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            sb.append(strArr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String the_sky_is_blue = reverseWords("the sky is blue");
        System.out.println(the_sky_is_blue);
    }
}
