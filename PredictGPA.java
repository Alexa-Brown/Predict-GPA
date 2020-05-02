/**********************************************************************
 * @file LoanCalculator.java
 * @brief This program implements the use of if statements to calculate GPA.
 * @author Alexa Brown
 * @date February 5, 2019
 **********************************************************************/
import java.util.Scanner;

public class PredictGPA {
    public static void main(String[] args) {
        Scanner lulu = new Scanner(System.in);

        int course1hrs;
        String course1;
        int course2hrs;
        String course2;
        int course3hrs;
        String course3;
        int course4hrs;
        String course4;
        double course1grd = 0.0;
        double course2grd = 0.0;
        double course3grd = 0.0;
        double course4grd = 0.0;


        System.out.println("Semester GPA Predictor: Let's see what your GPA could be this semester...");
        System.out.println();
        System.out.println("Course 1: Number of hours? ");
            course1hrs = lulu.nextInt();
        System.out.println("Course 1: Expected grade? ");
            course1 = lulu.next();
              if (course1.equals("A")) {
                  course1grd = 4.0;
              }
              else if (course1.equals("A-")){
                  course1grd = 3.67;
              }
              else if (course1.equals("B+")){
                  course1grd = 3.33;
              }
              else if (course1.equals("B")){
                  course1grd = 3.0;
              }
              else if (course1.equals("B-")){
                  course1grd = 2.67;
              }
              else if (course1.equals("C+")){
                  course1grd = 2.33;
              }
              else if (course1.equals("C")){
                  course1grd = 2.0;
              }
              else if (course1.equals("C-")){
                  course1grd = 1.67;
              }
              else if (course1.equals("D+")){
                  course1grd = 1.33;
              }
              else if (course1.equals("D")){
                  course1grd = 1.0;
              }
              else if (course1.equals("D-")){
                  course1grd = .67;
              }
              else if (course1.equals("F+")){
                  course1grd = .33;
              }
              else if (course1.equals("F")) {
                  course1grd = 0;
              }
        System.out.println();

        System.out.println("Course 2: Number of hours? ");
        course2hrs = lulu.nextInt();
        System.out.println("Course 2: Expected grade? ");
        course2 = lulu.next();
            if (course2.equals("A")) {
                course2grd = 4.0;
            }
            else if (course2.equals("A-")){
                course2grd = 3.67;
            }
            else if (course2.equals("B+")){
                course2grd = 3.33;
            }
            else if (course2.equals("B")){
                course2grd = 3.0;
            }
            else if (course2.equals("B-")){
                course2grd = 2.67;
            }
            else if (course2.equals("C+")){
                course2grd = 2.33;
            }
            else if (course2.equals("C")){
                course2grd = 2.0;
            }
            else if (course2.equals("C-")){
                course2grd = 1.67;
            }
            else if (course2.equals("D+")){
                course2grd = 1.33;
            }
            else if (course2.equals("D")){
                course2grd = 1.0;
            }
            else if (course2.equals("D-")){
                course2grd = .67;
            }
            else if (course2.equals("F+")){
                course2grd = .33;
            }
            else if (course2.equals("F")){
                course2grd = 0;
            }
        System.out.println();

        System.out.println("Course 3: Number of hours? ");
        course3hrs = lulu.nextInt();
        System.out.println("Course 3: Expected grade? ");
        course3 = lulu.next();
        System.out.println();
            if (course3.equals("A")) {
                course3grd = 4.0;
            }
            else if (course3.equals("A-")){
                course3grd = 3.67;
            }
            else if (course3.equals("B+")){
                course3grd = 3.33;
            }
            else if (course3.equals("B")){
                course3grd = 3.0;
            }
            else if (course3.equals("B-")){
                course3grd = 2.67;
            }
            else if (course3.equals("C+")){
                course3grd = 2.33;
            }
            else if (course3.equals("C")){
                course3grd = 2.0;
            }
            else if (course3.equals("C-")){
                course3grd = 1.67;
            }
            else if (course3.equals("D+")){
                course3grd = 1.33;
            }
            else if (course3.equals("D")){
                course3grd = 1.0;
            }
            else if (course3.equals("D-")){
                course3grd = .67;
            }
            else if (course1.equals("F+")){
                course1grd = .33;
            }
            else if (course3.equals("F")){
                course3grd = 0;
            }

        System.out.println("Course 4: Number of hours? ");
        course4hrs = lulu.nextInt();
        System.out.println("Course 4: Expected grade? ");
        course4 = lulu.next();

            if (course4.equals("A")) {
                course4grd = 4.0;
            }
            else if (course4.equals("A-")){
                 course4grd = 3.67;
            }
            else if (course4.equals("B+")){
                 course4grd = 3.33;
            }
            else if (course4.equals("B")){
                 course4grd = 3.0;
            }
            else if (course4.equals("B-")){
                 course4grd = 2.67;
            }
            else if (course4.equals("C+")){
                 course4grd = 2.33;
            }
            else if (course4.equals("C")){
                 course4grd = 2.0;
            }
            else if (course4.equals("C-")){
                 course4grd = 1.67;
            }
            else if (course4.equals("D+")){
                 course4grd = 1.33;
            }
            else if (course4.equals("D")){
                 course4grd = 1.0;
            }
            else if (course4.equals("D-")){
                 course4grd = .67;
            }
            else if (course4.equals("F+")){
                 course4grd = .33;
            }
            else if (course4.equals("F")){
                 course4grd = 0;
            }

        double numhrs = course1hrs + course2hrs + course3hrs + course4hrs;
        double a = (course1hrs) * (course1grd);
        double b = (course2hrs) * (course2grd);
        double c = (course3hrs) * (course3grd);
        double d = (course4hrs) * (course4grd);

        double gpa = (a + b + c + d) / numhrs;

        System.out.printf("Your semester GPA would be: %.4f" , gpa);


    }
}
