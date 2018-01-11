package RoomTypes;

import UserTypes.User;
import Util.EmergencyMode;

public abstract class Room {

	private String m_roomCode;
        RoomType m_roomType;
	private EmergencyMode m_emergencyMode;
        
        public Room(){
            m_roomCode = "New Room";
            m_roomType = RoomType.StudentLab;
            m_emergencyMode = EmergencyMode.Normal;
        }
        
        public Room(String roomCode, RoomType roomType){
            m_roomCode = roomCode;
            m_roomType = roomType;
            m_emergencyMode = EmergencyMode.Normal;
        }

    public String GetCode() {
        return m_roomCode;
    }

    public void SetCode(String code) {
        this.m_roomCode = code;
    }

    public RoomType GetRoomType() {
        return m_roomType;
    }

    public void SetRoomType(RoomType roomType) {
        this.m_roomType = roomType;
    }  
    
    public EmergencyMode GetEmergencyMode() {
        return m_emergencyMode;
    }

    public void SetEmergencyMode(EmergencyMode emergencyMode) {
        this.m_emergencyMode = emergencyMode;
    }
    
    public void SetEmergencyMode() {
        this.m_emergencyMode = EmergencyMode.Emergency;
    }
    
    public void SetNormalMode() {
        this.m_emergencyMode = EmergencyMode.Normal;
    }
    
    public static Room ToRoom(Room room){
        
        Room newRoom = room;
        switch(room.GetRoomType()){
                case LectureHall:
                newRoom = new LectureHall();
                break;

                case ResearchLab:
                newRoom = new ResearchLab();
                break;

                case SecureRoom:
                newRoom = new SecureRoom();
                break;

                case StaffRoom:
                newRoom = new StaffRoom();
                break;

                case StudentLab:
                newRoom = new StudentLab();
                break;

                default:
                newRoom = new StudentLab();
                break;
            }
        
        newRoom.SetCode(room.GetCode());
        newRoom.SetRoomType(room.GetRoomType());
        
        return newRoom;
    }

    public Room ToRoom(){
        return ToRoom(this);
    }
}