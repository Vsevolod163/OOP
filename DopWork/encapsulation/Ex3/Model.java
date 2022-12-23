package DopWork.encapsulation.Ex3;

import java.util.ArrayList;

public class Model {
    private String url;
    private String port;
    private String username;
    private String password;
    private ArrayList<String> array = new ArrayList<String>();

    public Model(String url, String port, String username, String password) {
        this.url = url;
        this.port = port;
        this.username = username;
        this.password = password;
        this.array = array;

    }


    public ArrayList<String> createTable() {
        return this.array;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    @Override
    public String toString() {
        return String.format("username: %s; password: %s", username, password);
    }
}
