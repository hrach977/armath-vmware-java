package lessons.warmup1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Warmup_ArrayList_Example {
    /*
    1.	Write a program that
        a.	creates new array list of strings that contains names for colors. Add some values to that array list from console.
        Add values until “EOL” string is inserted
        void inputColorsArrayList()
        b.	inserts new item into the list in the specified position. Please note that specified index can be anything,
        i.e. it can be valid index or out of the boundaries for the list.
        If provided index is out of the range print “Index is out of the range. Inserting item from the end of the list.”
        message and insert item from the end of the list.
        void insertColor(ArrayList<String> list, int index, String color)
        c.	retrieves item from array list with specified index.
        Return “Index_Out_Of_The_Range” string if provided index is out of range.
        d.	updates item in the specified position. Prints “Index_Out_Of_The_Range” message if index is out of range
        Boolean modifyColorByIndex(ArrayList<String> list, int index, String color)
        e.	changes all occurrences of one color with another color
        Int replaceColorWithColor(ArrayList<String> list, String oldColor, String newColor)
        f.	removes item from the specified position. Print “Index_Out_Of_The_Range” message of index is out of range
        Boolean removeColorByIndex(ArrayList<String> list, int index)
        g.	replaces all occurrences of color with “light ” + color string in list
        int replaceColorIf(ArrayList<String> list, String color)


        # # # # # # # # # # #                #                          #
          # # # # # # # # #                # # #                      # # #
            # # # # # # #                # # # # #                  # # # # #
             # # # # #                # # # # # # #              # # # # # # #
               # # #                # # # # # # # # #          # # # # # # # # #
                 #                # # # # # # # # # # #      # # # # # # # # # # #
                (a)                        (b)                 # # # # # # # # #
                                                                # # # # # # #
                                                                 # # # # #
                                                                   # # #
                                                                     #
    * */

    //Please input colors: red green blue EOL
    //[red, green, blue]
    public static ArrayList<String> inputColorsArrayList() {
        ArrayList<String> result = new ArrayList<>();
        System.out.print("Please input colors: ");
        Scanner input = new Scanner(System.in);

        while(input.hasNext()) {
            String color = input.next();
            if (color.equals("EOL")) {
                break;
            }
            result.add(color);
        }
        return result;
    }


    public static void insertColor(ArrayList<String> list, int index, String color) {
        if (index >= list.size()) {
            System.out.println("Index is out of the range. Inserting item from the end of the list");
            list.add(color);
        } else {
            list.add(index, color);
        }
    }


    public static String getColorByIndex(ArrayList<String> list, int index) {
        if (index >= list.size()) {
            return "Index_Out_Of_The_Range";
        }
        return list.get(index);
    }

    public static Boolean modifyColorByIndex(ArrayList<String> list, int index, String color) {
        if (index >= list.size()) {
            System.out.println("Index_Out_Of_The_Range");
            return false;
        }

        list.set(index, color);
        return true;
    }


    public static int replaceColorWithColor(ArrayList<String> list, String oldColor, String newColor) {
        int count = 0;

        if (!list.contains(oldColor)) {
            System.out.println("List of colors does not contain " + oldColor);
            return -1;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldColor)) {
                list.set(i, newColor);
                count++;
            }
        }
        return count;
    }

    public static int replaceColorIf(ArrayList<String> list, String color) {
        return replaceColorWithColor(list, color, "light " + color);
    }

    public static Boolean removeColorByIndex(ArrayList<String> list, int index) {
        if (index >= list.size()) {
            System.out.println("Index_Out_Of_The_Range");
            return false;
        }
        list.remove(index);
        return true;
    }

//    List [green, blue, yellow] does not contain violet color.
//            replaceIfCount: -1
//            [green, blue, yellow]
//    List [green, blue, yellow] contains blue color. Replacing it with light blue color.
//    replaceIfCount: 1
//            [green, light blue, yellow]




    public static void main(String[] args) {
        ArrayList<String> colors = inputColorsArrayList();
        System.out.println(colors);
//        insertColor(colors, 12, "pink");
//        System.out.println(colors);
//        insertColor(colors, 2, "pink");
//        System.out.println(colors);
//        System.out.println(getColorByIndex(colors, 2));
//        System.out.println(getColorByIndex(colors, 15));
//        System.out.println(modifyColorByIndex(colors, 3, "yellow"));
//        System.out.println(colors);
//        System.out.println(modifyColorByIndex(colors, 13, "yellow"));
//        System.out.println(colors);
//        System.out.println(replaceColorWithColor(colors, "violet", "pink"));
//        System.out.println(colors);
//        System.out.println(replaceColorWithColor(colors, "pink", "violet"));
//        System.out.println(colors);
//        System.out.println(replaceColorWithColor(colors, "red", "yellow"));
//        System.out.println(colors);
//        System.out.println(removeColorByIndex(colors, 13));
//        System.out.println(colors);
//        System.out.println(removeColorByIndex(colors,3));
//        System.out.println(colors);
        System.out.println(replaceColorIf(colors, "blue"));
        System.out.println(colors);
        System.out.println(replaceColorIf(colors, "green"));
        System.out.println(colors);
        System.out.println(replaceColorIf(colors, "violet"));
        System.out.println(colors);
    }
}
