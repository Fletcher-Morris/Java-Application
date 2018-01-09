/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import RoomTypes.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author odmoa
 */
public class RoomList {

    public RoomList() {
        m_rooms = new ArrayList<Room>();
    }
    
    
    private List<Room> m_rooms;

    public List<Room> GetUsers() {
        return m_rooms;
    }

    public void SetRooms(ArrayList m_users) {
        this.m_rooms = m_users;
    }
    
    public void CreateRoom(Room room){
        
        m_rooms.add(room);
    }
}
