package com.springbootproject.template.Repository;

import com.springbootproject.template.Entity.RecordsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This interface defines the repository for managing records in the database.
 */
@Repository
public interface RecordRepository extends CrudRepository<RecordsEntity, Integer> {

    /**
     * Finds a list of records by their name.
     * @param name The name of the records to find.
     * @return A list of records with the specified name.
     */
    List<RecordsEntity> findByName(String name);

}
