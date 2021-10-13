package com.company;

public class Test {
    int size = 5;
    EmployeeService service = new EmployeeService(size);
    EmployeeFactory factory = new EmployeeFactory(service.getEmployeeArray());
    Test(int size){
        service.setEmployeeArray(factory.generateEmployees());
    }

    public void makeTests(){
        service.printEmployee();
        System.out.println("lets sort it by name");
        service.sortByName();
        service.printEmployee();
        System.out.println("lets calculate all salarys: " + service.calculateAllSalarys());
        System.out.println();
        System.out.println("Employee #2 = " + service.getById(2).getName());
        System.out.println("Employee Паша = " + service.getByName("Паша").getId());
    }
}
