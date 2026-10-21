

 

package com.classes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import static com.storage.Storage.* ;
import com.main.CollegeManagementSystem;
import com.classes.Student;
import com.classes.Teacher;
import com.classes.Mark;
import com.classes.Payment;
import com.classes.InvalidPhoneNumberException;
import com.method.Find;
import com.method.Get;
import com.method.Others;
import com.method.Add;

//attendance class

public  class Attendance {
public int studentId;

public int totalDays;
public int presentDays;
public Attendance(int studentId,int totalDays, int presentDays) {
this.studentId=studentId;
this.totalDays = totalDays;
this.presentDays = presentDays;
}
} 
