package UserTypes;

import RoomTypes.Room;
import UserTypes.*;
import Util.EmergencyMode;
import Util.Log;

public class Security extends User {

    public Security() {
        this.SetUserType(UserType.Security);
    }

    public Security(String name) {
        super(name);
        this.SetUserType(UserType.Security);
    }
    
    @Override
    public boolean AttemptAccess(Room room) {      
        Log.GetInstance().LogAccessAttempt(this, room, true);
        return true;
    }
}