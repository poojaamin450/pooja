package com.mphasis;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

//pojo
@org.hibernate.annotations.Entity
public class Employee{
@Id    
int empno;
@Columns
String empname;
String empemail;
public String getEmpemail() {
    return empemail;
}
public void setEmpemail(String empemail) {
    this.empemail = empemail;
}
public int getEmpno() {
    return empno;
}
public void setEmpno(int empno) {
    this.empno = empno;
}
public String getEmpname() {
    return empname;
}
public void setEmpname(String empname) {
    this.empname = empname;
}
@Override
public String toString() {
    return "Employee [empno=" + empno + ", empname=" + empname + ", empemail=" + empemail + "]";
}





}
