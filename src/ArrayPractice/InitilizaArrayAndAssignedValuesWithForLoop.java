package ArrayPractice;
import java.util.Scanner;
public class InitilizaArrayAndAssignedValuesWithForLoop {
   /* TASK 3( Initiliza Array and assign values with for loop for)  */

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String[] students = new String[10];
            int i = 0;
            while (i < 10) {
                System.out.println("Enter student name please");
                students[i] = input.next();
                i++;

            }
            for (int k = 0; k < 10; k++) {
                System.out.print((k + 1) + "." + students[k] + "  ");
            }


        }
    }
