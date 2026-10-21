package com.classes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import static com.storage.Storage.* ;
import com.main.CollegeManagementSystem;
import com.classes.Student;
import com.classes.Teacher;
import com.classes.Payment;
import com.classes.Attendance;
import com.classes.InvalidPhoneNumberException;
import com.method.Find;
import com.method.Get;
import com.method.Others;
import com.method.Add;
//mark class

public  class Mark{
public int studentId;
public int sem;
public String department;

public HashMap<String,Integer>subjectMark=new HashMap<>();


public Mark(int studentId,int sem,String department,HashMap<String,Integer>subjectMark){
this.studentId=studentId;
this.sem=sem;
this.department=department;

this.subjectMark=subjectMark;
}
public int getTotalMark(){
int total=0;
for(int m:subjectMark.values()){
total+=m;
}
return total;
}
public Integer getParticularMark(String subject){
return subjectMark.get(subject);
}
public double getAverage(){
if(subjectMark.isEmpty()){
return 0;
}
return getTotalMark()/(double)subjectMark.size();
}
}  
