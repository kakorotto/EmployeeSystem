/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesystem;


public class Staff extends Employee {

    private String jobTitle;

    public Staff(String jobTitle, String firstName, String lastName, String nationalId) throws Exception {
        super(firstName, lastName, nationalId);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\n"
                + "Job Title Rank is: " + jobTitle + "\n";

    }

    @Override
    public double getSalary() {
        return getBaseSalary() + 200;
    }
}
