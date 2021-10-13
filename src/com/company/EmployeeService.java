package com.company;

public class EmployeeService {
    private Employee[] allEmployee;

    EmployeeService(int size) {
        allEmployee = new Employee[size];
    }

    public void printEmployee() {
        for (int i = 0; i < allEmployee.length; i++) {
            System.out.println("Employee № " + i);
            System.out.println("ID = " + allEmployee[i].getId());
            System.out.println("age = " + allEmployee[i].getAge());
            System.out.println("name = " + allEmployee[i].getName());
            System.out.println("salary = " + allEmployee[i].getSalary());
            System.out.println("gender = " + allEmployee[i].getGender());
            System.out.println("number of fixed bugs = " + allEmployee[i].getFixedBugs());
            System.out.println(" bug rate = " + allEmployee[i].getDefaultBugRate());
            System.out.println();
        }
    }

    public double calculateAllSalarys() {
        double finalSalary = 0;
        for (int i = 0; i < allEmployee.length; i++) {
            finalSalary += allEmployee[i].getSalary() + allEmployee[i].countBonus();
        }
        return finalSalary;
    }

    public Employee getById(int id) {
        for (int i = 0; i < allEmployee.length; i++) {
            if (allEmployee[i].getId() == id){
                return allEmployee[i];
            }
        }
        return allEmployee[0];
    }
    public Employee getByName(String name){
        for (int i = 0; i < allEmployee.length; i++) {
            if (allEmployee[i].getName() == name){
                return allEmployee[i];
            }
        }
        return allEmployee[0];
    }

    public Employee remove(int id){
        for (int i = 0; i < allEmployee.length; i++) {
            if (allEmployee[i].getId() == id) {
                allEmployee[i] = null;
            }
        }
        return allEmployee[0];
    }

    public Employee[] sortByName(){
       String reservVal;
        for (int i = 0; i < allEmployee.length-1; i++) {
            if(allEmployee[i].getName().compareTo(allEmployee[i+1].getName()) < 0) {
                reservVal = allEmployee[i].getName();
                allEmployee[i].setName(allEmployee[i+1].getName());
                allEmployee[i+1].setName(reservVal);
                i = -1;
            }
        }
        return allEmployee;
    }

    public Employee[] sortByNameAndSalary(){
        String reservVal;
        for (int i = 0; i < allEmployee.length-1; i++) {
            if(allEmployee[i].getName().compareTo(allEmployee[i+1].getName()) < 0) {
                reservVal = allEmployee[i].getName();
                allEmployee[i].setName(allEmployee[i+1].getName());
                allEmployee[i+1].setName(reservVal);
                i = -1;
            } else if(allEmployee[i].getName().compareTo(allEmployee[i+1].getName()) == 0){
                if(allEmployee[i].getSalary()> allEmployee[i+1].getSalary()) {
                    reservVal = allEmployee[i].getName();
                    allEmployee[i].setName(allEmployee[i+1].getName());
                    allEmployee[i+1].setName(reservVal);
                    i = -1;
                }
            }
        }
        return allEmployee;
    }

    public Employee edit(int id){
        Employee oldEmployee = allEmployee[0];
        for (int i = 0; i < allEmployee.length; i++) {
            if (allEmployee[i].getId() == id) {
                oldEmployee = allEmployee[i];
                allEmployee[i] = new Employee();
            }
        }
        return oldEmployee;
    }

    public Employee[] getEmployeeArray(){
        return allEmployee;
    }

    public void setEmployeeArray(Employee[] newArray){
        this.allEmployee = newArray;
    }

}
