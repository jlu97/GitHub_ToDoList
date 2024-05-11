package com.todolist.ToDoList.repositories;

import com.todolist.ToDoList.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    public Task findByTask(String task);
    public List<Task> findCompletedTasks();
    public List<Task> findInCompletedTasks();
    public List<Task> findAll();
    public Task getById(Long id);
}
