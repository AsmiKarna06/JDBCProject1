public class Employee 
{
	private int eno;
	private String ename;
	private String dept;
	private float sal;
	Employee(int eno,String ename)
	{
		this.eno=eno;
		this.ename=ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dept=" + dept + ", sal=" + sal + ", toString()="
				+ super.toString() + "]";
	}
}
