package UserTypes;

import RoomTypes.Room;
import RoomTypes.RoomType;
import UserTypes.*;
import Util.EmergencyMode;
import Util.Log;

public class Staff extends User {

    public Staff() {
        this.SetUserType(UserType.Staff);
    }

    public Staff(String name) {
        super(name);
        this.SetUserType(UserType.Staff);
    }

    @Override
    public boolean AttemptAccess(Room room) {
        
        boolean pass = false;
        if(room.GetEmergencyMode() == EmergencyMode.Normal){
            //05:30 - 23:59:59
            if(room.GetRoomType() == RoomType.LectureHall){
                pass = true;
            }
            else if(room.GetRoomType() == RoomType.StudentLab){
                pass = true;
            }
            else if(room.GetRoomType() == RoomType.StaffRoom){
                pass = true;
            }
        }
        
        Log.GetInstance().LogAccessAttempt(this, room, pass);
        return pass;
    }
}