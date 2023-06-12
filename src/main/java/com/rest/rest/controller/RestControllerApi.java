package com.rest.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rest.rest.entity.Department;
import com.rest.rest.service.DepartmentService;
import com.rest.rest.service.DepartmentServiceImpl;


@RestController
public class RestControllerApi {

	
	  // Annotation
    @Autowired 
    DepartmentService departmentService;
	
    @GetMapping("/departments")
    public String fetchDepartmentListsss()
    {
        return "Department fetched";
    }
    // Save operation
    @PostMapping("/departments")
    public Department saveDepartment(
         @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

	  @GetMapping("/getDepartments") public List<Department> fetchDepartmentList() {
	  return departmentService.fetchDepartmentList(); }
	 
    
    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
            department, departmentId);
    }
    
    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        departmentService.deleteDepartmentById(
            departmentId);
        return "Deleted Successfully";
    }
    
    
	  @GetMapping("/getDepartmentsById/{id}") 
	  public Department fetchDepartmentById(@PathVariable("id")
	                                        Long departmentId) 
	  {
	  return departmentService.fetchDepartmentById(departmentId); 
	  }
    
}
