package se.lexicon.g49todoapi.service;

import se.lexicon.g49todoapi.domain.dto.UserDTOForm;
import se.lexicon.g49todoapi.domain.dto.UserDTOView;

public interface UserService {
    //register user(email, password,roles)
    //Change password
    //Find user by email
    //Disable user by email
    //Enable user by email
    //...

    UserDTOView register(UserDTOForm dtoForm);
    UserDTOView getByEmail(String email);
    void disableEmail(String email);
    void enableEmail(String email);
}
