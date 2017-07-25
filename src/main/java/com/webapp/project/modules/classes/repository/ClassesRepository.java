package com.webapp.project.modules.classes.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import com.webapp.project.modules.classes.model.Classes;
@Component
public interface ClassesRepository extends MongoRepository<Classes, String> {

	 	/*@Query("{ 'classes' : ?0 }")
	    Classes getClassesByName(String name);
	    
	    @Query(fields="{ 'classesNumeric' : 1, 'classesId' : 1, 'classes' : 1}")
	    List getAllClasses();
	    
	    @Query(value="{ 'classesId' : ?0}",fields="{ 'classesNumeric' : 1, 'classesId' : 1, 'classes' : 1}")
	    List getClassesById(int classesId);*/
	
}
