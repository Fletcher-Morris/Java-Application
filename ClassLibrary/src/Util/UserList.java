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

    public UserList() {
        m_users = new ArrayList<User>();
    }
    
    
    private List<User> m_users;

    public List<User> GetUsers() {
        return m_users;
    }

    public void SetUsers(ArrayList m_users) {
        this.m_users = m_users;
    }
    
    public void CreateUser(User user){
        for(int i = 0; i < m_users.size(); i ++){
            user.SetId(i + 1);
        }
        m_users.add(user.ToUser());
    }
    public void CreateUser(String name){
        User newUser = new User(name) {};
        CreateUser(newUser.ToUser());
    }
    public void CreateUser(String name, UserType type){
        User newUser = new User(name, type) {};
        CreateUser(newUser.ToUser());
    }
    
    public User FindUserById(int id){
        
        for(int i = 0; i < m_users.size(); i++){
            if(m_users.get(i).GetId() == id){
                return m_users.get(i);
            }
        }        
        return null;
    }
    
    public User FindUserByName(String fullName){
        
        for(int i = 0; i < m_users.size(); i++){
            if(m_users.get(i).GetName() == fullName){
                return m_users.get(i);
            }
        }        
        return null;
    }
    
    public void SetUser(int id, User user){
        for(int i = 0; i < m_users.size(); i++){
            if(i == id){              
                m_users.set(i, user.ToUser());
            }
        }
    }
    
    public void RemoveUser(int id){
        for(int i = 0; i < m_users.size(); i++){
            if(i == id){              
                m_users.remove(i);
            }
        }
    }
}
