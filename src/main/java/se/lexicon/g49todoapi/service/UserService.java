package se.lexicon.g49todoapi.service;

import se.lexicon.g49todoapi.domain.dto.UserDTOForm;
import se.lexicon.g49todoapi.domain.dto.UserDTOView;

public interface UserService {
    //register user(email, password,roles)
    UserDTOView register(UserDTOForm dtoForm);
    //Find user by email
    UserDTOView getByEmail(String email);
    //Disable user by email
    void disableEmail(String email);
    //Enable user by email
    void enableEmail(String email);
    //...

}
