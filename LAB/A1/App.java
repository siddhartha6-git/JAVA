/*
@author: Siddhartha Purwar
@version: 1.0
@since: 02-Feb-2022
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    //################### attributes ##########################
    static int course_credits = 3;
    ArrayList<Integer> marks = new ArrayList<Integer> (Arrays.asList(55, 66, 77, 88, 99, 100));

    public Student() {
    }

    //################### validateLogin ##########################
    public boolean validateLogin(String username, char[] password) {
        if (username.equals(String.valueOf(password))) {
            return false;
        }
        else {
            return true;
        }
    }

    //################### get_marks ##########################
    public ArrayList<Integer> get_marks() {
       return this.marks;
    }

    //################### calculate_grade ##########################
    public ArrayList<Character> calculate_grade() {
        ArrayList<Character> grades = new ArrayList<Character>();
        for (int mark : this.marks) {
            if (mark >= 90) {
                grades.add('S');
            }
            else if (mark >= 80) {
                grades.add('A');
            }
            else if (mark >= 70) {
                grades.add('B');
            }
            else if (mark >= 60) {
                grades.add('C');
            }
            else if (mark >= 55) {
                grades.add('D');
            }
            else if (mark >= 50) {
                grades.add('E');
            }
            else {
                grades.add('F');
            }
        }
        return grades;
    }

    //################### get_gpa ##########################
    public double get_gpa() {
        double total_marks = 0;
        for (int mark : marks) {
            if (mark >= 50 && mark < 60) {
                total_marks += (mark/10);               
            }
            else {
                total_marks += (mark/10) + 1;
            }
        }
        return total_marks/(this.marks.size());
    }
}
