package qna.forum.units.service;

import org.app.units.User;
import org.app.units.UserRole;

public interface UserService {

     User createUser(java.lang.String userName, String password, UserRole userRole);

     User getUser(java.lang.String userName, java.lang.String password );

}
