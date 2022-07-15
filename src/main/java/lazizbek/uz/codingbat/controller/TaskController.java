package lazizbek.uz.codingbat.controller;

import lazizbek.uz.codingbat.entity.Task;
import lazizbek.uz.codingbat.payload.ApiResponse;
import lazizbek.uz.codingbat.payload.TaskDto;
import lazizbek.uz.codingbat.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping(value = "/api/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    /**
     * TOPSHIRIQNI SAQLASH
     * @param taskDto TaskDto
     * @return ApiResponse
     */
    @PostMapping
    public ResponseEntity<ApiResponse> addTask(@RequestBody TaskDto taskDto){
        ApiResponse apiResponse = taskService.addTask(taskDto);
        return ResponseEntity.status(apiResponse.isSuccess() ? 201 : 404 ).body(apiResponse);
    }

    /**
     * TOPSHIRIQNI TAHRIRLASH
     * @param taskDto TaskDto
     * @param id Integer
     * @return ApiResponse
     */
    @PutMapping(value = "/{id}")
    public ResponseEntity<ApiResponse> editTask(@RequestBody TaskDto taskDto, @PathVariable Integer id){
        ApiResponse apiResponse = taskService.editTask(taskDto, id);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409 ).body(apiResponse);
    }

    /**
     * TOPSHIRIQLAR TO'YXATINI QAYTARISH
     * @return List
     */
    @GetMapping
    public ResponseEntity<List<Task>> getTaskList(){
        List<Task> taskList = taskService.getTaskList();
        return ResponseEntity.ok(taskList);
    }

    /**
     * TOPSHIRIQNI QAYTARISH
     * @param id Integer
     * @return ApiResponse
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<ApiResponse> getTaskById(@PathVariable Integer id){
        ApiResponse apiResponse = taskService.getTaskById(id);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    /**
     * TOPSHIRIQNI O'CHIRISH
     * @param id Integer
     * @return ApiResponse
     */
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ApiResponse> deleteTask(@PathVariable Integer id){
        ApiResponse apiResponse = taskService.deleteTask(id);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }


}
