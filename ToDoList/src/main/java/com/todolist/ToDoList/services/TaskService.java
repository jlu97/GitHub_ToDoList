package com.todolist.ToDoList.services;

import com.todolist.ToDoList.models.Task;
import com.todolist.ToDoList.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public Task createNewTask(Task task) {
        return taskRepository.save(task);
    }
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }
    public Task getTaskById(Long id) {
        return taskRepository.getById(id);
    }
    public List<Task> findAllCompletedTasks() {
        return taskRepository.findCompletedTasks();
    }
    public List<Task> findAllInCompletedTasks() {
        return taskRepository.findInCompletedTasks();
    }
}
