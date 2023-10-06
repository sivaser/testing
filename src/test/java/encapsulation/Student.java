package encapsulation;

public class Student {
	private String name;
	private String Rollno;
	private String rank;
	private String schoolname;
	private String classname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return Rollno;
	}
	public void setRollno(String rollno) {
		Rollno = rollno;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	
//	public void setname(String str) {
//		this.name=str;
//	}
//	
//	public String getname() {
//		return this.name;
//	}
	
}
