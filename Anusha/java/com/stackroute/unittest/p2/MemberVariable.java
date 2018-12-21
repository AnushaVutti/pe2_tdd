package com.stackroute.unittest.p2;
    class Member {
    protected String name;
    protected int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class MemberVariable {
    public String addMember (String name, int age, double salary) {
        Member m = new Member();
        m.setName(name);
        m.setAge(age);
        m.setSalary(salary);
        String data = "Name: " + m.getName() + " Age: " + m.getAge() + " Salary: " + m.getSalary();
        return data;
    }
}
