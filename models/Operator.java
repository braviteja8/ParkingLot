package ParkingLot1.models;

public class Operator {
    private int empId;
    private String name;

    public Operator(int empId,String name) {
        this.empId = empId;
        this.name=name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
