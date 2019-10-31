/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapnhanvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class mainTest {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("Enter your choose:");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    int n;
                    System.out.println("Nhap so sinh vien can them:");
                    n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.inputInfo();
                        studentList.add(std);

                    }
                    break;
                case 2:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }
                    break;
                case 3:
                    int minIndex = 0,
                     maxIndex = 0;
                    float minGpa,
                     maxGpa;

                    minGpa = studentList.get(0).getGpa();
                    maxGpa = studentList.get(0).getGpa();
                    for (int i = 1; i < studentList.size(); i++) {
                        if (studentList.get(i).getGpa() < minGpa) {
                            minIndex = i;
                            minGpa = studentList.get(i).getGpa();
                        }
                        if (studentList.get(i).getGpa() > maxGpa) {
                            maxIndex = i;
                            maxGpa = studentList.get(i).getGpa();
                        }

                    }
                    System.out.println("Sinh vien co GPA cao nhat: ");
                    studentList.get(maxIndex).showInfo();
                    System.out.println("Sinh vien co GPA thap nhat: ");
                    studentList.get(minIndex).showInfo();
                    break;
                case 4:
                    System.out.println("Nhap idNumber can tim kiem: ");
                    String idNumberSearch = scan.nextLine();
                    int count = 0;
                    for (Student student : studentList) {
                        if (student.getIdNumber().equalsIgnoreCase(idNumberSearch)) {
                            student.showInfo();
                            count++;
                        }

                    }

                    if (count == 0) {
                        System.out.println("Khong tim thay sinh vien can tim: ");
                    }
                    break;
                case 5:
                    //B1: Sap xep sinh vien theo thu tu tu A-> Z
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            int cmp = o1.getName().compareTo(o2.getName());
                            if (cmp >= 0) {
                                return -1;
                            }
                            return 1;

                        }

                    });
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }

                    break;
                case 6:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getGpa() >= o2.getGpa() ? -1 : 1;
                        }

                    });
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).checkScholarship()) {
                            studentList.get(i).showInfo();
                        }
                    }

                    break;
                case 7:
                    System.out.println("Goodbye !!!!!");

                    break;
                default:
                    System.err.println("Nhap sai!!!!");
                    break;

            }

        } while (choose != 7);

    }

    static void showMenu() {
        System.out.println("1. Nhap thong tin sinh vien");
        System.out.println("2. Hien thi thong tin sinh vien ");
        System.out.println("3. Hien thi max va min theo GPA");
        System.out.println("4. Tim kiem theo ma sinh vien");
        System.out.println("5. Sort A-> Z theo ten sinh vien & Hien thi");
        System.out.println("6. Hien thi sinh vien duoc hoc bong & sap xep theo thu tu giam dan");
        System.out.println("7. Exit");

    }
}
