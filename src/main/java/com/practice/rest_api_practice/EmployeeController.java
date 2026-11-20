package com.practice.rest_api_practice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    private List<Employee> employees = new ArrayList<>();

    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee employee){
            employees.add(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return employees;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        for(Employee e : employees){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }

    @PutMapping("/employee/{id}")
    public void updateEmployee(@PathVariable int id,
                                @RequestBody Employee uemployee){
        for(Employee e : employees){
            if(e.getId() == id){
                e.setDepartment(uemployee.getDepartment());
                e.setName(uemployee.getName());
                e.setSalary(uemployee.getSalary());
            }
        }
    }
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id){
        for(Employee e : employees){
            if(e.getId() == id){
                employees.remove(e);
            }
        }
    }

    @GetMapping("/employee/department/{department}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String department) {

        return employees.stream()
                .filter(emp -> emp.getDepartment().equals(department))
                .toList();
    }

    @PutMapping("/employee/salary/{id}")

    public void incrementSalaryByPercentage(@PathVariable int id,
                                            @RequestParam int percentage){
        for(Employee emp : employees){
            if(emp.getId() == id){
               double currentsalary = emp.getSalary();
               double increment = currentsalary * percentage;
               emp.setSalary(emp.getSalary() + increment);


            }
        }

    }

}
