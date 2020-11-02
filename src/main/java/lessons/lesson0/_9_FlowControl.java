package lessons.lesson0;

import java.util.concurrent.TimeUnit;

public class _9_FlowControl {


    public static void main(String[] args) {
        boolean someBooleanExpression = 1 < 2;

         if (someBooleanExpression) {
            System.out.println("condition passed");
         } else if (false) {

         } else if (false){

         } else {
                System.out.println("condition failed");
         }

         //int, String, enum
         switch (5) {
             case 1:
                 //do something
                 break;
             case 2:
                 //do something
                 break;
             default:
                 //do something
         }

        switch ("text") {
            case "1":
                //do something
                break;
            case "2":
                //do something
                break;
            default:
                //do something
        }

        TimeUnit someEnum = TimeUnit.MILLISECONDS;

         switch (someEnum) {
             case DAYS:
                 break;
             case HOURS:
                 break;
             default:
         }

         int[] numbers = {10, 20, 30, 40, 50};
                        //0   1   2   3   4

//         for (int i=0; i<numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }
//
//         int index = 0;
//         while (index < numbers.length) {
//             System.out.println(numbers[index]);
//             index++;
//         }

//         for (int number : numbers) {
//             System.out.println(number);
//         }

//         while (someBooleanExpression) {
//
//         }

//         do {
//
//         } while (someBooleanExpression);

         System.out.println("Break / Continue example");

         System.out.println("break");
         for (int x : numbers) {
             if (x == 30) {
                 break;
             }
             System.out.println(x);
         }

        System.out.println("****");
        System.out.println("continue");
         for (int x : numbers) {
             if (x == 30) {
                 continue;
             }
             System.out.println(x);
         }
    }

}
