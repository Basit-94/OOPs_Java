class Employee {
    private int id;
    private String name;
    private double baseSalary;
    
    public Employee(int id,String name,double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculatePay() {
        return baseSalary;
    }
    String getDetails() { 
        return "ID : "+id+" Name : "+name+" Base Salary : "+baseSalary;
    }
}

class Manager extends Employee {
    double travelAllowance;
    public Manager(int id,String name,double baseSalary,double travelAllowance) {
        super(id, name, baseSalary);
        this.travelAllowance = travelAllowance;
    }

    @Override 
    double calculatePay() {
        return super.calculatePay() + travelAllowance;
    }

    @Override 
    String getDetails() { 
        return super.getDetails() + " Travel Allowance : "+travelAllowance;
    }
}

class Developer extends Employee {
    int overtimeHours;
    double hourlyRate;
    public Developer(int id,String name,double baseSalary,int overtimeHours,double hourlyRate) {
        super(id, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.overtimeHours = overtimeHours;
    }

    @Override 
    double calculatePay() {
        return super.calculatePay() + (overtimeHours*hourlyRate);
    }

    @Override 
    String getDetails() { 
        return super.getDetails() + " OverTime Total Pay : "+(overtimeHours*hourlyRate);
    }
}

public class EmployeeDemo {
    public static void main(String args[]) {
        Employee employees[] = {
            new Manager(101, "Alice", 65000, 10000),
            new Developer(102, "Bob", 55900, 20, 700)
        };

        for(Employee emp : employees) {
            System.out.println(emp.getDetails());
            System.out.println("Total Pay: " + emp.calculatePay());
            System.out.println("-------------------------");
        }
    }
}
