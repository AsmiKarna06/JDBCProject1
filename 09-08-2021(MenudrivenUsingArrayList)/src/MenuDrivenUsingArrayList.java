import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class MenuDrivenUsingArrayList {
	static Scanner scan;
	static Scanner scan1;
    static List<Employee> li = new ArrayList<Employee>();
	public static void main(String[] args) {
	scan = new Scanner(System.in);
	scan1 = new Scanner(System.in);
	while(true)
	{
		
		System.out.println("1.Add Employee.");		
		System.out.println("2.update Salary by Emp number.");
		System.out.println("3.Display by Emp Number.");
		System.out.println("4.Display Employee Details By Department name.");
		System.out.println("5.Display All.");
		System.out.println("0.Exit from Application.");
		System.out.println(" ");
		System.out.println("Please enter your choice:");
		int ch= scan.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Employee Number:");
			int eno = scan.nextInt();
			System.out.println("Enter the Employee Name:");
			String ename = scan1.nextLine();
			System.out.println("Enter Salary:");
			int sal = scan.nextInt();
			System.out.println("Enter the department:");
			String dept = scan.next();
			boolean flag = false;
			for(int i=0;i<li.size();i++)
			{
				if(li.get(i).getEno()==eno)
				{
					flag=true;
					break;
				}
			}
			if (flag == false)
			{			
			Employee e1 = new Employee(eno, ename);
			e1.setSal(sal);
			e1.setDept(dept);
			li.add(e1);
			System.out.println("Record Added Successfully...");
			}
			else 
			{
				System.out.println("Duplicate Record can't be entered...");
			}

			break;
		case 2:
			System.out.println("Enter the Employee number whose salary is to be updated : ");
			eno = scan.nextInt();
			System.out.println("Enter the salary to be updated :");
			sal = scan.nextInt();
			for(int i=0;i<li.size();i++)
			{
				if(li.get(i).getEno()==eno)
				{
					li.get(i).setSal(sal);;
					System.out.println("The salary has been updated...");
					System.out.println(" ");
				}
			}
			break;
		case 3: 
			System.out.println("Enter the Employee Number whose details needs to be searched : ");
			eno = scan.nextInt();
			for (int i=0;i<li.size();i++)
			{
				if(li.get(i).getEno()==eno)
				{
					Iterator<Employee> it = li.iterator();
					while(it.hasNext())
					{
						Employee employee = it.next();
						if(employee.getEno()==eno)
						{
						System.out.println(employee);
						System.out.println(" ");
					    }
					}
				}
			}
			
			break;
		case 4: 
			System.out.println("Enter the department name whose details are to be displayed: ");
			dept = scan1.nextLine();
			for(int i=0;i<li.size();i++)
			{
				if(li.get(i).getDept().equals(dept))
				{
					System.out.println(li.get(i));
				}
			}
			break;
		case 5: 
			Iterator<Employee> it = li.iterator();
			while(it.hasNext())
			{
				Employee employee = it.next();
				System.out.println(employee);
				System.out.println(" ");
			}
			break;
		case 0:
		default:
			System.exit(0);  
			break;
		
		  }
	    }
	}
}