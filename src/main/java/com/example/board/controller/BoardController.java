package com.example.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.service.BoardService;
import com.example.board.vo.BoardVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@AllArgsConstructor
@RestController
@Log4j2
public class BoardController {
	
	private final BoardService boardservice;
	
	@GetMapping("/list")
	public List<BoardVO> BoardList(BoardVO bvo){
		List<BoardVO> boardList = boardservice.boardList(bvo);
		log.info(boardList);
		return boardList;
	}
	
	
}

