
package school_management_system_project;

import javax.swing.JOptionPane;

public class user_information {
     protected String sstudent_name;
     protected String sstudent_id;
     protected String position;
    protected String attendence;

    public user_information(String sstudent_name, String sstudent_id,String position, String attendence) {
        this.sstudent_name = sstudent_name;
        this.sstudent_id = sstudent_id;
        this.position=position;
        this.attendence = attendence;
    }
   
  

   public user_information(){}

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
   

    public String getStudent_name() {
        return sstudent_name;
    }

    public void setStudent_name(String student_name) {
        this.sstudent_name = student_name;
    }

    public String getStudent_id() {
        return sstudent_id;
    }

    public void setStudent_id(String student_id) {
        this.sstudent_id = student_id;
    }

    public String getAttendence() {
        return attendence;
    }

    public void setAttendence(String attendence) {
        this.attendence = attendence;
    }

    @Override
    public String toString() {
        return "user_information{" + "sstudent_name=" + sstudent_name + ", sstudent_id=" + sstudent_id + ", position=" + position + ", attendence=" + attendence + '}';
    }

  


   

  
    public void displayuser(){
        System.out.println("Your name:"+this.sstudent_name);
        System.out.println("Your id:"+this.sstudent_id);
        System.out.println("your position:"+this.position);
        System.out.println("your attendence:"+this.attendence);
        
        JOptionPane.showMessageDialog(null,this.toString());
    }
}