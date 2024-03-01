package com.springbootproject.template.Controllers;

import com.springbootproject.template.Entity.RecordsEntity;
import com.springbootproject.template.Service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private RecordService recordService;

    @GetMapping("/pingMe")
    public String pingMe(){
        return "hello world!";
    }

    @PostMapping("/record/{name}/{amount}")
    public RecordsEntity record(@PathVariable(value = "name") String name, @PathVariable(value = "amount") int amount){
        return recordService.addRecord(name, amount);
    }

    @GetMapping("/record/{name}")
    public RecordsEntity getRecord(@PathVariable(value = "name") String name){
        return recordService.getRecord(name);
    }
}
