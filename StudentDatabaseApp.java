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
public class StudentDatabaseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter the number of studnets to be enrolled");
         int b=sc.nextInt();
        Student[] students=new Student[b]; 
         for(int i=0;i<b;i++){
             students[i]=new Student();
             students[i].enroll();
             students[i].payTution();
            
             
             
         }
        for(int i=0;i<b;i++){
             System.out.println(students[i].showInfo());
        }
         
  
         
         
                
    }
    
}
