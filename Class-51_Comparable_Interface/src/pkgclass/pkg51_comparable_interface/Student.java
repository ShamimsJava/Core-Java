
package pkgclass.pkg51_comparable_interface;


public class Student implements Comparable{
    
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
    

    @Override
    public int compareTo(Object obj) {
        Student std = (Student) obj;
        System.out.println("=========="+ this.age + " Compare with " +std.age + "==========");
             //decenending
        return this.age - std.age;
            //assending
        //return std.age - this.age;
    }
    
}
