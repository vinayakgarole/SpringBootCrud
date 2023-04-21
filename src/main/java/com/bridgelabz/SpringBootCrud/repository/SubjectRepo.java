package com.bridgelabz.SpringBootCrud.repository;

import com.bridgelabz.SpringBootCrud.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepo extends CrudRepository<Subject, Integer> {
}
