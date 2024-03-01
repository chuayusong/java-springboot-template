package com.springbootproject.template.Repository;

import com.springbootproject.template.Entity.RecordsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends CrudRepository<RecordsEntity, Integer> {

    List<RecordsEntity> findByName(String name);

}
