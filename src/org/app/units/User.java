package org.app.units;

public class User extends AbstractEntity {

    //Username and password to login to the console QnA_app
    private java.lang.String userName;

    private java.lang.String password;

    private UserRole userRole;

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public java.lang.String getPassword() {
        return password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public java.lang.String getUserName() {
        return userName;
    }

    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    //Implementation of the abstract class defined in its parent class
    int id=0;

    @Override
    public void autoGenerateId() {
        id++;
        super.setId(id);
    }

}
