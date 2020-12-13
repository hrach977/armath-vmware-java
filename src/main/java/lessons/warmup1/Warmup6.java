package lessons.warmup1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Warmup6 {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("red");
//        list.add("green");
//        list.add("orange");
//        list.add("white");
//        list.add("black");
////        for (String element : list) {
////            System.out.println(element);
////        }
//        System.out.println(list);
//        list.add(0, "pink");
//        System.out.println(list);
//        list.add(2, "brown");
//        System.out.println(list);
//        list.add("the last one");
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.get(0));
//        System.out.println(list.get(3));
//        list.set(3, "not green");
//        System.out.println(list);
//        System.out.println(list.contains("not green"));
//        list.remove(3);
//        System.out.println(list.size());
//        System.out.println(list);
//        System.out.println(list.contains("not green"));
//
//        Collections.sort(list);
//        System.out.println(list);
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(5);
//        list.add(2);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

//        List<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(44);
//        list.add(55);
//        list.add(22);
//        System.out.println(list);
////        Collections.copy(list, list2);
////        System.out.println("after copy");
////        System.out.println("list: " + list);
////        System.out.println("list2: " + list2);
//        List<Integer> sublist = list.subList(0, 2);
//        System.out.println(sublist);
        List<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Blue");
        c1.add("white");
        c1.add("Black");
        System.out.println(c1);
//        Collections.swap(c1, 0, 2);
//        System.out.println("after swap");
//        System.out.println(c1);
        List<String> c2 = new ArrayList<>();
        c2.add("1");
        c2.add("2");
        c2.add("3");
        c2.add("4");
        c2.add("5");
        System.out.println(c2);

        List<String> result = new ArrayList<>();
        result.addAll(c1);
        result.addAll(c2);
        System.out.println("result: " + result);
        System.out.println(result.size());
        System.out.println(result.isEmpty());
        result.removeAll(c2);
        System.out.println("result: " + result);
        System.out.println(result.size());
        System.out.println(result.isEmpty());
        for (int index =0; index<result.size(); index++) {
            System.out.println(result.get(index));
        }
        result.removeAll(result);
        System.out.println("result: " + result);
        System.out.println(result.size());
        System.out.println(result.isEmpty());


    }
}
