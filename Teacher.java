
package school_management_system_project;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    
    private String post;
   
    public Teacher(int id, String name, int salary,String post){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.post=post;
    }

   

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    
  
    public int getId(){
        return id;
    }

   
    public String getName(){
        return name;
    }


 
    public int getSalary(){
        return  salary;
    }

   public void setSalary(int salary){
        this.salary=salary;
    }

   
    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                ;
    }
}