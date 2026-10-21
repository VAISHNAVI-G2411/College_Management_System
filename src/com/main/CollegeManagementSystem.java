package com.main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import static com.storage.Storage.* ;
import com.classes.Student;
import com.classes.Teacher;
import com.classes.Mark;
import com.classes.Payment;
import com.classes.Attendance;
import com.classes.InvalidPhoneNumberException;
import com.method.Find;
import com.method.Get;
import com.method.Others;
import com.method.Add;

public class CollegeManagementSystem{
static Scanner sc=new Scanner(System.in);
static Add addObj=new Add();
static Get getObj=new Get();
static Others otherObj=new Others();
static Find findObj=new Find();


public static void main(String[] args){
//CollegeManagementSystem sys=new CollegeManagementSystem();


int need;
 
do{
System.out.println("\nlist of need\n 1.Add Student\n 2.Get Student\n 3.Get Students In Ascending Order or decending order\n 4.update student\n 5.All Student\n 6.Add Mark\n 7.Get marks rank-wise\n 8.Total Mark\n 9.Particular Mark\n 10.Average Total\n 11.Add Teacher\n 12.Get Teacher\n 13.Get teacher above two subjects\n 14.Search Student by name\n 15.delete student\n 16.addPaymentDetails\n 17.findPaymentByStudentId\n 18.payFee\n 19.Attendance\n 20.getPaymentDetailsByID\n 21.getMarks\n 22.exit");

System.out.println("enter the need:");

try{
 need=sc.nextInt();

switch(need){
case 1:
//addStudent


addObj.addStudent();

break;

case 2:
//getStudent
System.out.println(" 1.passedout student\n 2.studying student");
System.out.println("enter which student:");
int whichStudent =sc.nextInt();

switch (whichStudent){

case 1:
getObj.getStudent();
break;

case 2:
getObj.getStudent();
break;

default:
System.out.println("student not found");
}
break;

case 3:
System.out.println(" 1.Ascending order\n 2.Decending order\n");
System.out.println("enter the order:");
int order=sc.nextInt();
switch(order){
case 1:
getObj.getStudentsAscending();
break;
case 2:
getObj.getStudentsDecending();
break;
}
break;

case 4:
//update student

otherObj.updateStudent();
break;

case 5:
//allStudent

System.out.println(" 1.one department students detail\n 2.one batch student details\n 3.all the student details studied till now\n");
System.out.println("enter which student details:");
int whichStudentsDetails=sc.nextInt();

switch (whichStudentsDetails){
case 1:
getObj.departmentDetails();
break;

case 2:
getObj.batchDetails();
break;

case 3:
for(Student s:students){
s.print();
}
break;

default:
System.out.println("student not found");

}
break;

case 6:
//addMark

addObj.addMark();
break;

case 7:
getObj.getMarksRankWise();
break;

case 8:
//totalMark
getObj.totalMark();
break;

case 9:
//particularMark
getObj.particularMark();
break;

case 10:
//averageTotal

System.out.println(" 1.passed students\n 2.failed students\n");
System.out.println("enter the average:");
int avg =sc.nextInt();
switch(avg){
case 1:
getObj.averageTotalPass();
break;

case 2:
getObj.averageTotalFail();
break;
}
break; 

case 11:
addObj.addTeacher();
break;

case 12:
getObj.getTeacher();
break;

case 13:
getObj.getTeachersAboveTwoSubjects();
break;

case 14:
Find.searchStudentByName();
break;

case 15:
otherObj.deleteStudent();
break;

case 16:
addObj.addPaymentDetails();
break;

case 17:
findObj.findPaymentByStudentId();
break;

case 18:
otherObj.payFee();
break;

case 19:
getObj.attendance();
break;

case 20:
getObj.getPaymentByStudentID();
break;

case 21:
getObj.getMarks();
break;

case 22:
System.out.println("exit");
break;

default:
System.out.println("invalid");

}

}
catch(Exception e){
System.out.println("enter the given options ");
sc.nextLine();
need=0;
}

}
while(need!=22);

}
}

