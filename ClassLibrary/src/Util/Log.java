package Util;

import java.util.ArrayList;
import java.util.List;
import UserTypes.*;
import RoomTypes.*;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;



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
    
    private static class LogSingletonContainer{
        
        private static final Log LOGSINGLEINSTANCE = new Log();
    }
    public static Log GetInstance(){
        
        return LogSingletonContainer.LOGSINGLEINSTANCE;
    }
    
    private List<String> m_loggedEvents;
    private String m_logString;
    
    private String m_filePath;

    public Log() {
        m_loggedEvents = new ArrayList<String>();
        m_logString = "UNIVERSITY ACCESS SYSTEM\n";
        m_filePath = "log.txt";
    }
    
    public void LogEvent(String eventText){
//        m_loggedEvents.add(eventText);
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
    
    public void LogEmergencyMode() throws IOException{
        LogEvent("CAMPUS ENTERED EMERGENCY MODE.");
        
        Save("log.txt");
    }
    
    public void Save(String path) throws IOException{        
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path), "utf-8"))) {
                writer.write(m_logString);
}
    }
    public void Save() throws IOException{
        Save(m_filePath);
    }
}