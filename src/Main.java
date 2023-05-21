import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        employees();
    }

    public static int calculateTotalSalary(Employee[] employees) {
        int salarySum = 0;
        for (Employee e : employees) {
            salarySum += e.getSalary();
        }
        return salarySum;
    }

    public static void printTotalSalary(int salarySum) {
        System.out.println("Сумма затрат на зарплату составляет " + salarySum + " рублей в месяц");
    }

    public static int calculateAvarageSalary(Employee[] employees) {
        int avarageSalary = 0;
        {
            avarageSalary = calculateTotalSalary(employees) / employees.length;
        }

        return avarageSalary;
    }

    public static void printAvarageSalary(int avarageSalary) {
        System.out.println("Средняя сумма затрат на зарплату составляет " + avarageSalary + " рублей в месяц");
    }

    public static void findMinimumSalary(Employee[] employees) {
        int minimumSalary = employees[0].getSalary();
        int idEmployer = 0;
        for (int e = 0; e < employees.length; e++) {
            if (employees[e].getSalary() <= minimumSalary) {
                minimumSalary = employees[e].getSalary();
                idEmployer = employees[e].getId();
            }
        }
        System.out.println(" Минимальная зарплата у работника с индексом " + idEmployer);
    }

    public static void findMaksimumSalary(Employee[] employees) {
        int maksimumSalary = employees[0].getSalary();
        int idEmployer = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maksimumSalary) {
                maksimumSalary = employees[i].getSalary();
                idEmployer = employees[i].getId();
            }
        }
        System.out.println(" Максимальная зарплата у работника с индексом " + idEmployer);
    }

    //    Не могу доработать код, чтобы при вводе неправильного номера отдела программа выдавала ошибку. Пробовала if-else if, do-while, не получается. То есть мне кажется, что должно быть какое-то условие.. Помогите, пожалуйста). Или, можеь быть, логика неправильная. Заранее благодарю за помощь или подсказку.
    public static void findMaximumSalaryInDepartment(Employee[] employees) {
        int maximumSalary = 0;
        int index = 0;
        int department = 4;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department && employees[i].getSalary() > maximumSalary) {
                maximumSalary = employees[i].getSalary();
                index = i;
            }
        }
        System.out.println(" В " + department + " отделе максимальная зарплата у сотрудника с индексом " + employees[index].getId());
    }

    public static void indexSalary(Employee[] employees) {
        double index = 50;
        double newSalary = 0;
        for (int e = 0; e < employees.length; e++) {
            newSalary = employees[e].getSalary() * (1 + index / 100);
            employees[e].setSalary((int) newSalary);
            System.out.println(" Новая зарплата с учетом индексации " + newSalary + " рублей ");
        }
    }

    public static void getFullNameEmployer(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.getEmployer());
        }
    }
    public static void employees() {

        Employee[] employer = new Employee[10];
        employer[0] = new Employee(" Иванов Иван Иванович", 2, 30_000);
        employer[1] = new Employee(" Николаев Евгений Иванович", 5, 55_000);
        employer[2] = new Employee(" Солунская Вероника Павловна", 3, 100_000);
        employer[3] = new Employee(" Рыжова Евгения Ивановна", 3, 45_000);
        employer[4] = new Employee(" Смольков Алексей Иванович", 1, 55_000);
        employer[5] = new Employee(" Лисов Алексей Вадимович", 4, 60_000);
        employer[6] = new Employee(" Крайнова Светлана Сергеевна", 5, 70_000);
        employer[7] = new Employee(" Рязанова Майя Олеговна", 1, 150_000);
        employer[8] = new Employee(" Дунаева Карина Евгеньевна", 2, 90_000);
        employer[9] = new Employee(" Иванова Ксения Игоревна", 4, 95_000);
        for (Employee e : employer) {
            System.out.println(e);
        }
        calculateTotalSalary(employer);
        printTotalSalary(calculateTotalSalary(employer));
        findMinimumSalary(employer);
        findMaksimumSalary(employer);
        calculateAvarageSalary(employer);
        printAvarageSalary(calculateAvarageSalary(employer));
        System.out.println("Список сотрудников: ");
        getFullNameEmployer(employer);


        indexSalary(employer);
        findMaximumSalaryInDepartment(employer);
    }
}














