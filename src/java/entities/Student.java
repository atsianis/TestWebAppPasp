/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Objects;

/**
 *
 * @author George.Pasparakis
 */
public class Student {
    // ID, SURNAME, NAME, GRADE, BIRTHDATE
    
    private int id;
    private String surname;
    private String name;
    private float grade;
    private String birthDate;
    
    public Student(){
    }

    public Student(int id, String surname, String name, float grade, String birthDate) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.grade = grade;
        this.birthDate = birthDate;
    }
    
    public Student(String surname, String name, float grade, String birthDate) {
        this.surname = surname;
        this.name = name;
        this.grade = grade;
        this.birthDate = birthDate;
    }
    
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.surname);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Float.floatToIntBits(this.grade);
        hash = 29 * hash + Objects.hashCode(this.birthDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.grade) != Float.floatToIntBits(other.grade)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", surname=" + surname + ", name=" + name + ", grade=" + grade + ", birthDate=" + birthDate + '}';
    }
    
    
    
    
}
