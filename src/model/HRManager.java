package model;

public class HRManager extends Employee{

    public void addEmloyee(){
        System.out.println("Adding new employee!");
    }

    @Override
    public void work(){
        System.out.println("Managing employees ");
    }

    @Override
    public void getSalary(){
        System.out.println("Manager Salary : 70000 ");
    }
}
