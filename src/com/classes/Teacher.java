package com.classes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import static com.storage.Storage.* ;
import com.main.CollegeManagementSystem;
import com.classes.Student;
import com.classes.Mark;
import com.classes.Payment;
import com.classes.Attendance;
import com.classes.InvalidPhoneNumberException;
import com.method.Find;
import com.method.Get;
import com.method.Others;
import com.method.Add;


//teacher class

public  class Teacher{
public String name;
public int id;
public String department;
public ArrayList<String>subjects=new ArrayList<>();
public String address;
public long phoneNo;
public String emailId;
public int experience;
public int salary;


public Teacher(String name,int id,String department,ArrayList<String>subjects
,String address,long phoneNo,String emailId,int experience,int salary){
this.name=name;
this.id=id;
this.department=department;
this.subjects=subjects;
this.address=address;
this.phoneNo=phoneNo;
this.emailId=emailId;
this.experience=experience;
this.salary=salary;

}
public void print(){
System.out.println("name:"+name+"\nid:"+id+"\ndepartment:"+department+"\nsubjects:"+subjects+"\naddress:"+address+"\nphoneNo:"+phoneNo+"\nEmailId:"+emailId+"\nexperience:"+experience+"\nsalary:"+salary);

}}
