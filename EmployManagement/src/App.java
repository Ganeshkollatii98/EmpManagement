import java.util.*;

public class App {
	//initlizing data
    public static List<Employe> initlization(){
    	List<Employe> EmployeList=new ArrayList<Employe>();
    	EmployeList.add(new Employe("simran",45,"Management","CEO",""));
    	EmployeList.add(new Employe("Mukund",42,"HR","HR Manager","Sriram"));
    	EmployeList.add(new Employe("Sebastian",38,"Finance","Finance Manager","Sriram"));
    	EmployeList.add(new Employe("Aashritha",32,"Product Manager","Dev Manager","Sriram"));
    	EmployeList.add(new Employe("Mohan Rafi",35,"HR","HR Lead","Mukund"));
    	EmployeList.add(new Employe("Anjali Kumar",29,"HR","HR Associate","Mohan Rafi"));
    	EmployeList.add(new Employe("Joseph", 40, "Finance","Finance Associate" , "Sebastian"));
    	EmployeList.add(new Employe("RamaChandran",27,"Product Devlopment","Tech Lead","Aashritha"));
    	EmployeList.add(new Employe("AbhinayaShankaz",32,"Product Devlopment","System Devloper","RamaChandran"));
    	EmployeList.add(new Employe("ImaranKhan",28,"Product Testing","QA Lead","RamaChandran"));
    	return EmployeList;
    }
//    Department summary
    public static void departmentSummary(){
    	List<Employe> EmployeList=new ArrayList<Employe>();
    	EmployeList=initlization();
    	Map<String,Integer> emp_department=new HashMap<String,Integer>();
    	//Putting Department Data into map
        for(Employe e:EmployeList) {
        	
              emp_department.put(e.edepartment,0);
        }
        for(Employe e:EmployeList)
        {
        	if(emp_department.containsKey(e.edepartment)) {
        		emp_department.put(e.edepartment, emp_department.get(e.edepartment)+1);
        
        	}
        }
    	System.out.println("Departments"+"     "+"Employe Count");
    	emp_department.forEach((key,value) -> System.out.println(key+"     "+value));
    }
//	Designation summary 
    public static void designationSummary()
    {
    	List<Employe> EmployeList=new ArrayList<Employe>();
    	EmployeList=initlization();
    	Map<String,Integer> designation=new HashMap<String,Integer>();
    	
    	for(Employe e:EmployeList) {
    		designation.put(e.edesignation, 0);
    	}
    	//designation.forEach((key,value) -> System.out.println(key+"   "+value));
    	for(Employe e:EmployeList) {
    		if(designation.containsKey(e.edesignation)) {
    			designation.put(e.edesignation, designation.get(e.edesignation)+1);
    		}
    	}
    	System.out.println("Designation"+"     "+"Employe Count");
        designation.forEach((key,value) -> System.out.println(key+"     "+value));
    }
//Manager Summary
     public static void managerSummary() {
    	 List<Employe> EmployeList=new ArrayList<Employe>();
    	 EmployeList=initlization();
    	 Map<String,Integer> managerLisst=new HashMap<String,Integer>();
    	 for(Employe  e:EmployeList) {
    		  if(e.edesignation.contains("Manager")) {
//    			  System.out.println(e.edesignation);
    			  managerLisst.put(e.edesignation, 0);
    		  }
    	 }
//    	 managerLisst.forEach((a,b)->System.out.println(a+"     "+b));
    	 for(Employe e:EmployeList) {
    		if(managerLisst.containsKey(e.edesignation))
    		{
    			managerLisst.put(e.edesignation, managerLisst.get(e.edesignation)+1);
    		}
    	 }
    	 managerLisst.forEach((a,b)->System.out.println(a+"      "+b));
    	
     }
    
//    Employee Search
    public static Employe SearchName(String uname) {
    	List<Employe> empList=new ArrayList<Employe>();
        empList=initlization();
        
    	for(Employe e:empList) {
//    		System.out.println(e.EmpName().toLowerCase()+uname.toLowerCase());
    		String empname=e.ename.toUpperCase();
    		String uname1=uname.toUpperCase();
    		if(empname.equals(uname1))
    		{
    			
    			return e;
    		}
    	}
		return empList.get(0);
    	
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<Employe> empList=new ArrayList<Employe>();
		empList=initlization();
		
		System.out.println("Employes Added By me ->"+empList.size());
		String userInput=scan.next();
		System.out.print(userInput +"-> ");
		while(userInput!="")
		{
			Employe E=SearchName(userInput);
			System.out.print(E.ereporting_to);
			System.out.print(" -> ");
		    userInput=E.ereporting_to;
		}
		
		//System.out.println(departments());
		System.out.println("");
		
		
		System.out.println(empList.size());
		departmentSummary();
		managerSummary();
		designationSummary();
	}
}
