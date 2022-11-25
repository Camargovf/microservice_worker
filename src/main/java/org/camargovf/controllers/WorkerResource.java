package org.camargovf.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*
@author Camargo https://github.com/Camargovf
 */

import lombok.extern.slf4j.Slf4j;
import org.camargovf.entities.Worker;
import org.camargovf.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    Logger logger = LoggerFactory.getLogger(WorkerResource.class);
    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker obj = repository.findById(id).get();
        logger.info("Worker found: " + obj);
        return ResponseEntity.ok(obj);
    }
}