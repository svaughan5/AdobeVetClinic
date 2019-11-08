package sample;

public class Employee {
    int EmpID;
    String FirstName;
    String LastName;
    String SSN;
    String EmpType;
    String DOE;

    public Employee(int EmpID, String FirstName, String LastName, String SSN, String EmpType, String DOE){
        this.EmpID = EmpID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.SSN = SSN;
        this.EmpType = EmpType;
        this.DOE = DOE;
    }

    public int getEmpID() {
        return EmpID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getSSN() {
        return SSN;
    }

    public String getEmpType() {
        return EmpType;
    }

    public String getDOE() {
        return DOE;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setEmpType(String empType) {
        EmpType = empType;
    }

    public void setDOE(String DOE) {
        this.DOE = DOE;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpID=" + EmpID +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", SSN='" + SSN + '\'' +
                ", EmpType='" + EmpType + '\'' +
                ", DOE='" + DOE + '\'' +
                '}';
    }
}

