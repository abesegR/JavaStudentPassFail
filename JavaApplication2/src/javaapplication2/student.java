/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author User
 */
public class student {
    
    //encapsulating
    private String studentIndex;
    private int studentMarks;
    
    //constructor for initializing
    public student(String studentIndex,int studentMarks){
        setIndex(studentIndex);   
        setMarks(studentMarks);
    }
    
    //setter
    
    public void setIndex(String studentIndex){
        this.studentIndex = studentIndex;
    }
    public void setMarks(int studentMarks){
        if(studentMarks>=0 && studentMarks<=100) 
            this.studentMarks = studentMarks;
        else 
            System.out.println("Student Marks range invalid.");
        
    }
    
    //Getter
    
    public String getIndex(){
        return studentIndex;
    }
    public int getMarks(){
        return studentMarks;
    }
    
    //Method to determine if the student has been pased or not
    public String getResult(){
        return (studentMarks > 50) ? "Pass" : "Fail";
    }
    
    public void displayDetails(){
        System.out.println("");
        System.out.println("Student Details :");
        System.out.println("Index Number : "+studentIndex);
        System.out.println("Marks :"+studentMarks);
        System.out.println("Result :"+getResult());
        System.out.println("");
        
    }
    
    
}
