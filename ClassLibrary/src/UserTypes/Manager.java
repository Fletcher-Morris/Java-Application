package UserTypes;

import RoomTypes.Room;
import RoomTypes.RoomType;
import UserTypes.*;
import Util.EmergencyMode;
import Util.Log;

public class Manager extends User {

    public Manager() {
        this.SetUserType(UserType.Manager);
    }

    public Manager(String name) {
        super(name);
        this.SetUserType(UserType.Manager);
    }
    
    @Override
    public boolean AttemptAccess(Room room) {
        boolean pass = false;
        if(room.GetEmergencyMode() == EmergencyMode.Normal){
            pass = true;
        }
        
        Log.GetInstance().LogAccessAttempt(this, room, pass);
        return pass;
    }
}