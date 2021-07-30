package com.practice2.demo.repository;

import com.practice2.demo.model.board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<board, Integer> {
}
