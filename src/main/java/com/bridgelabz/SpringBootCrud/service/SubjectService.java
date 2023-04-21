package com.bridgelabz.SpringBootCrud.service;

import com.bridgelabz.SpringBootCrud.model.Subject;
import com.bridgelabz.SpringBootCrud.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    public SubjectRepo subjectRepo;

    public List<Subject> getAllSubject() {
        List<Subject> subjects = new ArrayList<>();
        subjectRepo.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjectRepo.save(subject);
    }

    public void updateSubject(@PathVariable int id, @RequestBody Subject subject) {
        subjectRepo.save(subject);
    }

    public void deleteSubject(int id) {
        subjectRepo.deleteById(id);
    }
}
