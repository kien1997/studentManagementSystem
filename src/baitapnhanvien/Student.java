/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapnhanvien;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ginopham
 */
public class Student extends Person {

    private String idNumber;
    private float gpa;
    private String email;

    public Student(String idNumber, float gpa, String email) {
        this.idNumber = idNumber;
        this.gpa = gpa;
        this.email = email;
    }

    public Student() {

    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Id numbber: ");
        while (true) {
            String idNumberInput = input.nextLine();
            boolean check = setIdNumber(idNumberInput);
            if (check) {
                break;
            }
        }
        //code ngan
        /*
        while(setIdNumber(input.nextLine()));
         */

        System.out.print("Studen's GPA: ");
        while (true) {
            //Phan tich kieu du lieu float thanh String de tranh truong hop nhap khong duoc gia tri So

            float gpaInput = Float.parseFloat(input.nextLine());
            boolean check = setGpa(gpaInput);
            if (check) {
                break;
            }
        }

        System.out.print("Studen's email: ");
        while (true) {
            //Nhap trươc 1 biến emailInput và sau đó check xem nó có phù hợp với điều kiện đã tạo không
            //Nếu phù hợp lúc đó mới set giá trị cho nó
            String emailInput = input.nextLine();
            boolean check = setEmail(emailInput);
            if (check) {
                break;
            }
        }

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("; Id Number: " + getIdNumber() + "; Student's GPA: " + getGpa()
                + "; Studen's email: " + getEmail());
        System.out.println("");

    }

    public boolean checkScholarship() {
        return this.gpa >= 8.0;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public boolean setIdNumber(String idNumber) {
        if (idNumber != null && idNumber.length() == 8) {
            this.idNumber = idNumber;
            return true;
        } else {
            System.err.print("Input idNumber again:(with length == 8) ");
        }
        return false;

    }

    public float getGpa() {
        return gpa;
    }

    public boolean setGpa(float gpa) {
        if (gpa >= 0 && gpa <= 10.0) {
            this.gpa = gpa;
            return true;
        } else {
            System.err.println("Enter again student GPA about 0.0 to 10.0");
            return false;
        }

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.err.println("Input email again: (with @ characters and not space)");
        }
        return false;

    }

}
