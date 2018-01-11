package Util;

import java.util.ArrayList;
import java.util.List;
import UserTypes.*;
import RoomTypes.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odmoa
 */
public class Log{
    
    private List<String> m_loggedEvents;
    private String m_logString;
    
    private String m_filePath;
    
    public void LogEvent(String eventText){
        m_loggedEvents.add(eventText);
        m_logString += "\n" + eventText;
    }
    
    public void LogAccessAttempt(User user, Room room, boolean success){
            if(success){
                LogEvent("User " + user.GetId() + " (" + user.GetName() + ", " + user.GetUserType()
                + ") was GRANTED access to " + room.GetCode() + " (" + room.GetRoomType() + ", " + room.GetEmergencyMode()
                + ").");
            }
            else{
                LogEvent("User " + user.GetId() + " (" + user.GetName() + ", " + user.GetUserType()
                + ") was DENIED access to " + room.GetCode() + " (" + room.GetRoomType() + ", " + room.GetEmergencyMode()
                + ").");
            }
    }
    
    public void Save(String path) throws IOException{
        FileWriter write = new FileWriter(path, true);
        PrintWriter print = new PrintWriter(write);
        print.print(m_logString);
        print.close();
    }
    public void Save() throws IOException{
        Save(m_filePath);
    }
}