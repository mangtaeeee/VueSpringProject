package com.example.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.board.dao.BoardDAO;
import com.example.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Resource
	private BoardDAO boardDao;

	@Override
	public List<BoardVO> boardList(BoardVO bvo) {
		
		List<BoardVO> list = boardDao.boardList(bvo);
		return list;
	}
	
}
