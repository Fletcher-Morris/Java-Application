package RoomTypes;

import Util.EmergencyMode;

public abstract class Room {

	private String m_roomCode;
	private EmergencyMode m_emergencyMode;
        
        public Room(){
            m_roomCode = "New Room";
            m_emergencyMode = EmergencyMode.Normal;
        }

    public String GetCode() {
        return m_roomCode;
    }

    public void SetCode(String code) {
        this.m_roomCode = code;
    }

    public EmergencyMode GetEmergencyMode() {
        return m_emergencyMode;
    }

    public void SetEmergencyMode(EmergencyMode emergencyMode) {
        this.m_emergencyMode = emergencyMode;
    }
}