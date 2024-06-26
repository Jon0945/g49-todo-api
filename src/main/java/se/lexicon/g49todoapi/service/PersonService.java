package se.lexicon.g49todoapi.service;

import se.lexicon.g49todoapi.domain.dto.PersonDTOForm;
import se.lexicon.g49todoapi.domain.dto.PersonDTOView;

import java.util.List;

public interface PersonService {
    //create
    PersonDTOView create(PersonDTOForm personDTOForm);
    //findById
    PersonDTOView findById(Long id);
    //findAll
    List<PersonDTOView> findAll();
    //update
    PersonDTOView update(PersonDTOForm personDTOForm);
    //delete
    void delete(Long id);
}
