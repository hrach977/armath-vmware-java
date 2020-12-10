package lessons.warmup1;

import java.util.HashMap;
import java.util.Map;

public class Warmup5 {

    public static void main(String[] args) {
    Map<String, Boolean> result = wordMultiple(new String[]{"a", "b", "a", "c", "b"});
        System.out.println("map size: " + result.size());
        System.out.println(result.get("a"));
        System.out.println(result.get("b"));
        System.out.println(result.get("c"));
    }


//    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
//    and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing
//    it with the empty string.
//
//    mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
//    mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
//    mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
    static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

//    Given a map of food keys and topping values, modify and return the map as follows:
//        if the key "ice cream" is present, set its value to "cherry".
//    In all cases, set the key "bread" to have the value "butter".
//
//    topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
//    topping1({}) → {"bread": "butter"}
//    topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
    static Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }


//    Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values,
//    remove them both.
//
//            mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
//    mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
//    mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
    static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

//    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
//    always with the value 0. For example the string "hello" makes the pair "hello":0.
//    We'll do more complicated counting later, but for this problem the value is simply 0.
//
//    word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
//    word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
//    word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
    static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> res = new HashMap<>();
        for (String s : strings) {
            res.put(s, 0);
        }
        return res;
    }

//    The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
//    different string, with the value the number of times that string appears in the array.
//
//    wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
//    wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
//    wordCount(["c", "c", "c", "c"]) → {"c": 4}
    static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> res = new HashMap<>();
        for (String s : strings) {
            if (res.containsKey(s)) {
                int count = res.get(s);
                res.put(s, count+1);
            } else {
                res.put(s, 1);
            }
        }
        return res;
    }


//    Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value
//        is true if that string appears 2 or more times in the array.
//
//    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//    wordMultiple(["c", "c", "c", "c"]) → {"c": true}
    static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (String s : strings) {
            if (result.get(s) == null) {
                result.put(s, false);
            } else {
                result.put(s, true);
            }
        }
        return result;
    }
}
