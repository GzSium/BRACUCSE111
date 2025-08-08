public class Employee {
    public String name;
    public double salary = 30000;
    public String desig = "junior";
    public void newEmployee(String n){
     name = n;
    }
    public void displayInfo(){
System.out.println("Employee Name: "+name);
System.out.println("Employee Salary: "+salary);
System.out.println("Employee Designation: "+desig);
    }
    public double tax;
    public void calculateTax(){
        if(salary <= 30000){
            System.out.println("No need to pay tax");
        }
        if(salary>30000 && salary<50000){
            tax = salary*0.1;
            System.out.println(name+" Tax Amount: "+tax);
        }
        if(salary>50000){
            tax = salary*0.3;
            System.out.println(name+" Tax Amount: "+tax);
        }

    }
    public void promoteEmployee(String pro){
        desig = pro;
if(pro.equals("lead")){
    salary = salary + 50000;
}
if(pro.equals("senior")){
    salary = salary + 25000;
}
if(pro.equals("manager")){
    salary = salary + 75000;
}
System.out.println("New Salary: "+salary);
    }
}
