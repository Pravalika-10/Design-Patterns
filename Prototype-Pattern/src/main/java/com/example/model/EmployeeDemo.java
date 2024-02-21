package com.example.model;

public class EmployeeDemo
{
        public static void main(String[] args)
        {
                Employee employee = new Employee(1, "A", "Backend", 500000, "Bnglr");
                employee.showEmployee();
                Employee emp = (Employee) employee.getClone();
                emp.showEmployee();
        }
}
