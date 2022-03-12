
package school_management_system_project;

import java.util.List;

public class School {

    

    private List<Teacher> teachers;
    private List<Student> students;
    private String name;
    private String address;
    public School(List<Teacher> teachers, List<Student> students,String name,String address) {
        this.teachers = teachers;
        this.students = students;
        this.name=name;
        this.address=address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    
    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }


   
}