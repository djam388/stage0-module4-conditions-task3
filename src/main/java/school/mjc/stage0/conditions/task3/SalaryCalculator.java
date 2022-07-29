package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void main(String[] args) {
        calculateSalary(100);

    }
    public static void calculateSalary(int salary) {

        if (salary >= 0 && salary <= 10000) {
            System.out.println(salary - salary * .15);
        }
        if (salary > 10000 && salary <= 20000) {
            System.out.println(salary - salary * .18);
        }
        if (salary > 20000) {
            System.out.println(salary - salary * .2);
        }
        if (salary < 0) {
            System.out.println("wrong input!");
        }
    }
}
