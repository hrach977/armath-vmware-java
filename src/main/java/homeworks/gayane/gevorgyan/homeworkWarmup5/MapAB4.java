package homeworks.gayane.gevorgyan.homeworkWarmup5;

import java.util.HashMap;
import java.util.Map;

public class MapAB4 {
    public static void main(String[] args) {
        Map<String, String> result = mapAB4(new HashMap<>(){{
            put("a", "aaa");
            put("b", "bb");
            put("c","cake");
        }});
        System.out.println(result.get("a"));
        System.out.println(result.get("b"));
        System.out.println(result.get("c"));
    }

//    Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
//    then set "c" to have the longer value.
//    If the values exist and have the same length, change them both to the empty string in the map.
//
//    mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
//    mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
//    mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}

    static Map<String, String> mapAB4(Map<String, String> map){
        if(map.get("a").length() >  map.get("b").length()){
            map.put("c", map.get("a"));
        }
        else if (map.get("a").length() <  map.get("b").length()){
            map.put("c", map.get("b"));
        }
        else{
            map.put("a", "");
            map.put("b", "");
            map.put("c", "");
        }
        return map;
    }
}
