package String;

/**
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 * <p>
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * <p>
 * 注意：
 * <p>
 * 你可以假设两个字符串均只含有小写字母。
 * <p>
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 **/
public class No_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] randomArr = new int[26];
        int[] magazineArr = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            int cnt = ransomNote.charAt(i) - 'a';
            randomArr[cnt]++;
        }

        for (int j = 0; j < magazine.length(); j++) {
            int cnt = magazine.charAt(j) - 'a';
            magazineArr[cnt]++;
        }

        for (int k = 0; k < 26; k++) {
            if (randomArr[k] > magazineArr[k]) {
                return false;
            }
        }
        return true;
    }
}
