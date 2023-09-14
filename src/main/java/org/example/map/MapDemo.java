package org.example.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {
        String s = "Good Morning Tom";
        Map<Character,Integer> charMap = new HashMap<>();

        String[] strArray = s.split("");
        Map<String, Long> collect = Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        System.out.println(collect.get("o"));

        List<String> collect1 = collect.entrySet().stream().filter(s1 -> s1.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect1);

        LinkedHashMap<String, Long> collect2 = Arrays.stream(strArray).map(String::toLowerCase)
                .collect(Collectors.groupingBy(s1 -> s1, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect2);

        for (int i=0;i<s.length();i++){
            //charMap.get(s.charAt(i))
            if (charMap.containsKey(s.charAt(i))){
                int val = charMap.get(s.charAt(i));
                charMap.put(s.charAt(i),++val);
            }else {
                charMap.put(s.charAt(i),1);
            }
        }
        System.out.println(charMap);

        System.out.println(lengthOfLongestSubstring("ggggglpp"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (charIndexMap.containsKey(c)) {
                start = Math.max(start, charIndexMap.get(c) + 1);
            }
            charIndexMap.put(c, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
