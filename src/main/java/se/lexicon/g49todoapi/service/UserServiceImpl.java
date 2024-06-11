package se.lexicon.g49todoapi.service;

import org.springframework.stereotype.Service;
import se.lexicon.g49todoapi.domain.dto.UserDTOForm;
import se.lexicon.g49todoapi.domain.dto.UserDTOView;
import se.lexicon.g49todoapi.domain.entity.User;
import se.lexicon.g49todoapi.repository.RoleRepository;
import se.lexicon.g49todoapi.repository.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTOView register(UserDTOForm dtoForm) {
        if (dtoForm == null) throw new IllegalArgumentException("Form is empty");
        userRepository.save(new User(dtoForm.getEmail(),dtoForm.getPassword()));
        return new UserDTOView(dtoForm.getEmail());
    }

    @Override
    public UserDTOView getByEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email is empty");
        Optional<User> optionalUser = userRepository.findById(email);
        return new UserDTOView(optionalUser.get().getEmail());
    }

    @Override
    public void disableEmail(String email) {
        if(email == null) throw new IllegalArgumentException("Email is empty");
        userRepository.updateExpiredByEmail(email, true);
    }

    @Override
    public void enableEmail(String email) {
        if(email == null) throw new IllegalArgumentException("Email is empty");
        userRepository.updateExpiredByEmail(email,false);
    }
}
