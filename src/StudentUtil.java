import java.util.Arrays;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentGrades) {
        double[] GPAs = new double[studentIdList.length];
        int index = 0;
        for (char[] grades : studentGrades) {
            double totalGpa = 0;

            for (char grade : grades) {
                if (grade == 'A') {
                    totalGpa += 4;
                } else if (grade == 'B') {
                    totalGpa += 3;
                } else if (grade == 'c') {
                    totalGpa += 2;
                }

            }
            GPAs[index] = totalGpa / grades.length;
            index += 1;
        }

        return GPAs;

    }

    public static int[] getStudentByGPA(double lower, double higher, int[] studentList, char[][] studentGrades) {
        if (lower >= higher) {
            return null;
        }
        double[] GPAs = calculateGPA(studentList, studentGrades);

        int[] studentId = new int[GPAs.length];
        for (int i = 0, j = 0; i < GPAs.length; i++, j++) {
            if (GPAs[i] > lower && GPAs[i] < higher) {
                studentId[i] = studentList[j];
            }
        }
        return studentId;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStudentByGPA(3.2, 3.5, new int[]{1001, 1002}, new char[][]{{'A', 'A', 'A', 'B'}, {'A', 'B', 'B'}})));
    }
}
