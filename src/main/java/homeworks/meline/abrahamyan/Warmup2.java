package homeworks.meline.abrahamyan;

public class Warmup2 {

//    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
//    The string length will be at least 2.
//
//
//    right2("Hello") → "loHel"
//    right2("java") → "vaja"
//    right2("Hi") → "Hi"

    public String right2(String str) {
        if (str.length()<=2){
            return str;
        }
        return str.substring(str.length()-2,str.length()) + str.substring(0,str.length()-2);
    }


//    Given a string, return a string length 1 from its front, unless front is false,
//    in which case return a string length 1 from its back. The string will be non-empty.
//
//
//    theEnd("Hello", true) → "H"
//    theEnd("Hello", false) → "o"
//    theEnd("oh", true) → "o"

    public String theEnd(String str, boolean front) {
        if (front){
            return "" + str.charAt(0);
        }
        return "" + str.charAt(str.length()-1);
    }

//    Given a string, return a version without both the first and last char of the string.
//    The string may be any length, including 0.
//
//
//    withouEnd2("Hello") → "ell"
//    withouEnd2("abc") → "b"
//    withouEnd2("ab") → ""

    public String withouEnd2(String str) {
        if (str.length()<=2) {
            return "";
        }
        return str.substring(1,str.length()-1);
    }



//    Given a string of even length, return a string made of the middle two chars,
//    so the string "string" yields "ri". The string length will be at least 2.
//
//
//    middleTwo("string") → "ri"
//    middleTwo("code") → "od"
//    middleTwo("Practice") → "ct"

    public String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }

//    Given a string, return true if it ends in "ly".
//
//
//    endsLy("oddly") → true
//    endsLy("y") → false
//    endsLy("oddy") → false

    public boolean endsLy(String str) {
        if(str.length()<2){
            return false;
        }
        return str.substring(str.length()-2,str.length()).equals("ly");
    }

//    Given a string and an int n, return a string made of the first and last n chars from the string.
//    The string length will be at least n.
//
//
//    nTwice("Hello", 2) → "Helo"
//    nTwice("Chocolate", 3) → "Choate"
//    nTwice("Chocolate", 1) → "Ce"


    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n);
    }


//    Given a string of odd length, return the string length 3 from its middle,
//    so "Candy" yields "and". The string length will be at least 3.
//
//
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"

    public String middleThree(String str) {
        return str.substring(str.length()/2-1, str.length()/2+2);
    }


//    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
//    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length,
//    including 0. Note: use .equals() to compare 2 strings.
//
//    hasBad("badxx") → true
//    hasBad("xbadxx") → true
//    hasBad("xxbadxx") → false

    public boolean hasBad(String str) {
        if(str.length()<=3 && str.equals("bad")){
            return true;
        }
        if(str.length()>3 && (str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad"))){
            return true;
        }
        return false;
    }

//    Given a string, return a string length 2 made of its first 2 chars.
//    If the string length is less than 2, use '@' for the missing chars.
//
//
//    atFirst("hello") → "he"
//    atFirst("hi") → "hi"
//    atFirst("h") → "h@"

    public String atFirst(String str) {
        if (str.length()>=2){
            return str.substring(0,2);
        }
        if (str.length()==0){
            return "@@";
        }
        return str + "@";
    }



//    Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
//    and otherwise return the string unchanged.
//
//
//    withoutX("xHix") → "Hi"
//    withoutX("xHi") → "Hi"
//    withoutX("Hxix") → "Hxi"

    public String withoutX(String str) {

        if (str.length()>1){
            if (str.charAt(0)=='x' && str.charAt(str.length()-1)=='x'){
                return str.substring(1, str.length()-1);
            }
            if (str.charAt(0)=='x'){
                return str.substring(1);
            }
            if (str.charAt(str.length()-1)=='x'){
                return str.substring(0, str.length()-1);
            }
            return str;
        }
        return "";
    }

}
