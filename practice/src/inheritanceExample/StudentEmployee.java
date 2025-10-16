package inheritanceExample;

public class StudentEmployee extends Student {
    private double rateofPayPerhOur;
    private String employeeId;

    public StudentEmployee(String firstName, String lastName, String studentId, double rateofPayPerhOur, String employeeId){
        super(firstName, lastName, studentId);
        this.rateofPayPerhOur = rateofPayPerhOur;
        this.employeeId = employeeId;
    }

    public double getRateofPayPerhOur(){
        return rateofPayPerhOur;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public void setRateofPayPerhOur(double rateofPayPerhOur){
        this.rateofPayPerhOur = rateofPayPerhOur;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    @Override
    public String toString(){
        return  super.toString() + " Employee ID " + employeeId + " Pay " + rateofPayPerhOur;
    }
}
