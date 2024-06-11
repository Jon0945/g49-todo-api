package se.lexicon.g49todoapi.service;

import org.springframework.stereotype.Service;
import se.lexicon.g49todoapi.domain.dto.RoleDTOView;

import java.util.List;

@Service
public interface RoleService {
    List<RoleDTOView> getAll();
}
