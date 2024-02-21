package com.example.model;

public class Employee implements Prototype
{
        private int id;
        private String name, designation;
        private double salary;
        private String address;

        public Employee(int id, String name, String designation, double salary, String address) {
                this.id = id;
                this.name=name;
                this.address = address;
                this.designation = designation;
                this.salary = salary;
        }

        public void showEmployee() {
                System.out.println( "Employee[ " +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", designation='" + designation + '\'' +
                        ", salary=" + salary +
                        ", address='" + address + '\'' +
                        " ]");
        }

        @Override
        public Prototype getClone(){
                return new Employee(id, name,designation, salary,address);
        }
}
