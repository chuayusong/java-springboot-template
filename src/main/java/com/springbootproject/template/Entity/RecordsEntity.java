package com.springbootproject.template.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="record_table")
public class RecordsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer amount;

    public RecordsEntity(){
    }
    public RecordsEntity(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

}
