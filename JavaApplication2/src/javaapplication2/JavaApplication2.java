/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stuIndex;
        int stuMarks;
        
        Scanner inputObj = new Scanner(System.in);
        
        System.out.print("Enter student index :");
        stuIndex = inputObj.nextLine();
        
        
        System.out.print("Enter student marks :");
        stuMarks = inputObj.nextInt();
       
        
        student myStudent = new student(stuIndex,stuMarks);
        
        myStudent.displayDetails();
        
        
    }
    
}
