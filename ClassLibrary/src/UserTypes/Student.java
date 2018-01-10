package UserTypes;

import UserTypes.*;

public class Student extends User {

    public Student() {
        this.SetUserType(UserType.Student);
    }

    public Student(String name) {
        super(name);
        this.SetUserType(UserType.Student);
    }
}