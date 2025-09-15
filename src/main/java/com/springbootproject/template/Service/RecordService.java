package com.springbootproject.template.Service;

import com.springbootproject.template.Entity.RecordsEntity;
import com.springbootproject.template.Repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class provides services for managing records.
 */
@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    /**
     * Adds a new record to the database.
     * @param name The name of the record.
     * @param amount The amount of the record.
     * @return The newly created record.
     */
    public RecordsEntity addRecord(String name, int amount) {
        RecordsEntity recordsEntity = new RecordsEntity(name, amount);
        recordRepository.save(recordsEntity);
        return recordsEntity;
    }

    /**
     * Retrieves a record from the database by its name.
     * @param name The name of the record to retrieve.
     * @return The retrieved record.
     */
    public RecordsEntity getRecord(String name) {
        return recordRepository.findByName(name).get(0);
    }


}
