package com.rest.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.rest.entity.Department;

public interface DepartmentRepository  extends JpaRepository<Department, Long>  {
	

}
