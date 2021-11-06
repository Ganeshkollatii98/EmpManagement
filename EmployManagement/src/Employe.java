
public class Employe {
    static int id=0;
    int eid;
    String ename;
    int age;
    String edepartment;
    String edesignation;
    String ereporting_to;
	public Employe(String name,int age,String department,String designation,String reporting_to) {
		id=id+1;
		this.eid=id;
		this.ename=name;
		this.age=age;
		this.edepartment=department;
		this.edesignation=designation;
		this.ereporting_to=reporting_to;
	}
	public String ReportingTo() {		
		return  this.ereporting_to;
	}
	public String EmpName() {
		 return this.ename;
	}
}
