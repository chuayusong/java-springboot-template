package com.springbootproject.template.Service;

import com.springbootproject.template.Entity.RecordsEntity;
import com.springbootproject.template.Repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public RecordsEntity addRecord(String name, int amount) {
        RecordsEntity recordsEntity = new RecordsEntity(name, amount);
        recordRepository.save(recordsEntity);
        return recordsEntity;
    }

    public RecordsEntity getRecord(String name) {
        return recordRepository.findByName(name).get(0);
    }

    public List<RecordsEntity> getRecords() {
        return recordRepository.findAll();
    }


}
