package com.method;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import static com.storage.Storage.* ;
import com.main.CollegeManagementSystem;
import com.classes.Student;
import com.classes.Teacher;
import com.classes.Mark;
import com.classes.Payment;
import com.classes.Attendance;
import com.classes.InvalidPhoneNumberException;
import com.method.Add;
import com.method.Get;
import com.method.Others;

//find class

public  class Find{
static Scanner sc =new Scanner(System.in);
public static Mark findMarkByStudentID(int id,int sem){
for(Mark m:marks){
if(m.studentId==id){
if(m.sem==sem){
return m;
}

}}

return null;
}

public static Student findStudentById(int id){
for(Student s:students){
if(s.id==id){
return s;
}}

return null;
}

public static Payment findPaymentByStudentId() {
System.out.print("Enter student id: ");
    int id1 = sc.nextInt();

    for (Payment p : payments) {
        if (p.studentId == id1) {
            p.print();
            return p;
           
        }
    }
    return null;
}
public static void searchStudentByName(){
sc.nextLine();
System.out.print("Enter search keyword: ");
String keyword=sc.nextLine();
boolean found=false;
for(Student s:students){
if(s.name.toLowerCase().contains(keyword.toLowerCase())){
s.print();
found=true;
}
}
if(!found){
System.out.println("no student found");
}
}
}
