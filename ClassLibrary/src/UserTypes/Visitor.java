package UserTypes;

import UserTypes.*;

public class Visitor extends User {

    public Visitor() {
        this.SetUserType(UserType.Visitor);
    }

    public Visitor(String name) {
        super(name);
        this.SetUserType(UserType.Visitor);
    }
}