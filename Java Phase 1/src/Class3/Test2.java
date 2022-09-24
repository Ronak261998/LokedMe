package Class3;

public class Test2 {
	
	private int eid;
	private String ename;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		if (eid != 0) {
			this.eid = eid;
		} else {
			System.out.println("eid is not valid");
		}
		
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public static void main(String[]args) {
		
		
		
	}
	

}
