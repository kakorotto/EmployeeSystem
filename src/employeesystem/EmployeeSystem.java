/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesystem;


public class EmployeeSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
           

            Faculty faculty = new Faculty("Teaching Assitant", 10, "Salem", "Ali", "12345678901234", 600);

            Staff staff = new Staff("موظف رعاية الشباب", "محمد", "أحمد", "12345678901234");
            staff.setBaseSalary(100);

            Employee[] emps = new Employee[]{faculty, staff};
            for (Employee emp : emps) {
                System.out.println(emp.getDetails());
            }
        } catch (Exception ex) {
            System.out.println("An Error Ocurred and the message is: " + ex.getMessage());
        }
    }

}
