package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.model.Emp;

public class EmpDAO 
{
	public static boolean addEmployee(Emp obj)
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");
			
			boolean flag=EmpDAO.ifEmpnoExists(obj.getEmpno());
			if(flag==false)
			{
				String sql="insert into emp(empno,ename,job,sal,deptno) values(?,?,?,?,?)";
				PreparedStatement stmt=con.prepareStatement(sql);
				stmt.setInt(1, obj.getEmpno());
				stmt.setString(2, obj.getEname());
				stmt.setString(3, obj.getJob());
				stmt.setFloat(4, obj.getSal());
				stmt.setInt(5, obj.getDeptno());
				int nor=stmt.executeUpdate();
				con.close();
				if(nor>0)
					return true;
				else
					return false;
			}
			else
			{
				System.out.println("Dubplicate");
				return false;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	public static List<Emp> showAllEmployees()
	{
		List<Emp> empList=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");		
			String sql="Select empno,ename,sal,deptno,job as nor from emp";
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			boolean rf=false;
			Emp e;
			while(rs.next())
			{
				e=new Emp(rs.getInt(1),rs.getString(2),rs.getString(5),rs.getFloat(3),rs.getInt(4));
				empList.add(e);
			}
			con.close();
			return empList;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			return null;
		}
		//return null;
	}
	public static boolean ifEmpnoExists(int empno)
	{
		List<Emp> empList=new ArrayList<>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");		
			String sql="Select count(*) as nor from emp where empno=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, empno);
			
			ResultSet rs=stmt.executeQuery();
			boolean rf=false;
			Emp e;
			int noe=0;
			while(rs.next())
			{
				noe=rs.getInt("noe");
				
			}
			con.close();
			if(noe>0)
				return true;
			else
				return false;
			
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			return false;
		}
		//return false;
	}
public static boolean updateSalByEmpno(Emp obj)
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");		
		String sql="update emp set sal=? where empno=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setFloat(1, obj.getSal());
		stmt.setInt(2, obj.getEmpno());
		//ResultSet rs=stmt.executeQuery();
		int nor=stmt.executeUpdate();
		con.close();
		if(nor>0)
		
			return true;
		else
			return false;
		
		
	}
	catch(Exception e)
	{
		//e.printStackTrace();
		return false;
	}
	//return false;
	}

public static boolean showByEmployeeNo(Emp obj)
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test321","root","root");		
		String sql="Select empno as nor from emp where empno=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1, obj.getEmpno());
		
		ResultSet rs=stmt.executeQuery();
		boolean rf=false;
		Emp e;
		
		int noe=0;
		while(rs.next())
		{
			noe=rs.getInt("noe");
		}
		con.close();
		if(noe>0)
			return true;
		else
			return false;		
		
	}
	catch(Exception e)
	{
		//e.printStackTrace();
		return false;
	}
	//return false;
	}

}

