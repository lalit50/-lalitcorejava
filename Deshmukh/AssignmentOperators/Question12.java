package AssignmentOperators;

public class Question12 {
    public static void main(String[] args) {
        //The total number of students in a class are 90 out of which 45 are boys.
        //If 50% of the total students secured grade 'A' out of which 20 are boys,
        // then write a program to calculate the total number of girls getting grade 'A'.

        int totalStudents = 90;
        int totalBoys = 45;
        int totalGirls = totalStudents - totalBoys;
        int gradeAStudents =totalStudents/2;
        int gradeAboys =20;
        int gradeAGirls= gradeAStudents -gradeAboys;

        System.out.println("Girls is the seoured greade is   " + gradeAGirls);
    }
}
