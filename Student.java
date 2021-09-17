/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author Arrvind
 */
public class Student {
    
    private String fname;
    private String lname;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tutionBalance=0;
    private static int costofcourse=600;
    private static int id=1000;
    
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name ");
        this.fname=in.nextLine();
        
        System.out.println("Enter last name ");
        this.lname=in.nextLine();
        
        System.out.println("Enter Grade Year "
                + "\n 1.Freshman"
                + "\n 2.Sophmore"
                + "\n 3.Junior"
                + "\n 4.Senior");
        
        this.gradeYear=in.nextInt();
        System.out.println(" Name : "+fname +" "+lname+" Year "+gradeYear);
        
        
          generateID();     
    }
    public void generateID(){
        studentID=gradeYear+""+id;
        id++;
    
    }
    
    public void enroll(){
        
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Enter the courses enrolled in (Q to quit) ");
        String course =sc.nextLine();
        if(!course.equals("Q")){
            courses=courses +" "+course;
            tutionBalance=tutionBalance+costofcourse;
        }else break;
        }while(1!=0);
        System.out.println("Courses Enrolled in "+ courses);
       
        
            
    }
    
    public void viewBalance(){
        System.out.println("Balance is "+ tutionBalance);
    }
    
    public void payTution(){
        viewBalance();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount to be paid :");
        int payment =sc.nextInt();
        tutionBalance= tutionBalance - payment;
        System.out.println("Thank you for your payment $"+ payment);
        
    }
       
    public String showInfo(){
        return "Name "+fname+" "+lname+"\nGrade Year "+gradeYear+"\nStudent ID "+studentID +"\n Courses"+courses+"\nTution Balance"+tutionBalance;
    }
    
}
