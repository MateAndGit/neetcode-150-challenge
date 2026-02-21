package Arrays_Hashing;

import java.util.HashMap;

public class Valid_Anagram {

    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for(int j = 0; j < t.length(); j++) {
            char cht = t.charAt(j);
            if(!map.containsKey(cht)) return false;

            int count = map.get(cht);
            map.put(cht, count - 1);
        }

        for(int val : map.values()) {
            if(val != 0) {
                return false;
            }
        }
        return true;
    }
}
