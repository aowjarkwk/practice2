package com.practice2.demo.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inx;
    private String name;
    private String content;

}
