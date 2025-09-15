package com.springbootproject.template.Controllers;

import com.springbootproject.template.Entity.RecordsEntity;
import com.springbootproject.template.Service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is a REST controller that exposes endpoints for managing records.
 */
@RestController
public class Controller {

    @Autowired
    private RecordService recordService;

    /**
     * A simple endpoint to check if the service is running.
     * @return A "hello world!" string.
     */
    @GetMapping("/pingMe")
    public String pingMe(){
        return "hello world!";
    }

    /**
     * Creates a new record.
     * @param name The name of the record.
     * @param amount The amount of the record.
     * @return The created record.
     */
    @PostMapping("/record/{name}/{amount}")
    public RecordsEntity record(@PathVariable(value = "name") String name, @PathVariable(value = "amount") int amount){
        return recordService.addRecord(name, amount);
    }

    /**
     * Retrieves a record by its name.
     * @param name The name of the record to retrieve.
     * @return The retrieved record.
     */
    @GetMapping("/record/{name}")
    public RecordsEntity getRecord(@PathVariable(value = "name") String name){
        return recordService.getRecord(name);
    }
}
