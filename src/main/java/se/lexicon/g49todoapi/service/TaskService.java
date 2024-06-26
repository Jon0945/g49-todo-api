package se.lexicon.g49todoapi.service;

import se.lexicon.g49todoapi.domain.dto.TaskDTOForm;
import se.lexicon.g49todoapi.domain.dto.TaskDTOView;

import java.time.LocalDate;
import java.util.List;

public interface TaskService {
    //create
    TaskDTOView create(TaskDTOForm taskDTOForm);
    //findById
    TaskDTOView findById(Long taskId);
    //findAll
    List<TaskDTOView> findAll();
    //update
    void update(TaskDTOForm taskDTOForm);
    //delete
    void delete(Long id);
    //findTasksByPersonId
    List<TaskDTOView> findTasksByPersonId(Long personId);
    //findTasksBetweenStartAndEndDate
    List<TaskDTOView> findTasksBetweenStartAndEndDate(LocalDate start, LocalDate end);
    //findAllUnassignedTasks
    List<TaskDTOView> findAllUnassignedTodoItems();
    //findAllUnfinishedTasksAndOverdue
    List<TaskDTOView> findAllUnfinishedAndOverdue();

    TaskDTOView addTaskToPerson(Long personId, TaskDTOForm taskDTOForm);
}
