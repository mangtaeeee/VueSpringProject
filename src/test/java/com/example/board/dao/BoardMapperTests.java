package com.example.board.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;

import com.example.board.vo.BoardVO;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class BoardMapperTests {
	
	@Resource
	private BoardDAO boardDao;
	
	@Test
	public void testBoardList() {
		BoardVO bvo = new BoardVO();

		List<BoardVO> list = boardDao.boardList(bvo);
		
		log.debug(list);
		for(BoardVO vo : list) {
			log.info(vo);
		}
	}
}
