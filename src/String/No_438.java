package String;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 * <p>
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 * <p>
 * 说明：
 * <p>
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 * 示例 1:
 * <p>
 * 输入:
 * s: "cbaebabacd" p: "abc"
 * <p>
 * 输出:
 * [0, 6]
 * <p>
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 * 示例 2:
 * <p>
 * 输入:
 * s: "abab" p: "ab"
 * <p>
 * 输出:
 * [0, 1, 2]
 * <p>
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
 *
 *
 * 1. 做一个循环，start先不动，拿到end指针对应的字母，between_letter中字母对应的数量加1，并让end自增
 * 2. 判断一下，这个字母的数字是不是比p_letter要多了，如果是，表示出现了下面两种情况中的一种
 *      1.start到end中的字母数量比p的length大,那么肯定至少会有一个字母的数量比p_letter里多
 *      2.start到end的距离小于等于p的length，但是里面的某一个字母比p多
 *      不管是上述情况中哪一种，start都应该前进，直到这个字母的数量等于p中的字母数量。（做完这一步start和end之间的字母数量一定小于等于p的length）
 *
 * 3. 然后再判断一下，start和end之间的字母数量是不是等于p的length。如果是，表示两个坐标之间的字母和p的字母构成一样
 *      因为第二步中，一出现start和end之间的字母比p多，我们就让start前进，直到这个字母数量等于p里面的数量，确保了没有任何一个字母比p里面多
 *      当start和end之间的字母数量和p里面的一样，且start和end之间没有任何一个字母比p多，就说明他们的字母组成一模一样
 *     （因为数量一样的情况下，如果出现某个字母比p少，就一定会有另外一个字母比p多，这是充要条件）
 *
 **/

public class No_438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] p_letter = new int[26];
        for (int i = 0; i < p.length(); i++) {//记录p里面的数字分别有几个
            p_letter[p.charAt(i) - 'a']++;
        }

        int start = 0;
        int end = 0;
        int[] between_letter = new int[26];
        while (end < s.length()) {
            int c = s.charAt(end++) - 'a';//每一次拿到end指针对应的字母
            between_letter[c]++;//让这个字母的数量+1

            //如果这个字母的数量比p里面多了,说明这个start坐标需要排除
            while (between_letter[c] > p_letter[c]) {
                between_letter[s.charAt(start++) - 'a']--;
            }
            if (end - start == p.length()) {
                result.add(start);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        findAnagrams("cbaebabacd", "abc");
    }
}
