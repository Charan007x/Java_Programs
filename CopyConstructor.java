import java.util.Scanner;

class student{
    String name;
    int age;
    student(String name,int age){
        this.name=name;
        this.age=age;
    }
    student(student s){
        this.name=s.name;
        this.age=s.age;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        student s1=new student("Charan",20);
        student s2=new student(s1);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
