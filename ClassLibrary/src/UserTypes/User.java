package UserTypes;

public abstract class User {

	private int m_id;
	private String m_name;
        private UserType m_userType;
        
        public User(){
            m_id = 0;
            m_name = "New User";
            m_userType = UserType.Visitor;
        }
        public User(String name){
            m_id = 0;
            m_name = name;
            m_userType = UserType.Visitor;
        }

    public int GetId() {
        return m_id;
    }

    public void SetId(int m_id) {
        this.m_id = m_id;
    }

    public String GetName() {
        return m_name;
    }

    public void SetName(String m_name) {
        this.m_name = m_name;
    }
    
    public UserType GetUserType(){
        return this.m_userType;
    }
    
    public void SetUserType(UserType userType){
        this.m_userType = userType;
    }
}