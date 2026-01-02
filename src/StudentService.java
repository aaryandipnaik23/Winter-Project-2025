import java.util.*;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student s){
        students.add(s);
        System.out.println("Student Added Successfully");
    }

    void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No students found");
            return;
        }
        for(Student s : students)
            System.out.println(s);
    }

    void searchStudent(int id){
        for(Student s : students){
            if(s.id == id){
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found");
    }

    void deleteStudent(int id){
        Iterator<Student> it = students.iterator();
        while(it.hasNext()){
            if(it.next().id == id){
                it.remove();
                System.out.println("Student deleted");
                return;
            }
        }
        System.out.println("Student not found");
    }
}
