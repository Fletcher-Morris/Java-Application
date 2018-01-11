package UserTypes;

import RoomTypes.Room;
import RoomTypes.RoomType;
import UserTypes.*;
import Util.EmergencyMode;
import Util.Log;

public class Student extends User {

    public Student() {
        this.SetUserType(UserType.Student);
    }

    public Student(String name) {
        super(name);
        this.SetUserType(UserType.Student);
    }

    @Override
    public boolean AttemptAccess(Room room) {
        boolean pass = false;
        if(room.GetEmergencyMode() == EmergencyMode.Normal){
            //08:30 - 22:00
            if(room.GetRoomType() == RoomType.LectureHall){
                pass = true;
            }
            else if(room.GetRoomType() == RoomType.StudentLab){
                pass = true;
            }
        }
        
        Log.GetInstance().LogAccessAttempt(this, room, pass);
        return pass;
    }
}