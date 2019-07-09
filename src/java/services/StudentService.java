
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
            String delete = "\t<a href='deletestudent?delete="+s.getId()+"'>delete</a>";
            String update = "\t<a href='updatestudent?update="+s.getId()+"'>update</a>";
            str.append("<p>").append(s).append(delete).append(update).append("</p>");
        }
        str.append("</body>").append("</html>");
        return str.toString();
    }
    
    public boolean InsertStudent(Student st){
        StudentDAO sdao = new StudentDAO();
        if (sdao.InsertStudentJPA(st)) return true;
        return false;
    }
    
    public boolean DeleteStudent(int id){
        StudentDAO sdao = new StudentDAO();
        if(sdao.DeleteStudent(id)) return true;
        return false;
    }
    
}
