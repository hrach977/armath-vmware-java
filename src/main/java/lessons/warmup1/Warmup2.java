package lessons.warmup1;

public class Warmup2 {

    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));
    }



//    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//
//
//    helloName("Bob") → "Hello Bob!"
//    helloName("Alice") → "Hello Alice!"
//    helloName("X") → "Hello X!"
    static String helloName(String name) {
        return "Hello " + name + "!";
    }


//    Given an "out" string length 4, such as "<<>>", and a word,
//    return a new string where the word is in the middle of the out string,
//    e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
//
//    makeOutWord("<<>>", "Yay") → "<<Yay>>"
//    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//    makeOutWord("[[]]", "word") → "[[word]]"
    static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

//    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//
//    firstHalf("WooHoo") → "Woo"
//    firstHalf("HelloThere") → "Hello"
//    firstHalf("abcdef") → "abc"
    static String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }

//    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
//
//
//    nonStart("Hello", "There") → "ellohere"
//    nonStart("java", "code") → "avaode"
//    nonStart("shotl", "java") → "hotlava"
    static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

//    Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
//
//
//            theEnd("Hello", true) → "H"
//    theEnd("Hello", false) → "o"
//    theEnd("oh", true) → "o"
    static String theEnd(String str, boolean front) {
        if (front) {
            return String.valueOf(str.charAt(0));
        }
        return String.valueOf(str.charAt(str.length()-1));
    }

//    Given a string, return true if it ends in "ly".
//
//    endsLy("oddly") → true
//    endsLy("y") → false
//    endsLy("oddy") → false
    static boolean endsLy(String str) {
       return str.endsWith("ly");
    }

//    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
//
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"
    static String middleThree(String str) {
        return str.substring(str.length()/2-1, str.length()/2+2);
    }

//    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
//
//
//    lastChars("last", "chars") → "ls"
//    lastChars("yo", "java") → "ya"
//    lastChars("hi", "") → "h@"
    static String lastChars(String a, String b) {
        char first;
        char second;
        if (!a.isEmpty()) {
            first = a.charAt(0);
        } else {
            first = '@';
        }
        if (!b.isEmpty()) {
            second = a.charAt(a.length()-1);
        } else {
            second = '@';
        }
        return first + "" + second;
    }

//    Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
//
//
//            seeColor("redxx") → "red"
//    seeColor("xxred") → ""
//    seeColor("blueTimes") → "blue"
    static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }


//    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
//    The string may be any length. If there are fewer than 2 chars, use whatever is there.
//
//    extraFront("Hello") → "HeHeHe"
//    extraFront("ab") → "ababab"
//    extraFront("H") → "HHH"
    static String extraFront(String str) {
//        if (str.length()<2) {
//            return str+str+str;
//        }
//        String substring = str.substring(0, 2);
        String res = str.length()<2 ? str : str.substring(0, 2); //ternary if statement/ ternary operator
        return res + res + res;
    }


//    Given a string and a second "word" string, we'll say that the word matches the string
//            if it appears at the front of the string, except its first char does not need to match exactly.
//    On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo"
//    the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
//
//
//    startWord("hippo", "hi") → "hi"
//    startWord("hippo", "xip") → "hip"
//    startWord("hippo", "i") → "h"
    static String startWord(String str, String word) {
        int size = word.length();
        if (size == 1) {
            return str.charAt(0) + "";
        }
        if (str.substring(1, size).equals(word.substring(1))) {
            return str.substring(0, size);
        }
        return "";
    }

}
