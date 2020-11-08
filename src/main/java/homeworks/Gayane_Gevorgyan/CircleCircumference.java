package homeworks.Gayane_Gevorgyan;

import java.util.Scanner;
import java.lang.Math;

        public class CircleCircumference {

            public static double CircleCircumference(){
                System.out.println("Calculating circumference of the circle…");
                System.out.print("Please input the radius: ");
                Scanner number = new Scanner(System.in);
                double pi = 3.14;
                double circum = 0.0;
                int count = 0;

                while(number.hasNext() && count <= 4){
                    double radius = number.nextDouble();

                    if (radius > 0) {
                        circum = 2 * pi * radius;
                        System.out.println("Circumference of the circle with radius "  + radius + " is: " + circum);
                        break;
                    }
                    else if(count == 3){
                        System.out.println("WARN: Maximum number of attempts is 4. Program will terminate if next value is invalid!");
                    }
                    else {
                        count++;
                        System.out.println("Radius should not be a negative number!");
                    }
                    System.out.println("ERROR: Maximum number of attempts is reached. Terminating the program!!!");
                }
                return circum;

            }
            public static void main(String[] args) {
                CircleCircumference();

            }

        }