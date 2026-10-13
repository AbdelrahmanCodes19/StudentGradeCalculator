/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradecalculator;

import java.util.Scanner;

/**
 *
 * @author Shaimaa
 */
public class StudentGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your Grade: ");
        int grade = input.nextInt();
        System.out.println("Student name : " + name);
        System.out.println("Student Grade : " + grade);
         if (grade < 0 || grade > 100 ) {
        System.out.println("Invalid Grade"); 
        } else  {
        double percentage = (grade / 100.0)*100 ;
        System.out.println("percentade : " + percentage + "%");
           if (grade >= 90) {
        System.out.println("Grade: Excellent");
             System.out.println("Exellent Work! Keep it up. ");
       } else if (grade >=80) {
        System.out.println("Grade: very Good");
             System.out.println("Great jop!");
       } else if (grade >=70) {
        System.out.println("Grade: Good");
             System.out.println("Great Work! Keep improving.");
       } else if (grade >=50) {
        System.out.println("Grade: pass");
       } else {
             System.out.println("Grade: Fail");
             
            } 
         }
    }
    }
