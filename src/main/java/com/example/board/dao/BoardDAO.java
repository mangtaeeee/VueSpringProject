package com.example.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.vo.BoardVO;
import com.example.board.vo.ParamVO;

@Mapper
public interface BoardDAO {
	public List<BoardVO> boardList(ParamVO pvo);
	public int insertBoard(BoardVO bvo);
}
