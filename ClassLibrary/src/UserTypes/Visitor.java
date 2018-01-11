package UserTypes;

import RoomTypes.Room;
import RoomTypes.RoomType;
import UserTypes.*;
import Util.EmergencyMode;
import Util.Log;
import java.security.Timestamp;

public class Visitor extends User {

    public Visitor() {
        super();
        this.SetUserType(UserType.Visitor);
    }

    public Visitor(String name) {
        super(name);
        this.SetUserType(UserType.Visitor);
    }

    @Override
    public boolean AttemptAccess(Room room) {
                
        boolean pass = false;
        if(room.GetEmergencyMode() == EmergencyMode.Normal){
            if(room.GetRoomType() == RoomType.LectureHall){
                //08:30 - 22:00
                pass = true;
            }
        }
        
        Log.GetInstance().LogAccessAttempt(this, room, pass);
        return pass;
    }
}