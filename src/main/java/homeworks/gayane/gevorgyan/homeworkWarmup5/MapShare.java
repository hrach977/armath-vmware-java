package homeworks.gayane.gevorgyan.homeworkWarmup5;

import java.util.HashMap;
import java.util.Map;

public class MapShare {
    public static void main(String[] args) {
        Map<String, String> result = mapShare(new HashMap<>(){{
            put("a", "aaa");
            put("c", "meh");
            put("d", "hi");
        }});
        System.out.println(result.get("a"));
        System.out.println(result.get("b"));
        System.out.println(result.get("c"));
        System.out.println(result.get("d"));
    }

//    Modify and return the given map as follows: if the key "a" has a value,
//    set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
//
//    mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
//    mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
//    mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

    static Map<String, String> mapShare(Map<String, String> map){
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
