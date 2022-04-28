package com.example.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/insertBoard")
	public String insertBoard(@RequestBody BoardVO bvo) throws Exception {
		int result = 0;
		result = boardservice.insertBoard(bvo);
		
		if (result == 1) {
			log.info(result);
			return "/boardList";
		} else {
			log.info(result);
			return "fail";
		}
	}
	
	@DeleteMapping("/boardDelete")
	public String boardDelete(@ModelAttribute BoardVO bvo) throws Exception {
		boardservice.boardDelete(bvo);
		return "success";
		
	}
	
	
}

