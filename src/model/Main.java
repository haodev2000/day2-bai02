package model;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();
        HRManager hr = new HRManager();

        e.work();
        e.getSalary();

        hr.work();
        hr.getSalary();
        hr.addEmloyee();


    }
}
