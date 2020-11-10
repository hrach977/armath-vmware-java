package homeworks.meline.abrahamyan;

import java.util.Scanner;

public class homeworkfirst {

    /*1
     static double circumference (double radius){
          double pi=3.14;
          return 2*radius*pi;
      }
      public static void main (String[] args){
          System.out.println(Calculating circumference of the circle…);
          Scanner sc=new Scanner(System.in);
          System.out.println("Please input the radius: ");
          double radius=sc.nextDouble();
          int counter=0;
          while (radius<0){
              System.out.println("Radius should not be a negative number!");
              System.out.println("Please input the radius: ");
              radius=sc.nextDouble();
              counter++;
              if (counter==3) {
                  break;
              }
          }
              if (radius>=0) {
                  System.out.println("circumference of the circle with radius "+radius+" is " + circumference(radius));
          }
      }
  */
  /*2
    static double radius (double area) {
      double pi = 3.14;
      return Math.sqrt(area / pi);
  }
    public static void main (String[] args) {
        System.out.println(Calculating radius of the circle having its area…);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the area: ");
        double area = sc.nextDouble();
        while (area < 0) {
            System.out.println("Area should not be a negative number!");
            System.out.println("Please input the area: ");
            area = sc.nextDouble();
        }
        if (area >= 0) {
            System.out.println("circumference of the circle with radius " + area + " is " + radius(area));
        }
    }
*/
 /*3
   static double squareArea (double side) {

      return side*side;
  }
    public static void main (String[] args) {

        System.out.println("Calculating area of the rectangle…");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the side of square: ");
        double side = sc.nextDouble();
        while (side < 0) {
            System.out.println("Side should not be a negative number!");
            System.out.println("Please input the side of square: ");
            side = sc.nextDouble();
        }
        if (side >= 0) {
            System.out.println("Area of rectangle with side = " + side + " is " + squareArea(side));
        }
    }
  */
   /*4
    static void swapsTwoNumbers ( int firstNum, int secondNum) {
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        System.out.println ( "firstNum = " + firstNum);
        System.out.println ( "secondNum = " + secondNum);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println ("firstNum = "+ x);
        System.out.println ("secondNum = " + y);
        swapsTwoNumbers(x,y);

    }*/
    /*5
    static double sumDigits(int number) {
        int Sum = 0;
        while (number>0) {
            Sum += number % 10;
            number /= 10;
        }

        return Sum;
    }

    public static void main(String[] args) {

        System.out.println("Calculating summation of the digits of the integer number…");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input integer: ");
        int number = sc.nextInt();
        while (number < 0) {
            System.out.println("Number should not be a negative number!");
            System.out.println("Please input integer: ");
            number = sc.nextInt();
        }
        if (number >= 0) {
            System.out.println("Summation of digits of " + number + " is " + sumDigits(number));
        }
    }
     */
  /*6
    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Printing all odd integers from the given array of integers…");
        System.out.print("Please input the size of the array: ");
        int count = scanner.nextInt();
        int[] sequence = new int[count];
        System.out.print("Please input the integers: ");

        for (int index = 0; index < count; ++index) {
            sequence[index] = scanner.nextInt();
        }

        int counter = 0;
        int i;
        System.out.print("Writing input into array with size " + count + ": ");
        if (sequence.length == 1) {
            System.out.print("[" + sequence[0] + "]");
            if (sequence[0] % 3 == 0) {
                ++counter;
            }
        } else {
            for (i = 0; i < sequence.length; ++i) {
                if (i == 0) {
                    System.out.print("[" + sequence[i] + ", ");
                }
                if (i == sequence.length - 1 && sequence.length > 1) {
                    System.out.print(sequence[i] + "]");
                }
                if (i > 0 && i < sequence.length - 1) {
                    System.out.print(sequence[i] + ", ");
                }
                if (sequence[i] % 3 == 0) {
                    ++counter;
                }
            }
        }

        System.out.println();
        int[] sequence2 = new int[counter];
        int j = 0;
        for (i = 0; i < sequence.length; ++i) {
            if (sequence[i] % 3 == 0) {
                sequence2[j] = sequence[i];
                ++j;
            }
        }
        if (counter == 0) {
            System.out.println("There are no odd numbers in the array!");
        } else {
            System.out.print("Sub array of odd numbers is: ");
            if (counter == 1) {
                System.out.print("[" + sequence2[0] + "]");
            } else {
                for (i = 0; i < counter; ++i) {
                    if (i == 0) {
                        System.out.print("[" + sequence2[i] + ", ");
                    }
                    if (i == counter - 1) {
                        System.out.print(+sequence2[i] + "]");
                    }
                    if (i > 0 && i < counter - 1) {
                        System.out.print(+sequence2[i] + ", ");
                    }
                }
            }
        }
    }
        public static void main(String[] args) {

            printOddNumbers();
        }
        */
/* 7
        public static void printEvenAndOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of array: ");
        final int count = scanner.nextInt();

        int[] sequence = new int[count];
        int index = 0;
        while (index < count) {
            sequence[index] = scanner.nextInt();
            index++;
        }
         int counter = 0;
        int counterOdd = 0;

        for (int i = 0; i < sequence.length; ++i) {
            System.out.print(sequence[i] + " ");
            if (sequence[i] % 2 == 0) {
                counter++;
            }
            if (sequence[i] % 3 == 0) {
                counterOdd++;
            }
        }
        System.out.println();

        int[] sequence2 = new int[counter];
        int[] sequence3 = new int[counterOdd];
        int j = 0;
        int[] indexEven= new int[counter];
        int[] indexOdd= new int[counterOdd];

        for (int i = 0; i < sequence.length; ++i) {
            if (sequence[i] % 2 == 0) {
                sequence2[j] = sequence[i];
                indexEven[j]= i;
                j++;

            }
        }
        j = 0;
        for (int i = 0; i < sequence.length; ++i) {
            if (sequence[i] % 3 == 0) {
                sequence3[j] = sequence[i];
                indexOdd[j]= i;
                j++;
            }
        }
        int SumEven = 0;
        int SumOdd = 0;
        System.out.print("Even numbers are: ");
        for (int i = 0; i < counter; ++i) {
            System.out.print(sequence2[i] + " ");
            SumEven += sequence2[i];
        }
        System.out.println();
        System.out.print("Odd numbers are: ");
        for (int i = 0; i < counterOdd; ++i) {
            System.out.print(sequence3[i] + " ");
            SumOdd += sequence3[i];
        }
        System.out.println();
        System.out.println("sum of even numbers " + SumEven);
        System.out.println("sum of odd numbers " + SumOdd);
        System.out.println("amount of even numbers  " + counter);
        System.out.println("amount of odd numbers  " + counterOdd);
        System.out.print("items with even indexes ");
        for (int i = 0; i < counter; ++i) {
            System.out.print(indexEven[i] + " ");
        }
        System.out.println();
        System.out.print("items with odd indexes ");
        for (int i = 0; i < counterOdd; ++i) {
            System.out.print(indexOdd[i] + " ");
        }

    }

    public static void main(String[] args) {
        printEvenAndOddNumbers();
    }

 */
    static String  primeNumber(int number) {
        if (number == 2) {
            return "Yes!";
        }
        if (number % 2 == 0) {
            return "No!";
        } else {
            int i = 3;
            int x = 1;
            while (i <= number) {
                if (number % i == 0) {
                    x++;
                }
                i += 2;
            }
            if (x == 2) {
                return "Yes!";
            }
            return "No!";
        }

    }
    public static void main (String[] args){
        System.out.println("Checking if the given number is a prime number…");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int number = sc.nextInt();
        System.out.println(primeNumber(number));
    }
}
