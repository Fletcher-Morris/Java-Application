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
import java.text.SimpleDateFormat;
import java.util.Date;



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
    
    private String m_logString;
    
    private String m_filePath;

    public Log() {
        m_logString = "";
        m_filePath = "log.txt";
    }

    public String GetLogString() {
        return m_logString;
    } 
    
    public void LogEvent(String eventText){
        String eventString = "[" + GetTimeStamp() + "] " + eventText + System.lineSeparator(); 
        m_logString += eventString;
        System.out.println(eventString);
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
        
        Save("EM_" + GetTimeStamp() + ".txt");
    }
    public void LogEmergencyMode(Room room) throws IOException{
        if(room.GetEmergencyMode() == EmergencyMode.Emergency){
            LogEvent("ROOM " + room.GetCode() + " ENTERED EMERGENCY MODE.");        
            Save("EM_" + GetTimeStamp() + ".txt");
        }
        else{
            LogEvent("ROOM " + room.GetCode() + " LEFT EMERGENCY MODE."); 
        }
    }
    
    public void Save(String path) throws IOException{        
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path), "utf-8"))) {
                writer.write(m_logString);
                writer.newLine();
}
    }
    public void Save() throws IOException{
        Save(m_filePath);
    }
    
    private String GetTimeStamp(){
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        return timeStamp;
    }
}