package homeworks.meline.abrahamyan;

import java.util.Scanner;

import java.lang.Math;

public class homeworksecond {
   /*
    static void correctNumber (int number, int startPoint, int endPoint) {
        while (number < startPoint || number > endPoint ) {
            System.out.print("Number "+ number + " is out of the range [" + startPoint +
                    ", "+endPoint + "]. Please try again: ");
                    Scanner sc = new Scanner(System.in);
                    number = sc.nextInt();
        }
            System.out.print("Number " + number + " belongs to range [" + startPoint +
                    ", " + endPoint + "]");

    }

    public static void main (String[] args) {
        System.out.println("Checking if the given number belongs to the range…");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert lower bound of the range: ");
        int startPoint = sc.nextInt();
        System.out.print("Please insert upper bound of the range: ");
        int endPoint = sc.nextInt();
        System.out.print("Please insert the number: ");
        int number=sc.nextInt();

        correctNumber(number, startPoint, endPoint);

    }
*/
/*
       static void correctNumber(int number, int startPoint, int endPoint) {
           int counter = 1;
           while (number < startPoint || number > endPoint) {
               if (counter == 3) {
                   System.out.println("Number " + number + " is out of the range [" + startPoint +
                           ", " + endPoint + "]. You are about to reach ");
                   System.out.println("WARN: Maximum number of attempts is 4. Program will terminate" +
                           " if next value is invalid!");
                   System.out.print("Please try again: ");
                   Scanner sc = new Scanner(System.in);
                   number = sc.nextInt();
                   if (number > startPoint && number < endPoint) {
                       System.out.print("Number " + number + " belongs to range [" + startPoint +
                               ", " + endPoint + "]");
                   }
                   break;
               } else {

               System.out.print("Number " + number + " is out of the range [" + startPoint +
                       ", " + endPoint + "]. Please try again: ");
               Scanner sc = new Scanner(System.in);
               number = sc.nextInt();
               counter++;
           }

           if (number > startPoint && number < endPoint) {
               System.out.print("Number " + number + " belongs to range [" + startPoint +
                       ", " + endPoint + "]");
           }

           }

       }

       public static void main(String[] args) {
           System.out.println("Checking if the given number belongs to the range…");
           Scanner sc = new Scanner(System.in);
           System.out.print("Please insert lower bound of the range: ");
           int startPoint = sc.nextInt();
           System.out.print("Please insert upper bound of the range: ");
           int endPoint = sc.nextInt();
           System.out.print("Please insert the number: ");
           int number = sc.nextInt();

           correctNumber(number, startPoint, endPoint);
       }
       */
   public static void printEvenAndOddIndexes() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Please input a number: ");
       int number = scanner.nextInt();
       int mod;
       int num;
       int number1 = number;
       int countOdd=0;
       int countEven=0;
       int count=0;

       while(number1 > 0) {
           mod = number1 % 10;
           number1 = number1 / 10;
           count++;

           if (mod % 2 == 0) {
               countEven++;
           } else {
               countOdd++;
           }
       }
       int[] indexOdd = new int[countOdd];
       int[] indexEven = new int[countEven];
       int j=0, k=0;
      // int i = count -1;
       for ( int i=count-1; i>=0; i--) {
           num = number /( (int) Math.pow(10, i));
           if (num % 2 == 0) {
               indexEven[j] = count - i;
               j++;
           } else {
               indexOdd[k] = count - i;
               k++;
           }
       }
       if (countEven==0) {
           System.out.print("Even digits of the number are: There are no even digits ");
       } else {

           System.out.print("Even digits of the number are: ");
           for (int i = 0; i < countEven; i++) {
               if (i == 0) {
                   System.out.print("[" + indexEven[i] + ", ");
               }
               if (i == countEven - 1) {
                   System.out.print(+indexEven[i] + "]");
               }
               if (i > 0 && i < countEven - 1) {
                   System.out.print(+indexEven[i] + ", ");
               }
           }
       }
       System.out.println();
       if (countOdd==0) {
           System.out.print("Odd digits of the number are: There are no odd digits ");
       } else {
           System.out.print("Odd digits of the number are: ");
           for (int i = 0; i < countOdd; i++) {
               if (i == 0) {
                   System.out.print("[" + indexOdd[i] + ", ");
               }
               if (i == countOdd - 1) {
                   System.out.print(+indexOdd[i] + "]");
               }
               if (i > 0 && i < countOdd - 1) {
                   System.out.print(+indexOdd[i] + ", ");
               }
           }
       }

    }

    public static void main (String[] args){
   printEvenAndOddIndexes();
   }
}


