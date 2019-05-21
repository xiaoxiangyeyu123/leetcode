package String;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 **/
public class No_125 {


    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; ) {
            char ic = s.charAt(i);
            char jc = s.charAt(j);
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ic += ' ';
            }
            if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
                jc += ' ';
            }
            if (!(ic >= 'a' && ic <= 'z' || ic >= '0' && ic <= '9')) {
                i++;
                continue;
            }
            if (!(jc >= 'a' && jc <= 'z' || jc >= '0' && jc <= '9')) {
                j--;
                continue;
            }
            if (jc != ic) return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        isPalindrome("race a car");
    }
}