
package school_management_system_project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.*;
public class Main {
    public static void main(String[] args) {
                

        Scanner scan=new Scanner(System.in);
        Teacher Moli = new Teacher(1,"Moli",500,"Vice-Principle");
        Teacher Mumu = new Teacher(2,"Mumu",700,"principle");
     
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Moli);
        teacherList.add(Mumu);
        
        List<Student> studentList = new ArrayList<>();

        School ghs = new School(teacherList,studentList,"Children Care","Mirpur-12,Dhaka");
       
                     System.out.println("***************************");
                     System.out.println("------School information----");
                     System.out.println("***************************");
                      System.out.println("\n");
                     System.out.println("------School Name----"+ghs.getName());
                     System.out.println("------School Address----"+ghs.getAddress());
                     System.out.println("***************************");
        
        System.out.println("school has spent for salary to " + Moli.getName()
        +"  Id  "+Moli.getId()+" Post: "+Moli.getPost()+"  and her salary:"+Moli.getSalary());
         System.out.println("---\n----");
         
              System.out.println("school has spent for salary to " + Mumu.getName()
        +"  Id  "+Mumu.getId()+" Post: "+Mumu.getPost()+"  and her salary:"+Mumu.getSalary());
        System.out.println("---\n----");
          
                  System.out.println("***************************");
                     System.out.println("------Login information----");
                     System.out.println("***************************");
                     System.out.println("");
                 Date today = Calendar.getInstance().getTime();
    System.out.println(today);
                  

         String student_name=JOptionPane.showInputDialog("enter your name:");
         String student_id=JOptionPane.showInputDialog("enter your id: ");
         String position=JOptionPane.showInputDialog("enter your position:");
           String attendence=JOptionPane.showInputDialog("enter your attendence:\n present for-p \n absent for a");
           
          user_information a1=new user_information(student_name,student_id,attendence,position);
          
       a1.displayuser();
                    

          int i = 0;
           int student_number=0;
           int teacher_number=0;
           int staff_number=0;
           int subject_number=0;
           int fees=0;
           int salary=0;
           String name;
           int Id;
           String section;
           String Address;
           int Class=0;
           int date=0;
           
              

     do{
         System.out.println("type-1 for Admin");
         System.out.println("type-2 for user");
        
         int select1=scan.nextInt();
         switch(select1){
             case 1:
                 System.out.println("Admin Work ");
        
         
         System.out.println("type-1 for adding student");
         System.out.println("type-2 for adding teacher");
         System.out.println("type-3 for adding employee");
         System.out.println("type-4 for adding marks");
        System.out.println("type 5 for adding attendence information");
         int select=scan.nextInt();
         switch(select){
                         

             case 1:
                 
                 System.out.println("student Added");
                 
                 student_number++;
                if(student_number<=5){
                    System.out.println("***************************");
                     System.out.println("------Student information----");
                     System.out.println("***************************");
                     System.out.println("");
                    System.out.println("student number is:"+student_number);
                    System.out.println("Enter the student's  name: ");
                      name=scan.next();
                       System.out.println("Enter the student's  Address: ");
                        Address=scan.next();
                       System.out.println("Enter the student's  Id: ");
                        Id=scan.nextInt();
                        System.out.println("enter the student's  the class:");
                        Class=scan.nextInt();
                       System.out.println("Enter the student's  Section: ");
                        section=scan.next();
                       
                         System.out.println("Enter the student's fees per month: ");
                       fees=scan.nextInt();

                       System.out.println("Student's name: "+name);
                        System.out.println("Student's Address: "+Address);
                       System.out.println("Student's ID: "+Id);
                       System.out.println("Student's Section: "+section);
                       System.out.println("Student's Class: "+Class);
                       System.out.println("Student's Fees per month: "+fees);
                       System.out.println("Student's fees for whole month: "+(fees*12));
                       System.out.println("Total earned money: "+fees*student_number);
                         
                    }
               
                else{
                    System.out.println("class is full");
                    
                }
                break;
                
             case 2:
                 System.out.println("Teacher added");
                 
                 teacher_number++;
                if(teacher_number<=5){
                   
                       System.out.println("***************************");
                     System.out.println("------Teacher information----");
                     System.out.println("***************************");
                     System.out.println("");
                    System.out.println("Teacher number is:"+teacher_number);
                    System.out.println("Enter the teacher's name: ");
                      name=scan.next();
                      System.out.println("Enter the teacher's Address: ");
                       Address=scan.next();
                       System.out.println("Enter the teacher's Id: ");
                       Id=scan.nextInt();
                       System.out.println("enter the teacher's the class:");
                        Class=scan.nextInt();
                        System.out.println("Enter the teacher's Section: ");
                          section=scan.next();
                        section=scan.next();
                        section=scan.next();
                        
                       System.out.println("Enter the teacher's salary: ");
                       salary=scan.nextInt();
                       System.out.println("Teacher's name: "+name);
                       System.out.println("Teacher's ID: "+Id);
                       System.out.println("Teacher's section: "+section);
                       System.out.println("Teacher's Address: "+Address);
                       System.out.println("Teacher's Salary for per month: "+salary);
                      System.out.println("Teacher's Salary for whole year: "+salary*12);
                       System.out.println("Total spent money: "+salary*teacher_number);
                           
                    }
                else{
                    System.out.println("teacher number is full");
                } 
                 break;
                
             case 3:
                 System.out.println("Staff added");
                 
                 staff_number++;
                if(staff_number<=5){
                    
                       System.out.println("***************************");
                     System.out.println("------Staff information----");
                     System.out.println("***************************");
                     System.out.println("");
                    System.out.println("Staff number is:"+staff_number);
                    System.out.println("Enter staff's name: ");
                      name=scan.next();
                       System.out.println("Enter staff's Id: ");
                       Id=scan.nextInt();
                       
                        System.out.println("Enter staff's Address: ");
                       Address=scan.next();
                       System.out.println("Enter staff's salary: ");
                       salary=scan.nextInt();
                       System.out.println("staff's name: "+name);
                       System.out.println("staff's ID: "+Id);
                       
                       System.out.println("staff's Address: "+Address);
                       System.out.println("staff's Salary for per month: "+salary);
                      System.out.println("staff's Salary for whole year: "+salary*12);
                       System.out.println("Total spent money: "+salary*staff_number);
                   }
                else{
                    System.out.println("staff seat is full");
                  
                }
                 break;
                
             case 4:
                 System.out.println("Marks Addd");
                 int mark[] = new int[5];
                    String subject_name[]=new String[5];
                    
                        int j,k;
                     float sum=0;
                      float avg, perc;
                      int level=0;
                      int term=0;
                 subject_number++;
                if(subject_number<=5){
                       System.out.println("***************************");
                     System.out.println("------marks information----");
                     System.out.println("***************************");
                     System.out.println("");
                    System.out.println("subject number is:"+subject_number);
                    System.out.println("Enter the student's  name: ");
                      name=scan.next();
                       System.out.println("Enter the student's Id: ");
                       Id=scan.nextInt();
                       System.out.println("Enter the student's class:");
                       Class=scan.nextInt();
                       System.out.println("Enter the student's section:");
                       section=scan.next();
                    
                          System.out.println(" Enter the Level ");
                          level=scan.nextInt();
                          System.out.println(" Enter the term ");
                          term=scan.nextInt();
                      System.out.print("Enter marks Obtained in 5 Subjects : ");
                      for(j=0; j<5; j++)
                       {
                           System.out.println("Enter the subject name:");
                           subject_name[j]=scan.next();
                          System.out.println("marks:");
                          
                        mark[j] = scan.nextInt();
                        
                         sum = sum + mark[j];
                       }
                           avg = sum/5;
                             perc = (sum/500) * 100;
                       System.out.println("student's name: "+name);
                       System.out.println("student's ID: "+Id);
                         System.out.println("Student's class: "+Class);
                        System.out.println("Student's section: "+section);
                        System.out.println("Student's level: "+level);
                        System.out.println("Student's term: "+term);
                        System.out.print("Total Marks = " +sum);
                     System.out.print("Average Marks = " +avg);
                       System.out.print("\nPercentage = " +perc+ "%");                      
                }
                else{
                    System.out.println("All subject  is taken ");
                  
                }
                break;
             case 5:
                  System.out.println("***************************");
                     System.out.println("------attendence information----");
                     System.out.println("***************************");
                     System.out.println("");
                       Date today1 = Calendar.getInstance().getTime();
    System.out.println(today1);
                   int m,n;
                   System.out.println("how many student do u want to take attendence");
                   n=scan.nextInt();
                   for(m=0;m<n;m++){
                    System.out.println("Enter student name: ");
                      name=scan.next();
                       System.out.println("Enter student Id: ");
                       Id=scan.nextInt();
                       System.out.println("Enter student class: ");
                       Class=scan.nextInt();
                       System.out.println("Enter student attendence: ");
                       System.out.println("Type-->**present** for present student");
                       System.out.println("Type-->**absent** for absent student");
                       String attend=scan.next();
                       
                       System.out.println("student name: "+name);
                       System.out.println("id ID: "+Id);
                       System.out.println("class: "+Class);
                       System.out.println("attendence: "+attend);
                   }
             
                       
                       
             
         }
         break;
             case 2:
             System.out.println("now user can use it"); 
             System.out.println("Now the user can seat for the online admission test.");
             System.out.println("Type 1 for class-***1***online addmission test");
             System.out.println("Type 2 for class-***2***online addmission test");
          
             int select2=scan.nextInt();
         switch(select2){
             case 1:
              new OnlineTest("Online Admission test for class-1");  
              break;
             case 2:
                 new OnlineTest1("Online Admission test for class-2");   
        }
        
         }
     
         
         System.out.println("\n------");
         System.out.println("type-1 for add again\n ");
          
            System.out.println("type-2 for exit\n ");
     i=scan.nextInt();
     }while(i==1);

    }
}