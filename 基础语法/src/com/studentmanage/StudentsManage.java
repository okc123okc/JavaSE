package com.studentmanage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Package: com.studentmanage
 * @ClassName: StudentsManage
 * @Description:  控制台学生管理系统
 * @Author: okc
 * @Date: 2021/8/20 22:57
 * @Version 1.8
 **/

public class StudentsManage {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("----------欢迎进入学生管理系统----------");
            System.out.println("1 添加学生");
            System.out.println("2 修改学生");
            System.out.println("3 删除学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择：");
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    changeStudent(array);
                    System.out.println("修改学生");
                    break;
                case "3":
                    deleteStudent(array);
                    break;
                case "4":
                    queryAllStudent(array);
                    break;
                case "5":
                    System.out.println("退出");
                    System.exit(0);
            }
        }

    }

    /**
     * @Description: queryAllStudent方法是 查询所有学生信息
     * @param: [array]
     * @return: void
     */
    private static void queryAllStudent(ArrayList<Student> array) {
        if (array.size()==0) {
            System.out.println("=== 学生信息为空，请添加后查询！===");
            return;
        }
        System.out.println("=== 查询成功，学生信息：===");
        System.out.println("ID\t"+"姓名\t\t"+"年龄\t\t"+"性别\t\t"+"地址");
        for (int i = 0 ; i < array.size() ; i++) {
            Student student = array.get(i);
            System.out.println(student.getSid()+"\t"+student.getName()+"\t"+student.getAge()+"\t\t"+student.getSex()+"\t\t"+student.getAddress());
        }
    }

    /**
     * @Description: addStudent方法是 添加学生
     * @param: [array]
     * @return: void
     */
    private static void addStudent(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学生ID");
            sid = scanner.nextLine();
            //判断学生id是否存在
            boolean used = isUsed(array , sid);
            if (used) {
                System.out.println("该学生ID已使用，请重新输入！");
            }else {
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄");
        String age = scanner.nextLine();
        System.out.println("请输入学生性别");
        String sex = scanner.nextLine();
        System.out.println("请输入学生地址");
        String address = scanner.nextLine();

        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setAddress(address);

        array.add(student);
        System.out.println("===添加成功===");


    }

    /**
     * @Description: deleteStudent方法是 删除学生信息
     * @param: [array]
     * @return: void
     */
    private static void deleteStudent(ArrayList<Student> array) {
        if (array.size()==0) {
            System.out.println("=== 学生ID不存在 ===");
            return;
        }
        System.out.println("请输入要删除的学生ID：");
        Scanner scanner = new Scanner(System.in);
        String sid = scanner.nextLine();
        for (int i = 0 ; i < array.size() ; i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                array.remove(i);
                System.out.println("=== 删除成功 ===");
                break;
            }else {
                System.out.println("=== 学生ID不存在 ===");
            }
        }
    }

    /**
     * @Description: changeStudent方法是 修改学生信息
     * @param: [array]
     * @return: void
     */
    private static void changeStudent(ArrayList<Student> array) {
        if (array.size()==0) {
            System.out.println("=== 没有学生信息，请添加 ===");
            return;
        }
        System.out.println("请输入修改的学生ID：");
        Scanner scanner = new Scanner(System.in);
        String sid = scanner.nextLine();

        int index = -1;
        for (int i = 0 ; i < array.size() ; i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                index = i;
                break;
            }else {
                System.out.println("=== 学生ID不存在 ===");
                return;
            }
        }
        System.out.println("请输入新的学生名字：");
        String name = scanner.nextLine();
        System.out.println("请输入新的学生年龄：");
        String age = scanner.nextLine();
        System.out.println("请输入新的学生性别：");
        String sex = scanner.nextLine();
        System.out.println("请输入新的学生地址：");
        String address = scanner.nextLine();
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setAddress(address);
        array.set(index,student);
        System.out.println("=== 修改成功 ===");
    }

    /**
     * @Description: isUsed方法是 判断学生ID是否存在
     * @param: [array, sid]
     * @return: boolean
     */
    private static boolean isUsed(ArrayList<Student> array , String sid) {
        boolean flag = false;
        for (int i = 0 ; i < array.size() ; i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}