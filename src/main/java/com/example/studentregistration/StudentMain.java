package com.example.studentregistration;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        boolean fail = false;
        Scanner keyboard = new Scanner(System.in);
        StudentInfo Students = new StudentInfo();
        String answer;


         {
             Students = new StudentInfo();



             do {

             System.out.print("Enter course number: ");

            Students.setCourseNumber(keyboard.nextLine());

            System.out.print("Enter course name: ");

            Students.setCourseName(keyboard.nextLine());

            System.out.print("Enter room number: ");

            Students.setRoomNumber(keyboard.nextLine());

            System.out.print("Enter semester: ");

            Students.setSemester(keyboard.nextLine());

            System.out.print("Enter year: ");

            Students.setYear(keyboard.nextLine());


                 System.out.println("Do you want to enter another course ? : (Y/N)");
                 answer = keyboard.nextLine();

             } while (!answer.equalsIgnoreCase("n"));
             System.out.println("Have a nice day !");

             if (!answer.equalsIgnoreCase("y"));
















            }

            }
}
