package com.example.swaggerTestDemo.restservice.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/Employee")
public class EmployeeRestController {

    @GetMapping
    public ResponseEntity<List<Employee>> employeeDetails(){

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("suraj",30));
        employeeList.add(new Employee("onkar",25));
        return ResponseEntity.ok(employeeList);
    }

    @PostMapping
    public ResponseEntity createEmplpyee(@RequestBody Employee employee){

        return new ResponseEntity("", HttpStatus.CREATED);
    }

}
