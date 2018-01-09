/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

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
        
//        userList.CreateUser("Jeff");
//        userList.CreateUser("Ron");
//        userList.CreateUser("Jane");
//        userList.CreateUser("Rosetta");
//        userList.CreateUser("Keith");
    }
}
