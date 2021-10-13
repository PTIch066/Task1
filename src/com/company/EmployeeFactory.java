package com.company;

import java.util.Random;

public class EmployeeFactory {
    private Employee[] allEmployee;

    EmployeeFactory(Employee[] array) {
        allEmployee = new Employee[array.length];
    }

    public Employee[] generateEmployees() {
        for (int i = 0; i < allEmployee.length; i++) {
            Random random = new Random();
            allEmployee[i] = new Employee();
            allEmployee[i].setAge(20+random.nextInt(80));
            allEmployee[i].setId(i+1);
            if(random.nextInt()%2 == 0){
                allEmployee[i].setGender("male");
            } else {
                allEmployee[i].setGender("female");
            }
            allEmployee[i].setSalary(50000+random.nextInt(40000));
            int randValue = random.nextInt(15);
            switch(randValue){
                case(0): allEmployee[i].setName("Коля"); break;
                case(1): allEmployee[i].setName("Петя"); break;
                case(2): allEmployee[i].setName("Маша"); break;
                case(3): allEmployee[i].setName("Даша"); break;
                case(4): allEmployee[i].setName("Леша"); break;
                case(5): allEmployee[i].setName("Дима"); break;
                case(6): allEmployee[i].setName("Толя"); break;
                case(7): allEmployee[i].setName("Лена"); break;
                case(8): allEmployee[i].setName("Зина"); break;
                case(9): allEmployee[i].setName("Деня"); break;
                case(10): allEmployee[i].setName("Макс"); break;
                case(11): allEmployee[i].setName("Таня"); break;
                case(12): allEmployee[i].setName("Лиза"); break;
                case(13): allEmployee[i].setName("Паша"); break;
                case(14): allEmployee[i].setName("Витя"); break;
            }
            allEmployee[i].setFixedBugs(10+random.nextInt(80));
        }
        return allEmployee;
    }
}
