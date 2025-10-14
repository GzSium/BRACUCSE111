//Task6
public class Manager extends Employee{
    public int bonus;
    public double finalSalary;
    public Manager(String n, double s, int h,int b) {
        super(n,s,h);
        bonus = b;
    }
    public void calculateSalary() {
        double salary = getBaseSalary();
        if (getHoursWorked() > 40) {
            finalSalary= salary + salary*(bonus/100);
        } else {
            finalSalary = salary;
        }
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: $" + bonus"%");
        System.out.println("Final Salary: $" + finalSalary);
    }
    public void requestIncrement(int i) {
        if(getHoursWorked() >100){
            double salary = getBaseSalary();
            setBaseSalary(salary + i);
            System.out.println(i+"increment approved");
        }
        else if(getHoursWorked() > 80){
            double salary = getBaseSalary();
            i = i/2;
            setBaseSalary(salary + i);
        }
        else{
            System.out.println("Increment denied");
        }
    }
    public void setHoursWorked(int h) {
        super.setHoursWorked(h);
    }
}



public class Developer extends Employee {
    public String language;
    public double Finalsalary;
    public Developer(String n, double s, int h, String l) {
        super(n,s,h);
        language = l;
    }
    public void calculateSalary() {
        double salary = getBaseSalary();
        if(language.equals("Java")) {
            Finalsalary = salary + 700;
        } else {
            Finalsalary = salary;
        }
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + language);
        System.out.println("Final Salary: $" + Finalsalary);
    }
}

