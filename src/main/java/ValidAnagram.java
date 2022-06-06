import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        boolean isAnagram = isAnagram("anagram", "nagaram");
        System.out.println("Anagram: " + isAnagram);

        isAnagram = isAnagram("rat", "car");
        System.out.println("Anagram: " + isAnagram);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }

        for (Character c : sMap.keySet()) {
            if (!sMap.get(c).equals(tMap.get(c))) return false;
        }
        return true;
    }


}
