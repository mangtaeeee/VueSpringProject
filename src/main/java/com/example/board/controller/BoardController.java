package com.example.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.service.BoardService;
import com.example.board.vo.BoardVO;
import com.example.board.vo.ParamVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@AllArgsConstructor
@RestController
@Log4j2
public class BoardController {
	
	private final BoardService boardservice;
	
	@GetMapping("/boardList")
	public List<BoardVO> BoardList(HttpServletRequest req,BoardVO bvo){
		ParamVO pvo = new ParamVO();
		pvo.setType(req.getParameter("type"));
		pvo.setParam(req.getParameter("param"));
		List<BoardVO> boardList = boardservice.boardList(pvo);
		log.info(boardList);
		return boardList;
	}
	
	
}

