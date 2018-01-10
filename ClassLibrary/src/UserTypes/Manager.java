package UserTypes;

import UserTypes.*;

public class Manager extends User {

    public Manager() {
        this.SetUserType(UserType.Manager);
    }

    public Manager(String name) {
        super(name);
        this.SetUserType(UserType.Manager);
    }
}