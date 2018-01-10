package UserTypes;

import UserTypes.*;

public class Security extends User {

    public Security() {
        this.SetUserType(UserType.Security);
    }

    public Security(String name) {
        super(name);
        this.SetUserType(UserType.Security);
    }
}