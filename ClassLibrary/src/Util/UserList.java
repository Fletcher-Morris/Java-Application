package Util;


import java.util.ArrayList;
import java.util.List;
import UserTypes.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author odmoa
 */
public class UserList{
    
    
    
    private List<User> m_users;
    
    private List<User> m_sortedUsers;

    public List<User> GetUsers() {
        return m_users;
    }

    public void SetUsers(ArrayList m_users) {
        this.m_users = m_users;
    }

    public List<User> GetSortedUsers() {
        return m_sortedUsers;
    }

    public void SetSortedUsers(ArrayList m_sortedUsers) {
        this.m_sortedUsers = m_sortedUsers;
    }
    
    
    public List<User> SortAlphabetically(){
        
        m_sortedUsers = m_users;
        
        for(int i = 0; i < m_users.size(); i++){
            
        }
        
        return m_sortedUsers;
    }
    
    public void AddUser(User user){
        m_users.add(user);
    }
}
