/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesystem;


public abstract class Employee {

    public Employee(String firstName, String lastName, String nationalId) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
        setNationalId(nationalId);
    }
public abstract double getSalary();
    public Employee(String firstName, String lastName, String nationalId, double baseSalary) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
       setNationalId(nationalId);
        this.baseSalary = baseSalary;
    }

    private String firstName;
    private String lastName;
    private String nationalId;
    private double baseSalary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) throws Exception {
        if (nationalId.length()!=14) {
            throw new Exception("Invalid National Id");
        }
        this.nationalId = nationalId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDetails() {
        return "First Name is : " + firstName + "\n"
                + "Last Name is: " + lastName + "\n"
                + "National Id is: " + nationalId + "\n"
                + "Base Salary is: " + baseSalary + "\n"
                + "Salary is: " + getSalary() + "\n";
    }
}
