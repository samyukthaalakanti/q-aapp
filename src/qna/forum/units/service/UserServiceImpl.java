package qna.forum.units.service;

import org.app.units.User;
import org.app.units.UserRole;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {

    public static ArrayList<User> users=new ArrayList<User>();

    public User createUser(java.lang.String userName, String password, UserRole userRole){
        User user=new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setUserRole(userRole);
        user.autoGenerateId();
        users.add(user);
        //Displays confirmation message after user is created
        System.out.println("User: "+user.getUserName()+" created");
        return user;
    }

    public User getUser(java.lang.String userName, java.lang.String password){
        User user=getUser(userName);
        if(user!=null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

    private User getUser(java.lang.String userName){
        for (User user:users){
            if(user.getUserName().equals(userName)){
                return user;
            }

        }
        return null;
    }
}
