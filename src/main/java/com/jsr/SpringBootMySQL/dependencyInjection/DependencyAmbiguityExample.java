package com.jsr.SpringBootMySQL.dependencyInjection;

import com.jsr.SpringBootMySQL.respository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DependencyAmbiguityExample {

    // To Avoid Bean Ambiquity use @Qualilfier Or @Resource annotation
    //Field departmentRepository in com.jsr.SpringBootMySQL.dependencyInjection.DependencyAmbiguityExample required a single bean, but 2 were found:
   @Autowired
   //@Qualifier("departmentRepositoryImpl1")
   @Resource(name = "departmentRepositoryImpl1")
   private DepartmentRepository departmentRepository;


   public void testAmbiguity(){
       departmentRepository.saveDepartment();
   }


}

