package UserTypes;

import RoomTypes.Room;
import UserTypes.*;
import Util.EmergencyMode;
import Util.Log;

public class EmergencyResponder extends User {

    public EmergencyResponder() {
        this.SetUserType(UserType.EmergencyResponder);
    }

    public EmergencyResponder(String name) {
        super(name);
        this.SetUserType(UserType.EmergencyResponder);
    }
    
    @Override
    public boolean AttemptAccess(Room room) {
        boolean pass = false;
        if(room.GetEmergencyMode() == EmergencyMode.Emergency){
            pass = true;
        }
        
        Log.GetInstance().LogAccessAttempt(this, room, pass);
        return pass;
    }
}