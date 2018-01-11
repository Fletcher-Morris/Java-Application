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

    public List<Room> GetRooms() {
        return m_rooms;
    }

    public void SetRooms(ArrayList m_users) {
        this.m_rooms = m_users;
    }
    
    public void CreateRoom(String roomCode, RoomType roomType){
        
        Room newRoom = new Room(roomCode, roomType) {};
        m_rooms.add(newRoom.ToRoom());
    }
    
    public Room FindRoom(String roomCode){
        
        for(int i = 0; i < m_rooms.size(); i++){
            if(m_rooms.get(i).GetCode() == roomCode){
                return m_rooms.get(i);
            }
        }        
        return null;
    }
    
    public void RemoveRoom(String roomCode){
        
        for(int i = 0; i < m_rooms.size(); i++){
            if(m_rooms.get(i).GetCode() == roomCode){
                m_rooms.remove(i);
            }
        }
    }
}
