package com.springbootproject.template.Entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * This class represents a record in the database.
 */
@Entity
@Data
@Table(name="record_table")
public class RecordsEntity {

    /**
     * The unique identifier for the record.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * The name of the record.
     */
    private String name;

    /**
     * The amount of the record.
     */
    private Integer amount;

    /**
     * The default constructor.
     */
    public RecordsEntity(){
    }

    /**
     * A constructor that initializes the name and amount of the record.
     * @param name The name of the record.
     * @param amount The amount of the record.
     */
    public RecordsEntity(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

}
