import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (var grade : grades) {
            if (grade < 38) {
                result.add(grade);
            } else if (grade % 5 >= 3) {
                int remainder = grade % 5;
                result.add(grade + (5 - remainder));
            } else {
                result.add(grade);
            }

        }
        return result;

    }

}


public class GradingStudents_RoundingMarks {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int gradesCount = Integer.parseInt(scan.nextLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            System.out.println((String.valueOf(result.get(i))));

          /*  if (i != result.size() - 1) {
               System.out.println("\n");
            }*/
        }
    }
}
