package com.example.board.dao;

import java.util.List;

import com.example.board.vo.BoardVO;

public interface BoardDAO {
	public List<BoardVO> boardList (BoardVO bvo);
	
}
