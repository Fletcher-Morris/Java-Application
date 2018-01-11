/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.IOException;

/**
 *
 * @author odmoa
 */
public class UniAccessSystem {
    
    public UserList userList;
    public RoomList roomList;
    public Log log;

    public UniAccessSystem() {
        userList = new UserList();
        roomList = new RoomList();
        log = new Log();
    }
    
    public void SetCampusMode(EmergencyMode mode) throws IOException{
        for(int i = 0; i < roomList.GetRooms().size(); i++){
            roomList.GetRooms().get(i).SetEmergencyMode(mode);
        }
        
        if(mode == EmergencyMode.Emergency){
            log.LogEmergencyMode();
        }
    }
}
