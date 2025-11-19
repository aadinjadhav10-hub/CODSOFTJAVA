import java.util.Scanner;

public class GradeCalculator6Subjects {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int numberOfSubjects = 6;

        // taking marks for 6 subjects
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int m = scanner.nextInt();

            // check if marks are valid
            if (m < 0 || m > 100) {
                System.out.println("Please enter marks between 0 and 100 only.");
                return;
            }

            total = total + m;   // adding marks to total
        }

        // calculating percentage
        double percentage = (double) total / numberOfSubjects;

        // finding grade from percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // printing the output
        System.out.println("\n------ Result ------");
        System.out.println("Total Marks: " + total + " / 600");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
