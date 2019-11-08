package sample;

public class EmployeeType {
    String TypeID;
    String Description;

    public EmployeeType(String typeID, String description) {
        TypeID = typeID;
        Description = description;
    }

    public String getTypeID() {
        return TypeID;
    }

    public String getDescription() {
        return Description;
    }

    public void setTypeID(String typeID) {
        TypeID = typeID;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "EmployeeType{" +
                "TypeID='" + TypeID + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
