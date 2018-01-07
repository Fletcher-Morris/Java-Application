package UserTypes;

public abstract class User {

	private int m_id;
	private String m_name;
        
        public User(){
            m_id = 0;
            m_name = "New User";
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
        
}