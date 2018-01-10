package UserTypes;

import UserTypes.*;

public class EmergencyResponder extends User {

    public EmergencyResponder() {
        this.SetUserType(UserType.EmergencyResponder);
    }

    public EmergencyResponder(String name) {
        super(name);
        this.SetUserType(UserType.EmergencyResponder);
    }
}