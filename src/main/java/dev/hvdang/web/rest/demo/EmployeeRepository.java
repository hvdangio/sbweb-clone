package dev.hvdang.web.rest.demo;

import org.springframework.data.jpa.repository.JpaRepository;


interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
