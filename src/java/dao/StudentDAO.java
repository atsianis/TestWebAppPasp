
package dao;

import controllers.MyServlet;
import entities.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDAO extends Database {

    String server = "localhost:3306";
    String database = "bootcampdb";
    String username = "root";
    String password = "uaIngSOm0f";
    
    

    public StudentDAO() {
        super();
    }
    
    public List<Student> getStudents(){
        
        Student st;
        List<Student> students = new ArrayList<>();
        setOptions("?zeroDateTimeBehavior=convertToNull&serverTimezone=Europe/Athens&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false");
        String query = "SELECT * FROM `bootcampdb`.`students`";
        ResultSet rs = Database(server, database, username, password, query);
        if(rs == null) { System.out.println("Error to the database");} 
        try {
            while(rs.next()) {
                st = new Student(rs.getInt("ID"), rs.getString("SURNAME"), 
                                         rs.getString("NAME"), rs.getFloat("GRADE"), 
                                         rs.getString("BIRTHDATE")); 
                students.add(st);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return students;
    
    }
    
    public boolean InsertStudent(Student st) {
        String query = "INSERT INTO `bootcampdb`.`students` \n" +
                        "(SURNAME,NAME,GRADE,BIRTHDATE) \n" +
                        "VALUES(\"" + st.getSurname() + "\",\"" + st.getName() + "\"," + st.getGrade() + "," + "\"" + st.getBirthDate() + "\")";
        int i = Database(server, database, username, password, query, (byte) 1);
        if(i >= 1) return true;
        return false;
    }
}
