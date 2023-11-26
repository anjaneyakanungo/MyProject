package myproject;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		  
        System.out.println("Enter m1,m2,m3,roll,name and course");
        Scanner sc=new Scanner(System.in);
        
        Student1 s=new Student1();
        s.m1=sc.nextInt();
        s.m2=sc.nextInt();
        s.m3=sc.nextInt();
        s.roll=sc.nextInt();
        sc.nextLine();
        s.name=sc.nextLine();
        s.course=sc.nextLine();
        
        System.out.println("Total is "+s.total());
        System.out.println("Average is "+s.average());
        System.out.println("Grade is "+s.grade());
        System.out.println("Student Details are "+s.details());

	}

}

class Student1{

    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
   
    
    public int total()
    {
        return m1+m2+m3;
    }
    
    public double average()
    {
        return total()/3;
    }
    
    public char grade()
    {
        if(total()>70)
            return 'A';
        else
            return 'B';
    }
    
    public String details()
    {
        return "Roll no:"+roll+"\n"+"Name of the Student:"+name+"\n"+"Course Name is:"+course+"\n";
    }

}
    