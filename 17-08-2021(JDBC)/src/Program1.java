import java.sql.*;
public class Program1 
{
	public static void main(String []args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select empno,ename,job,sal from emp");
			while(rs.next())
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			con.close();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
}
