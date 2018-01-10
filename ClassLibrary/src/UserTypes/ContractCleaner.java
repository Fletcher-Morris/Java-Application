package UserTypes;

public class ContractCleaner extends User {
    
    public ContractCleaner(){
        this.SetUserType(UserType.ContractCleaner);
    }

    public ContractCleaner(String name) {
        super(name);
        this.SetUserType(UserType.ContractCleaner);
    }
}