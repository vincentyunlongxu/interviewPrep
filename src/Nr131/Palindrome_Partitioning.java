package Nr131;

import java.util.ArrayList;

/**
 * Created by yunlongxu on 12/22/15.
 */
public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String str = "aab";
        System.out.println(partition(str));
    }

    public static ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        if (s == null || s.length() == 0) {
            return result;
        }
        partitionHelper(s, result, 0, new ArrayList<String>());
        return result;
    }

    public static void partitionHelper(String s, ArrayList<ArrayList<String>> result, int position, ArrayList<String> list) {
        if (position == s.length()) {
            result.add(new ArrayList<String>(list));
            return;
        }
        for (int i = position + 1; i <= s.length(); i++) {
            String prefix = s.substring(position, i);
            if (!isPalindrome(prefix)) {
                continue;
            }
            list.add(prefix);
            partitionHelper(s, result, i, list);
            list.remove(list.size() - 1);
        }
    }

    public static boolean isPalindrome(String prefix) {
        int start = 0;
        int end = prefix.length() - 1;
        while (start < end) {
            if (prefix.charAt(start) != prefix.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
