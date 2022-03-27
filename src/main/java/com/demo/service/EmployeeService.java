package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeRepository;
import com.demo.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
@Service
public class EmployeeService implements IEmployeeService {
     
    @Autowired
    EmployeeRepository employeeRepo;
 
    public void create(Employee e) {
    	System.out.println("create - e.toString(): "+e.toString());
        employeeRepo.save(e).subscribe();
    }
 
    public Mono<Employee> findById(Integer id) {
        return employeeRepo.findById(id);
    }
 
    public Flux<Employee> findByName(String name) {
        return employeeRepo.findByName(name);
    }
 
    public Flux<Employee> findAll() {
    	System.out.println("findAll");
        return employeeRepo.findAll();
    }
 
    public Mono<Employee> update(Employee e) {
    	System.out.println("2.- update - e.toString(): "+e.toString());
        return employeeRepo.save(e);
    }
 
    public Mono<Void> delete(Integer id) {
        return employeeRepo.deleteById(id);
    }
 
}