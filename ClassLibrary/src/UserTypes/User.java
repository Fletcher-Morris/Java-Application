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
        public User(String name, UserType type){
            m_id = 0;
            m_name = name;
            m_userType = type;
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
    
    public static User ToUser(User user){
        
        User newUser = user;
        switch(newUser.GetUserType()){
                case ContractCleaner:
                    newUser = new ContractCleaner();
                    break;
                    
                    case EmergencyResponder:
                    newUser = new EmergencyResponder();
                    break;
                    
                    case Manager:
                    newUser = new Manager();
                    break;
                    
                    case Security:
                    newUser = new Security();
                    break;
                    
                    case Staff:
                    newUser = new Staff();
                    break;
                    
                    case Student:
                    newUser = new Student();
                    break;
                    
                    case Visitor:
                    newUser = new Visitor();
                    break;
                    
                    default:
                    newUser = new Visitor();
                    break;
            }
        
        newUser.SetId(user.GetId());
        newUser.SetName(user.GetName());
        newUser.SetUserType(user.GetUserType());
        
        return newUser;
    }

    public User ToUser(){
        return ToUser(this);
    }
}