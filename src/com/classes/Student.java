package com.classes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import static com.storage.Storage.* ;
import com.main.CollegeManagementSystem;
import com.classes.Teacher;
import com.classes.Mark;
import com.classes.Payment;
import com.classes.Attendance;
import com.classes.InvalidPhoneNumberException;
import com.method.Find;
import com.method.Get;
import com.method.Others;
import com.method.Add;
//student class

public  class Student{
public String name;
public int id;
public String address;
public String phoneNo;
public int batch;
public float cutOff;
public String department;

public Student(String name,int id,String address,String phoneNo,int batch,float cutOff,String department)throws InvalidPhoneNumberException{
this.name=name;
this.id=id;
this.address=address;
this.phoneNo=phoneNo;
this.batch=batch;
this.cutOff=cutOff;
this.department=department;

}
public static void validatePhoneNumber(String phoneNo)
        throws InvalidPhoneNumberException {

     if (!phoneNo.matches("\\d{10}") || phoneNo.matches("0{10}")) {
        throw new InvalidPhoneNumberException(
            "Phone number must be exactly 10 digits and cannot be all zeros"
        );
    }
}
public void print(){
System.out.println("name:"+name+"\nid:"+id+"\naddress:"+address+"\nphoneNo:"+phoneNo+"\nbatch:"+batch+"\ncut off:"+cutOff+"\ndepartment:"+department);

}}
