/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesystem;


public class Faculty extends Employee {

    public Faculty(String academicRank, String firstName, String lastName, String nationalId) throws Exception {
        super(firstName, lastName, nationalId);
        this.academicRank = academicRank;
    }

    public Faculty(String academicRank, int officeHours, String firstName, String lastName, String nationalId, double baseSalary) throws Exception {
        super(firstName, lastName, nationalId, baseSalary);
        this.academicRank = academicRank;
        this.officeHours = officeHours;
    }

    private String academicRank;
    private int officeHours;
    private int weeklyHours;

    public String getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\n"
                + "Academic Rank is: " + academicRank + "\n"
                + "Office Hours are: " + officeHours + "\n"
                + "Weekly Hours are: " + weeklyHours + "\n";
    }

    @Override
    public double getSalary() {
        return getBaseSalary() + officeHours * 10 + weeklyHours * 20;
    }
}
// DRY Don't Repeat Yourself
