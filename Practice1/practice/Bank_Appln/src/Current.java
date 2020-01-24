
public class Current extends Account_operations {

	public int w_limit=30000;
	public int t_limit=50000;
	public int d_limit=40000;
	
	public Current() {
	super();
	}
	public  Current(int ac_no ,String ac_Name, int amount)
	
	{
	
	this.w_limit=w_limit;
	this.t_limit=t_limit;
	this.d_limit=d_limit;
	
	this.ac_no=ac_no;
	this.ac_Name=ac_Name;
	this.amount=amount;
	
	
	
	
	}
	@Override
	public String toString() {
		return "Current [w_limit=" + w_limit + ", t_limit=" + t_limit + ", d_limit=" + d_limit + "]";
	}
	
	
}
