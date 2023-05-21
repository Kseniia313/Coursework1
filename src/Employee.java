public class Employee {
    private int id;
    private String employer;
    private int department;
    private int salary;
    private static int idCounter;

    public Employee( String employer, int department, int salary) {
        this.id = idCounter;
        idCounter++;
        this.employer = employer;
        this.department = department;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getEmployer() {
        return employer;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCounter() {
        return idCounter;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id " + id + " работник " + employer + " департамент " + department + " зарплата " + salary;
    }



    }













