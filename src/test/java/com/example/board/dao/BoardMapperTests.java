package com.example.board.dao;


import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.board.vo.BoardVO;
import com.example.board.vo.ParamVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest 
public class BoardMapperTests {
	
	@Resource
	private BoardDAO boardDao;
	
//	@Test
//	public void testinsertBoard() {
//		BoardVO bvo = new BoardVO();
//		bvo.setMId("user");
//		bvo.setBFile("새파일");
//		bvo.setBContent("내용임당");
//		bvo.setBTitle("새내용임당");
//		
//		int result = 0;
//		result = boardDao.insertBoard(bvo);
//		log.debug(result);
//		
//	}
	
	@Test
	public void testBoardList() {
		ParamVO pvo = new ParamVO();
		List<BoardVO> list = boardDao.boardList(pvo);		
		log.debug(list);
		for(BoardVO vo : list) {
			log.info(vo);
		}
	}
	
	
	
}
