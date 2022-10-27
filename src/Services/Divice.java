package Services;

import java.sql.SQLException;

public class Divice extends DiviceServices{
    int diviceCode;
    String diviceName;
    String description;
    String location;

    public Divice(int diviceCode) throws SQLException {
        super(diviceCode);
        this.diviceCode = diviceCode;
        this.diviceName = super.getDiviceName();
        this.description = super.getDiviceDescription();
        this.location = super.getDiviceLocation();
    }
    public Divice(){}

    public Divice(int diviceCode, String diviceName, String description, String location) {
        this.diviceCode = diviceCode;
        this.diviceName = diviceName;
        this.description = description;
        this.location = location;
    }

    public int getDiviceCode() {
        return diviceCode;
    }

    public void setDiviceCode(int diviceCode) {
        this.diviceCode = diviceCode;
    }

    public String getName() {
        return diviceName;
    }

    public void setDiviceName(String diviceName) {
        this.diviceName = diviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
