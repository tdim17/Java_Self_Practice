package Java_weekly_txt_practice_tasks.JD09_Arrays;

import java.util.Arrays;

public class StudentGrade_challenge {

    public static void main(String[] args) {

        String[] studentNames =  {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[scores.length];  // КЛЮЧЕВОЙ МОМЕНТ который нужно разобрать!!!

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > 100 || scores[i] < 0) {
                System.err.println("Invalid score");
                return;
            }
            if (scores[i] > 89) {
                grades[i] = 'A';
            } else if (scores[i] > 79) {
                grades[i] = 'B';
            } else if (scores[i] > 69) {
                grades[i] = 'C';
            } else
                grades[i] = 'W';
        }
        System.out.println("grades = " + Arrays.toString (grades));

        // Чтобы не собирать каждого студента вручную, делаем Loop:

        for (int i = 0; i <=2; i++){
            // String print = studentNames[i] + "'s score is " + scores[i] + ", and grade is " + grades[i];
            System.out.println(studentNames[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
        }

    }

}

/*
4. Create a class named StudentGrade_challenge and write a program with the following specifications:

4.1 Given two arrays with the same length:
studentNames (String[])
scores (int[])

4.2 Write a program to determine and store the students' grades in an array of characters named grades.

4.3 Print the grade report for each student in separate lines.

        Example:
String[] names = {"Anna", "Nancy", "Sarah"};
int[] scores = {90, 75, 80};

Output:
grades = {'A', 'C', 'B'};
Anna's score is 90, and grade is A
Nancy's score is 75, and grade is C
Sarah's score is 80, and grade is B
*/