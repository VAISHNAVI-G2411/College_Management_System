package com.method;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.	IOException;
import java.io.*;
import static com.storage.Storage.* ;
import com.main.CollegeManagementSystem;
import com.classes.Student;
import com.classes.Teacher;
import com.classes.Mark;
import com.classes.Payment;
import com.classes.Attendance;
import com.classes.InvalidPhoneNumberException;
import com.method.Find;
import com.method.Add;
import com.method.Others;

//get class

public  class Get{
static Scanner sc =new Scanner(System.in);
//get student in ascending order

public static void getStudentsAscending(){
if(students.isEmpty()){
System.out.println("no students found");
return;
}
ArrayList<Student>sorted=new ArrayList<>(students);
sorted.sort((a,b)->a.name.compareToIgnoreCase(b.name));
for(Student s:sorted){
 s.print();
} 
}

//get student in decending order

public static void getStudentsDecending(){
if(students.isEmpty()){
System.out.println("no students found");
return;
}
ArrayList<Student>sorted=new ArrayList<>(students);
sorted.sort((a,b)->b.name.compareToIgnoreCase(a.name));
for(Student s:sorted){
s.print();
} 
}
//get Teacher Above Two Subjects

public static void getTeachersAboveTwoSubjects(){
boolean found=false;
for(Teacher t:teachers){
if(t.subjects.size()>=2){
//t.print();
found=true;
System.out.println(t.name);
}
} 
if(found==false){
System.out.println("No teacher is taking more than 2 subjects");
}
}
// get student method

public static void getStudent(){
System.out.println("Enter the ID:");
int id=sc.nextInt();
try(BufferedReader br=new BufferedReader(new FileReader("students_data.txt"))){
String line;
ArrayList<String> record=new ArrayList<>();
boolean found=false;
while((line=br.readLine())!=null){
if(line.startsWith("...")){
record.clear();
continue;
}
record.add(line);
if(line.equals("ID: "+id)){
found=true;
}
if(found && line.startsWith("Department:")){
for(String l:record){
System.out.println(l);
}
return;
}
}
System.out.println("no student found");
}catch(IOException e){
System.out.println("no student found");
}
}

//get teacher method

public static void getTeacher(){
System.out.println("Enter the ID:");
int id=sc.nextInt();
try(BufferedReader br=new BufferedReader(new FileReader("teachers_data.txt"))){
String line;
ArrayList<String> record=new ArrayList<>();
boolean found=false;
while((line=br.readLine())!=null){
if(line.startsWith("...")){
record.clear();
continue;
}
record.add(line);
if(line.equals("ID: "+id)){
found=true;
}
if(found && line.startsWith("Salary:")){
for(String l:record){
System.out.println(l);
}
return;
}
}
System.out.println("no teacher found");
}catch(IOException e){
System.out.println("no teacher found");
}
}
//get mark by rank wise

public static void getMarksRankWise(){
if(marks.isEmpty()){
System.out.println("no marks added");
return;
}
ArrayList<Mark>sorted=new ArrayList<>(marks);
sorted.sort((a,b)->b.getTotalMark()-a.getTotalMark());
int rank=1;
for(int i=0;i<sorted.size();i++){
Mark current=sorted.get(i);
if(i>0 && current.getTotalMark()==sorted.get(i-1).getTotalMark()){
}
else{
rank=i+1;
}
Student s=Find.findStudentById(current.studentId);
String name=(s!=null)?s.name:"unknown";
System.out.println("\nRank:"+rank+" \nID:"+current.studentId+" \nname:"+name+" \ntotal:"+current.getTotalMark());
} 
}

public static void departmentDetails(){
System.out.println("enter department:");
String department=sc.next(); 
for(Student s:students){
if(s.department.equals(department)){
s.print(); 

}
}
}
public static void batchDetails(){
System.out.println("enter batch:");
int batch=sc.nextInt();
for(Student s:students){
if(s.batch==batch){
s.print();
}
}
}

//particularMark

public static void particularMark(){
System.out.println("enter the student ID:");
int studentId=sc.nextInt();
System.out.println("enter the sem:");
int sem=sc.nextInt();
if(sem<0||sem>=8){
System.out.println("Invalid");
return;
}


Mark m=Find.findMarkByStudentID(studentId,sem);
if(m==null){
System.out.println("no marks found");
return;
}
sc.nextLine();
System.out.println("enter the subject name:");
String subject=sc.next();
Integer mark=m.getParticularMark(subject);
if(m==null){
System.out.println("no marks found");
}
else{
System.out.println(subject+" mark is "+mark);
}
}


//averageTotal pass

public static void averageTotalPass(){
if(marks.isEmpty()){
System.out.println("no marks found");
return;
}
for(Mark m:marks){
double avg=m.getAverage();
if(avg>=40){
Student s=Find.findStudentById(m.studentId);
String name=(s!=null)?s.name:" unknown";
System.out.println("ID:"+m.studentId+" Name:"+name+" Average:"+avg);
}}
}

//average Total fail

public static void averageTotalFail(){
if(marks.isEmpty()){
System.out.println("no marks found");
return;
}
boolean found=false;
for(Mark m:marks){
double avg=m.getAverage();
if(avg<40){
Student s=Find.findStudentById(m.studentId);
String name=(s!=null)?s.name:"unknown";
System.out.println("ID:"+m.studentId+" Name:"+name+" Average:"+avg);
found=true;
}}
if(!found){
System.out.println("no students failed");
}
}

//totalMark

public static void totalMark(){
System.out.println("enter the student ID:");
int id=sc.nextInt();
System.out.println("enter the sem:");
int sem=sc.nextInt();
if(sem<0||sem>=8){
System.out.println("Invalid");
return;
}
Mark m=Find.findMarkByStudentID(id,sem);
if(m==null){
System.out.println("no marks found");
return;
}

System.out.println("total marks:"+m.getTotalMark());
}

public static void attendance() {
    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();

    System.out.print("Enter Total Days: ");
    int totalDays = sc.nextInt();

    System.out.print("Enter Present Days: ");
    int presentDays = sc.nextInt();

    double percentage;
    if (totalDays == 0) {
        percentage = 0;
    } else {
        percentage = (presentDays * 100.0) / totalDays;
    }

    System.out.println("Student ID: " + id +"\nTotal Days: " + totalDays +"\nPresent Days: " + presentDays +"\nPercentage: " + percentage + "%");
}

public static void getPaymentByStudentID(){

    System.out.println("Enter the ID:");
    int id = sc.nextInt();

    try(BufferedReader br =
            new BufferedReader(new FileReader("paymentDetails_data.txt"))){

        String line;
        ArrayList<String> record = new ArrayList<>();
        boolean found = false;

        while((line = br.readLine()) != null){

            if(line.startsWith("...")){
                record.clear();
                found = false;
                continue;
            }

            record.add(line);

            if(line.equals("studentId: " + id)){
                found = true;
            }

            if(found && line.startsWith("busFee:")){

                for(String l : record){
                    System.out.println(l);
                }

                return;
            }
        }

        System.out.println("no payment details found");

    }catch(IOException e){
        System.out.println("no payment details found");
    }
}

public static void getMarks(){
System.out.println("Enter the ID:");
int id=sc.nextInt();
try(BufferedReader br=new BufferedReader(new FileReader("marks_data.txt"))){
String line;
ArrayList<String> record=new ArrayList<>();
boolean found=false;
while((line=br.readLine())!=null){
if(line.startsWith("...")){
record.clear();
continue;
}
record.add(line);
if(line.equals("ID: "+id)){
found=true;
}
if(found && line.startsWith("subjectMark:")){
for(String l:record){
System.out.println(l);
}
return;
}
}
System.out.println("no marks found");
}catch(IOException e){
System.out.println("no marks found");
}
}

}
