package com.classes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import static com.storage.Storage.* ;
import com.main.CollegeManagementSystem;
import com.classes.Student;
import com.classes.Teacher;
import com.classes.Mark;
import com.classes.Attendance;
import com.classes.InvalidPhoneNumberException;
import com.method.Find;
import com.method.Get;
import com.method.Others;
import com.method.Add;
//payment class

public class Payment {
    public int studentId;
    public double tuitionFee;
    public double trainingFee;
   public String stayType;      
    public double hostelFee;     
    public double busFee;       
    public double totalFee;
    public double paidAmount;
    public double balanceAmount;

    public Payment(int studentId, double tuitionFee, double trainingFee, String stayType,
            double hostelFee, double busFee) {
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
        this.trainingFee = trainingFee;
        this.stayType = stayType;
        this.hostelFee = hostelFee;
        this.busFee = busFee;

        double stayFee = stayType.equalsIgnoreCase("hostel") ? hostelFee : busFee;
        this.totalFee = tuitionFee + trainingFee + stayFee;
        this.paidAmount = 0;
        this.balanceAmount = totalFee;
    }

      public  void payFee(double amount) {
        paidAmount += amount;
        balanceAmount -= amount;
        System.out.println("Paying Amount: " + amount);
        System.out.println("Total Paid So Far: " + paidAmount);
        System.out.println("Balance Amount: " + balanceAmount);
    }

   public void print() {
        System.out.println("Student ID: " + studentId +
                " | Total Fee: " + totalFee +
                " | Paid: " + paidAmount +
                " | Balance: " + balanceAmount +
                " | Stay: " + stayType);
    }
}
