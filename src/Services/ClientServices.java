package Services;

import Data.SQLite;

import java.sql.SQLException;

abstract class ClientServices{

    public String clientValidation(String clientUsername) throws SQLException {
        SQLite db = new SQLite();
        String sql = String.format("SELECT * FROM Clientes WHERE nombre_usuario = '%s'", clientUsername);

        if(db.getRecords(sql).isEmpty())
            return "Cliente no existe";

        return null;
    }

    protected String getSurname(String clientUsername) throws SQLException {
        SQLite db = new SQLite();
        String sql = String.format("SELECT * FROM Clientes WHERE nombre_usuario = '%s'", clientUsername);
        return (String)db.getRecords(sql).get(4);
    }

    protected String getEmail(String clientUsername) throws SQLException {
        SQLite db = new SQLite();
        String sql = String.format("SELECT * FROM Clientes WHERE nombre_usuario = '%s'", clientUsername);
        return (String)db.getRecords(sql).get(8);
    }

    protected String getName(String clientUsername) throws SQLException {
        SQLite db = new SQLite();
        String sql = String.format("SELECT * FROM Clientes WHERE nombre_usuario = '%s'", clientUsername);
        return (String)db.getRecords(sql).get(3);
    }
}



