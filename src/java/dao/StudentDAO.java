
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
    
    public StudentDAO() {
        super();
    }
    
    public List<Student> getStudents(){
        
        Student st;
        List<Student> students = new ArrayList<>();
        
        String server = "localhost:3306";
        String database = "bootcampdb";
        String username = "root";
        String password = "uaIngSOm0f";
        String query = "SELECT * FROM `bootcampdb`.`students`";
        
       
        setOptions("?zeroDateTimeBehavior=convertToNull&serverTimezone=Europe/Athens&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false");
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
}
