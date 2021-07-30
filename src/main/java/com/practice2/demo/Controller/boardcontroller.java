package com.practice2.demo.Controller;

import com.practice2.demo.model.board;
import com.practice2.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class boardcontroller {
       @Autowired
       private BoardRepository boardRepository;
        @GetMapping("/list")
    public String list(Model model){
        List<board> boards = boardRepository.findAll();
        model.addAttribute("boards",boards);
        return "board/list";
    }
}
