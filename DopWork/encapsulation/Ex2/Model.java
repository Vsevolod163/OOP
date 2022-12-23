package DopWork.encapsulation.Ex2;

import java.util.Random;

public class Model {
    private String username;
    private String password;
    private int id;

    public Model(String username, String password) {
        this.username = username;
        this.password = password;
        Random random = new Random();
        this.id = random.nextInt(1);
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
