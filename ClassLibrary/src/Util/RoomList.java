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
    
    public void CreateRoom(Room newRoom){
        m_rooms.add(newRoom.ToRoom());
        Log.GetInstance().LogEvent("Created room " + newRoom.GetCode() + " (" + newRoom + ")");
    }
    
    public void CreateRoom(String roomCode, RoomType roomType){
        
        Room newRoom = new Room(roomCode, roomType) {};
        newRoom = newRoom.ToRoom();
        CreateRoom(newRoom);
    }
    
    public Room FindRoom(String roomCode){
        
        for(int i = 0; i < m_rooms.size(); i++){
            if(m_rooms.get(i).GetCode().equals(roomCode)){
                return m_rooms.get(i);
            }
        }        
        return null;
    }
    
    public boolean RoomExists(String roomCode){
        return FindRoom(roomCode) != null;
    }
    
    public void SetRoom(String roomCode, Room room){
        for(int i = 0; i < m_rooms.size(); i++){
            if(m_rooms.get(i).GetCode().equals(roomCode)){              
                m_rooms.set(i, room.ToRoom());
            }
        }
    }
    
    public void RemoveRoom(String roomCode){
        
        for(int i = 0; i < m_rooms.size(); i++){
            if(m_rooms.get(i).GetCode() == roomCode){
                Log.GetInstance().LogEvent("Removed room " + m_rooms.get(i).GetCode() + " (" + m_rooms.get(i) + ")");
                m_rooms.remove(i);
            }
        }
    }
}
