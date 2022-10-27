package Services;

import Data.SQLite;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

abstract class DiviceServices {
    List<Object> diviceRow;

    public DiviceServices(int diviceCode) throws SQLException {
        String sql = String.format("SELECT * FROM Dispositivos WHERE codigo_dispositivo = '%s'", diviceCode);
        this.diviceRow = new SQLite().getRecords(sql);
    }

    public DiviceServices(){}

    protected String getDiviceName(){
        return (String) diviceRow.get(2);
    }

    protected String getDiviceDescription() {
        return (String) diviceRow.get(3);
    }

    protected String getDiviceLocation() {
        return (String) diviceRow.get(4);
    }

    public String diviceValidation(int diviceCode) throws SQLException {
        String sql = String.format("SELECT * FROM Dispositivos WHERE codigo_dispositivo = %d", diviceCode);

        if(!new SQLite().getRecords(sql).isEmpty())
            return "El codigo ya esta en uso.";

        return null;
    }
}
