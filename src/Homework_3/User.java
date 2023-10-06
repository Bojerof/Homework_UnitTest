package Homework_3;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String password;
    public String getName(){
        return name;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public List<User> userList(){
        List<User> list = new ArrayList<>();
        list.add(new User("Andrey", "1234"));
        list.add(new User("Bob", "4321"));
        list.add(new User("Jon", "qwer"));
        list.add(new User("Ruslan", "rewq"));
        return list;
    }

    }
    public boolean checkUser(){
        for (User item : userList()) {
            if (item.getName() == name && item.getPassword() == password)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Name %s, password %s", name, password);
    }
}