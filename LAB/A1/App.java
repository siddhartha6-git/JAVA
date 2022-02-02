/*
@author: Siddhartha Purwar
@version: 1.0
@since: 02-Feb-2022
*/

import java.io.Console;
public class App {
    public static void main(String[] args) {
        Student student_1 = new Student();
        Console cons_input = System.console();
        char[] password;
        String username;

        cons_input.printf("Enter Username: ");
        username = cons_input.readLine();
        cons_input.printf("Enter Password: ");
        password =  cons_input.readPassword();
        while (!student_1.validateLogin(username, password)) { //validating user
            cons_input.printf("Invalid credentials...\n");
            cons_input.printf("Enter Username: ");
            username = cons_input.readLine();
            cons_input.printf("Enter Password: ");
            password =  cons_input.readPassword();
        }     
        cons_input.printf("Welcome %s...\n", username);

        System.out.println(student_1.get_marks());
        System.out.println(student_1.calculate_grade());
        System.out.println(student_1.get_gpa());
    }
}
