package com.example.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.vo.BoardVO;

@Mapper
public interface BoardDAO {
	public List<BoardVO> boardList(BoardVO bvo);
	
}
