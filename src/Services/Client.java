package Services;

import java.sql.SQLException;

public class Client extends ClientServices{

    private String clientUsername;
    private String name;
    private String surname;
    private String email;


    public Client(String clientUsername) throws SQLException {
        this.clientUsername = clientUsername;
        this.name = super.getName(clientUsername);
        this.surname = super.getSurname(clientUsername);
        this.email = super.getEmail(clientUsername);
    }

    public Client(){}

    public String getClientUsername() {
        return clientUsername;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
