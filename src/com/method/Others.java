package com.method;
import java.io.*;
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
import com.method.Find;
import com.method.Get;
import com.method.Add;

//other class

public class Others{
static Scanner sc =new Scanner(System.in);



//update student

public static void updateStudent(){
System.out.println("enter the id of the student to be updated:");
int id=sc.nextInt();
sc.nextLine();
Student s=Find.findStudentById(id);
if(s==null){
System.out.println("no student found");
return;
}
System.out.println("enter the name to be updated:");
String name=sc.next();
if(!name.isBlank()){
s.name=name;
}

System.out.println("Enter the address to be updated:");
String address=sc.next();
if(!address.isBlank()){
s.address=address;
}

System.out.println("Enter the phone number:");
String phoneNo = sc.next();

if (!phoneNo.equals("0")) {
    s.phoneNo = phoneNo;
}

System.out.println("enter the batch(2026):");
int batch=sc.nextInt();
if(batch==0){
s.batch=batch;
}

System.out.println("Enter the department:");
String department=sc.next();
if(!department.isBlank()){
s.department=department;
}
}

//delete student

public static void deleteStudent(){
System.out.println("enter the student id to be deleted:");
int id=sc.nextInt();
//sc.next();

Student s=Find.findStudentById(id);
if(s==null){
System.out.println("no student found");
return;
}

students.remove(s);
System.out.println("the student is deleted successfully");
}


// Pay towards a student's fee balance

public static void payFee() {

    Payment p = Find.findPaymentByStudentId();
    if (p == null) {
        System.out.println("No payment record found " );
        return;
    }

    if (p.balanceAmount <= 0) {
        System.out.println("Fee already fully paid. Balance: " + p.balanceAmount);
        return;
    }

   //System.out.println("Total Fee: " + p.totalFee);
 //  System.out.println("Current Balance: " + p.balanceAmount);
    System.out.print("Enter amount to pay: ");
    double amount = sc.nextDouble();
 
    if (amount <= 0) {
        System.out.println("Amount must be greater than 0.");
        return;
    }
    if (amount > p.balanceAmount) {
        System.out.println("Amount exceeds balance. Balance is only " + p.balanceAmount);
        return;
    }

    p.payFee(amount);
}


}

