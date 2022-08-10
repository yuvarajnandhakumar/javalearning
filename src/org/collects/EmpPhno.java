package org.collects;

public class EmpPhno {
	private int phno;
	private String mailid;
	
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	
	
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	public static void main(String[] args) {
		
		EmpPhno k = new EmpPhno();
		k.setPhno(9445454);
		System.out.println(k.getPhno());
	}
	
	
}
