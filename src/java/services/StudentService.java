
package services;

import dao.StudentDAO;
import entities.Student;
import java.util.List;

public class StudentService {
    
    public String getStudents(){
        StudentDAO sdao = new StudentDAO();
        List<Student> students = sdao.getStudents();
        StringBuilder str = new StringBuilder();
        str.append("<!DOCTYPE html />")
                .append("<html>")
                .append("<head>")
                .append("<title> Students </title>")
                .append("</head>")
                .append("<body>");
        for (Student s: students){
            str.append("<p>").append(s).append("</p>");
        }
        str.append("</body>").append("</html>");
        return str.toString();
    }
    
    public boolean InsertStudent(Student st){
        StudentDAO sdao = new StudentDAO();
        if (sdao.InsertStudent(st)) return true;
        return false;
    }
    
}
