package UserTypes;

import UserTypes.*;

public class Staff extends User {

    public Staff() {
        this.SetUserType(UserType.Staff);
    }

    public Staff(String name) {
        super(name);
        this.SetUserType(UserType.Staff);
    }
}