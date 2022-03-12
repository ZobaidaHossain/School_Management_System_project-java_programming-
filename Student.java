
package school_management_system_project;
public class Student {

    private int id;
    private String name;
    private int grade;
    private String address;
    
    public Student(int id, String name,int grade,String address){
       
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.address=address;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }
    
    public int getId() {
        return id;
    }

   
    public String getName() {
        return name;
    }

  
    public int getGrade() {
        return grade;
    }

   
    @Override
    public String toString() {
        return "Student's name :"+name;
    }
}