package Project.TODO.controller;
import Project.TODO.model.Todo;
import Project.TODO.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TodoController {
    @Autowired
    TodoService service;
    @PostMapping("/add")
    public String addtask(@RequestBody Todo app){
        service.add(app);
        return "Created";
    }
 @GetMapping
    public List<Todo> showalltasks(){
        return service.show();
 }
 @PutMapping("/{id}")
    public ResponseEntity<?> edit(@PathVariable int id, @RequestBody Todo todo){
        Todo updated=service.edit(id,todo);
        if(updated==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("task not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Updated");
 }
 @DeleteMapping("/del")
    public void del(){
        service.del();
 }


}
