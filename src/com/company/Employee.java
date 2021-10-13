package com.company;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String gender;
    private int fixedBugs;
    private double defaultBugRate;

    Employee(){
        defaultBugRate = 400.5;
    }

    Employee(int id, String name, int age, double salary, String gender, int fixedBugs){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        defaultBugRate = 400.5;
    }

    public double countBonus(){
        return fixedBugs*defaultBugRate;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public String getGender(){
        return gender;
    }

    public int getFixedBugs(){
        return fixedBugs;
    }

    public double getDefaultBugRate(){
        return defaultBugRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setFixedBugs(int fixedBugs){
        this.fixedBugs = fixedBugs;
    }
}
