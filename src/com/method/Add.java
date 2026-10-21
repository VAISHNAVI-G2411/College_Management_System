package com.method;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
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
import com.method.Others;

//add class

public  class Add{

static Scanner sc =new Scanner(System.in);

//add mark

public static void addMark(){
System.out.println("enter the student ID:");
int studentId=sc.nextInt();
System.out.println("enter the sem:");
int sem=sc.nextInt();

System.out.println("enter the department:");
String department=sc.next();
System.out.println("enter the number of subjects:");
int sub=sc.nextInt();
sc.nextLine();

HashMap<String,Integer>subjectMark=new HashMap<>();

for(int i=1;i<=sub;i++){
System.out.print("subject "+i+" name:");
String subject=sc.next();
System.out.print("mark:");
int mark=sc.nextInt();
sc.nextLine();
subjectMark.put(subject,mark);
}
Mark m=new Mark(studentId,sem,department,subjectMark);
marks.add(m);
System.out.println("marks added successfully ");

try(FileWriter fw=new FileWriter("marks_data.txt",true)){
fw.write("ID: "+m.studentId+"\n");
fw.write("Semester: "+m.sem+"\n");
fw.write("Department: "+m.department+"\n");
fw.write("subjectMark: "+m.subjectMark+"\n");
fw.write(".................................................\n");

}catch(IOException e){
System.out.println("Error writing marks data to file: "+e.getMessage());
}
}

//add student

public static void addStudent(){
sc.nextLine();
System.out.println("Enter the name:");
String name=sc.nextLine();
sc.nextLine();
//sc.next();


while (!name.matches("[a-zA-Z ]+")) {
sc.next();
System.out.println("Invalid name. Enter letters only:");
name = sc.next();
}
int id;

while (true) {
    System.out.println("Enter the id:");

    if (sc.hasNextInt()) {
        id = sc.nextInt();

        if (id != 0) {
            break;
        }

        System.out.println("Invalid ID. ID cannot be zero.");
    } 
    else {
        System.out.println("Invalid ID. Enter numbers only:");
        sc.nextLine();
    }
}System.out.println("Enter the address:");
String address=sc.nextLine();
sc.next();

String phoneNo;

while (true) {
    System.out.println("Enter the phone number:");
    phoneNo = sc.next();

    try {
        Student.validatePhoneNumber(phoneNo);
        break;
    }
    catch (InvalidPhoneNumberException e) {
        System.out.println(e.getMessage());
    }
}


System.out.println("enter the batch(2026):");
int batch=sc.nextInt();
while (batch < 1950 || batch > 2100) {
    System.out.println("Invalid batch. Enter a valid year:");
    batch = sc.nextInt();
}

float cutOff;
String department;
while (true) {
  
    System.out.println("Enter the cut off:");
    cutOff = sc.nextFloat();
     
    if (cutOff > 130 && cutOff <= 140) {

        System.out.println("SELECT DEPARTMENT:\n MECH\n CIVIL\n OTHERS");

        System.out.println("Enter the department:");
        department = sc.next();

        while (!department.equalsIgnoreCase("MECH") &&
               !department.equalsIgnoreCase("CIVIL") &&
               !department.equalsIgnoreCase("OTHERS")) {

            System.out.println("Invalid department. Please select from the given options:");
            department = sc.next();
        }

        break;
    }

    else if (cutOff > 140 && cutOff <= 150) {

        System.out.println("SELECT DEPARTMENT:\n MECH\n EEE\n CIVIL\n OTHERS");

        System.out.println("Enter the department:");
        department = sc.next();

        while (!department.equalsIgnoreCase("MECH") &&
               !department.equalsIgnoreCase("EEE") &&
               !department.equalsIgnoreCase("CIVIL") &&
               !department.equalsIgnoreCase("OTHERS")) {

            System.out.println("Invalid department. Please select from the given options:");
            department = sc.next();
        }

        break;
    }

    else if (cutOff > 150 && cutOff <= 160) {

        System.out.println("SELECT DEPARTMENT:\n MECH\n EEE\n CIVIL\n ECE\n OTHERS");

        System.out.println("Enter the department:");
        department = sc.next();

        while (!department.equalsIgnoreCase("MECH") &&
               !department.equalsIgnoreCase("EEE") &&
               !department.equalsIgnoreCase("CIVIL") &&
               !department.equalsIgnoreCase("ECE") &&
               !department.equalsIgnoreCase("OTHERS")) {

            System.out.println("Invalid department. Please select from the given options:");
            department = sc.next();
        }

        break;
    }

    else if (cutOff > 160 && cutOff <= 170) {

        System.out.println("SELECT DEPARTMENT:\n MECH\n EEE\n CIVIL\n ECE\n IT\n OTHERS");

        System.out.println("Enter the department:");
        department = sc.next();

        while (!department.equalsIgnoreCase("MECH") &&
               !department.equalsIgnoreCase("EEE") &&
               !department.equalsIgnoreCase("CIVIL") &&
               !department.equalsIgnoreCase("ECE") &&
               !department.equalsIgnoreCase("IT") &&
               !department.equalsIgnoreCase("OTHERS")) {

            System.out.println("Invalid department. Please select from the given options:");
            department = sc.next();
        }

        break;
    }

    else if (cutOff > 170 && cutOff <= 180) {

        System.out.println("SELECT DEPARTMENT:\n MECH\n EEE\n CIVIL\n ECE\n IT\n CSE\n OTHERS");

        System.out.println("Enter the department:");
        department = sc.next();

        while (!department.equalsIgnoreCase("MECH") &&
               !department.equalsIgnoreCase("EEE") &&
               !department.equalsIgnoreCase("CIVIL") &&
               !department.equalsIgnoreCase("ECE") &&
               !department.equalsIgnoreCase("IT") &&
               !department.equalsIgnoreCase("CSE") &&
               !department.equalsIgnoreCase("OTHERS")) {

            System.out.println("Invalid department. Please select from the given options:");
            department = sc.next();
        }

        break;
    }

    else if (cutOff > 180 && cutOff <= 190) {

        System.out.println("SELECT DEPARTMENT:\n MECH\n EEE\n CIVIL\n ECE\n IT\n CSE\n AI&DS\n OTHERS");

        System.out.println("Enter the department:");
        department = sc.next();

        while (!department.equalsIgnoreCase("MECH") &&
               !department.equalsIgnoreCase("EEE") &&
               !department.equalsIgnoreCase("CIVIL") &&
               !department.equalsIgnoreCase("ECE") &&
               !department.equalsIgnoreCase("IT") &&
               !department.equalsIgnoreCase("CSE") &&
               !department.equalsIgnoreCase("AI&DS") &&
               !department.equalsIgnoreCase("OTHERS")) {

            System.out.println("Invalid department. Please select from the given options:");
            department = sc.next();
        }

        break;
    }

    else if (cutOff > 190 && cutOff <= 200) {

        System.out.println("SELECT DEPARTMENT:\n MECH\n EEE\n CIVIL\n ECE\n IT\n CSE\n AI&DS\n AERO\n OTHERS");

        System.out.println("Enter the department:");
        department = sc.next();

        while (!department.equalsIgnoreCase("MECH") &&
               !department.equalsIgnoreCase("EEE") &&
               !department.equalsIgnoreCase("CIVIL") &&
               !department.equalsIgnoreCase("ECE") &&
               !department.equalsIgnoreCase("IT") &&
               !department.equalsIgnoreCase("CSE") &&
               !department.equalsIgnoreCase("AI&DS") &&
               !department.equalsIgnoreCase("AERO") &&
               !department.equalsIgnoreCase("OTHERS")) {

            System.out.println("Invalid department. Please select from the given options:");
            department = sc.next();
        }

        break;
    }

    else {
        System.out.println("Invalid cutoff please enter again");
    }}
if (department.equalsIgnoreCase("others")) {
    System.out.println("Enter your department:");
    department = sc.next();
}

Student s=null;
try{
s=new Student(name,id,address,phoneNo,batch,cutOff,department);
}catch(InvalidPhoneNumberException e){
System.out.println(e.getMessage());
return;
}
students.add(s);
System.out.println("student details are added successfully");

try(FileWriter fw=new FileWriter("students_data.txt",true)){
fw.write("Name: "+s.name+"\n");
fw.write("ID: "+s.id+"\n");
fw.write("Address: "+s.address+"\n");
fw.write("Phone No: "+s.phoneNo+"\n");
fw.write("Batch: "+s.batch+"\n");
fw.write("Cut Off: "+s.cutOff+"\n");
fw.write("Department: "+s.department+"\n");
fw.write(".................................................\n");
}catch(IOException e){
System.out.println("Error writing student data to file: "+e.getMessage());
}}

// add teacher

public static void addTeacher(){
System.out.println("Enter the name:");
String name=sc.next();
System.out.println("enter the id:");
int id=sc.nextInt();
System.out.println("Enter the department:");
String department=sc.next();
System.out.println("enter the number of subjects:");
int sub=sc.nextInt();
sc.nextLine();

ArrayList<String>subjects=new ArrayList<>();
 
for(int i=1;i<=sub;i++){
System.out.print("subject "+i+" :");
subjects.add(sc.next());
}
System.out.println("Enter the address:");
String address=sc.next();
System.out.println("Enter the phone number:");
long phoneNo=sc.nextLong();
System.out.println("Enter the EmailId:");
String emailId=sc.next();
System.out.println("enter the experience:");
int experience=sc.nextInt();
System.out.println("enter the salary:");
int salary=sc.nextInt();
Teacher t=new Teacher(name,id,department,subjects,address,phoneNo,emailId,experience,salary);
teachers.add(t);
System.out.println("Teacher details are added successfully");

try(FileWriter fw=new FileWriter("teachers_data.txt",true)){
fw.write("Name: "+t.name+"\n");
fw.write("ID: "+t.id+"\n");
fw.write("Department: "+t.department+"\n");
fw.write("Subjects: "+t.subjects+"\n");
fw.write("Address: "+t.address+"\n");
fw.write("Phone No: "+t.phoneNo+"\n");
fw.write("EmailId: "+t.emailId+"\n");
fw.write("Experience: "+t.experience+"\n");
fw.write("Salary: "+t.salary+"\n");
fw.write(".................................................\n");

}catch(IOException e){
System.out.println("Error writing teacher data to file: "+e.getMessage());
}
}

// add payment details

public static void addPaymentDetails() {

int studentId;

while (true) {
    System.out.print("Enter student id: ");

    if (sc.hasNextInt()) {
        studentId = sc.nextInt();
        break;
    } else {
        System.out.println("Invalid student ID. Enter numbers only.");
        sc.next();
    }
}
    System.out.print("Enter Tuition Fee: ");
    double tuitionFee = sc.nextDouble();
while (tuitionFee < 0) {
    System.out.println("Invalid fee. Fee cannot be negative.");
    System.out.print("Enter Tuition Fee again: ");
    tuitionFee = sc.nextDouble();
}

    System.out.print("Enter Training Fee: ");
    double trainingFee = sc.nextDouble();
    while (trainingFee < 0) {
    System.out.println("Invalid fee. Fee cannot be negative.");
    System.out.print("Enter Training Fee again: ");
    trainingFee = sc.nextDouble();
}
    sc.nextLine();
    System.out.print("Hostel or Dayscholar? (hostel/dayscholar): ");
    String stayType = sc.nextLine();

    double hostelFee = 0;
    double busFee = 0;

    if (stayType.equalsIgnoreCase("hostel")) {
        System.out.print("Enter Hostel Fee: ");
        hostelFee = sc.nextDouble();

         while (hostelFee < 0) {
        System.out.println("Invalid fee. Fee cannot be negative.");
        System.out.print("Enter Hostel Fee again: ");
        hostelFee = sc.nextDouble();
    }
    } else {
        System.out.print("Enter Bus Fee: ");
        busFee = sc.nextDouble();

          while (busFee < 0) {
        System.out.println("Invalid fee. Fee cannot be negative.");
        System.out.print("Enter Bus Fee again: ");
        busFee = sc.nextDouble();
    }
    }

    Payment p=new Payment(studentId, tuitionFee, trainingFee, stayType, hostelFee, busFee);
payments.add(p);
    System.out.println("Payment details added successfully!");


try(FileWriter fw=new FileWriter("paymentDetails_data.txt",true)){
fw.write("studentId: "+p.studentId+"\n");
fw.write("tuitionFee: "+p. tuitionFee+"\n");
fw.write("trainingFee: "+p. trainingFee+"\n");
fw.write("stayType: "+p.stayType+"\n");
fw.write("hostelFee: "+p.hostelFee+"\n");
fw.write("busFee: "+p.busFee+"\n");

fw.write(".................................................\n");

}catch(IOException e){
System.out.println("Error writing payment details data to file: "+e.getMessage());
}
}
}