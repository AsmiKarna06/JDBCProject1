import java.util.ArrayList;
import java.util.List;
public class Program 
{
	public static void main(String[] args)
	{
		
//		Student s1=new Student(1001,"Asmi");
//		Student s1=new Student(1001,"Asmi");
//		Student s1=new Student(1001,"Asmi");
//		Student s1=new Student(1001,"Asmi");
		
		Faculty f1=new Faculty(2001,"Amit","CSE");
		Faculty f2=new Faculty(2002,"John","CSE");
		Faculty f3=new Faculty(2003,"sami","CSE");
		List<Faculty> fc=new ArrayList<Faculty>();
		fc.add(f1);
		fc.add(f2);		
		
		Student s1=new Student(1001,"Asmi",fc);
	}
}


class Student
{
	int roll;
	String name;
	List<Faculty> faculties;
	Student(int roll,String name,List<Faculty> fac)
	{
		this.roll=roll;
		this.name=name;
		this.faculties=fac;
	}

}

class Faculty
{
	int empid;
	String name;
	String dept;
	List<Student> student;
	Faculty(int empid,String name,String dept)
	{
		this.empid=empid;
		this.name=name;
		this.dept=dept;
	}
}