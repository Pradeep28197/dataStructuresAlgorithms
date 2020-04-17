package exceptions;

class EmpSalaryException extends Exception{
	public EmpSalaryException(String e) {
		super(e);
	}
}

public class EmployeeService {
		
		
		public void checkEmployeeSalary(Employee emp) throws EmpSalaryException{
		     if(emp.getEmpSalary()<1000) {
		    	 throw new EmpSalaryException(emp.getEmpName()+" is earning less than 1000");//Write the code here 
		}
		}
	    public static void main(String[] args) {
			Employee e1 = new Employee("Joe Smith",20,5345);
			Employee e2 = new Employee("Lewis Jane",21,1345);
			Employee e3 = new Employee("Larry Page",22,1245);
			Employee e4 = new Employee("Smith James",23,6945);
			Employee e5 = new Employee("Elvis George",25,1425);
			EmployeeService empser=new EmployeeService();
			Employee[] emparray={e1,e2,e3,e4,e5};
			try {
				for (Employee employee : emparray) {
					empser.checkEmployeeSalary(employee);//call check employee with appropriate exception handling code
				}
			}
			catch(EmpSalaryException e) {
				System.out.println(e.getMessage());
			}
		}

}
