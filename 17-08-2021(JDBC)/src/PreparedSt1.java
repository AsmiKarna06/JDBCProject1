import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedSt1 {
	public static void main(String args[])
	{
		try
		{
			int eno,sl;
			String nm;
			while(true)
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");
			
			System.out.println("Enter new Emp");
			Scanner scan=new Scanner(System.in);
			eno=Integer.parseInt(scan.nextLine());
			System.out.println("Enter new Emp name");
			nm=scan.nextLine();
			System.out.println("Enter Salary");
			sl=Integer.parseInt(scan.nextLine());
			String sql="Select count(*) as nor from emp where empno=?";
			PreparedStatement ps1=con.prepareStatement(sql);
			ps1.setInt(1, eno);
			ResultSet rs=ps1.executeQuery();
			int nor=0;
			while(rs.next())
			{
				nor=rs.getInt(1);
			}
			if(nor==1)
			{
				System.out.println("Alreaded exist.Please enter new emp");
				continue;
			}
			else
				break;
		}
			String sql="insert into emp(empno,ename,sal) values(?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1,eno);
			stmt.setString(2, nm);
			stmt.setInt(3, sl);
			int nor=stmt.executeUpdate();
			System.out.println(nor + "Record Added succ");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
