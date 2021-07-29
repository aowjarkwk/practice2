package com.practice2.demo.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Data
public class board {
    private int inx;
    private String name;
    private String content;

}
