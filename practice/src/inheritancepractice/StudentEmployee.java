package inheritancepractice;

public class StudentEmployee extends Student {
    private double rateOfPayPerHor;
    private String employeeId;

    public StudentEmployee(String firstName, String lastname, String studentId,  double rateOfPayPerHor, String employeeId){
        super(firstName, lastname, studentId);
        this.rateOfPayPerHor = rateOfPayPerHor;
        this.employeeId = employeeId;
    }

    public double getRateOfPayPerHor() {
        return rateOfPayPerHor;
    }

    public void setRateOfPayPerHor(double rateOfPayPerHor) {
        this.rateOfPayPerHor = rateOfPayPerHor;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return super.toString() +  "StudentEmployee{" +
                "rateOfPayPerHor=" + rateOfPayPerHor +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
