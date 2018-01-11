package UserTypes;

import RoomTypes.Room;
import RoomTypes.RoomType;
import Util.EmergencyMode;
import Util.Log;

public class ContractCleaner extends User {
    
    public ContractCleaner(){
        this.SetUserType(UserType.ContractCleaner);
    }

    public ContractCleaner(String name) {
        super(name);
        this.SetUserType(UserType.ContractCleaner);
    }
    
    @Override
    public boolean AttemptAccess(Room room) {
        boolean pass = false;
        if(room.GetEmergencyMode() == EmergencyMode.Normal){
            //08:30 - 22:00
            if(room.GetRoomType() != RoomType.SecureRoom){
                //05:30 - 10:30
                //17:30 - 22:30
                pass = true;
            }
        }
        
        Log.GetInstance().LogAccessAttempt(this, room, pass);
        return pass;
    }
}