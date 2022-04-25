package com.example.board.service;

import java.util.List;

import com.example.board.vo.BoardVO;
import com.example.board.vo.ParamVO;

public interface BoardService {
	public List<BoardVO> boardList (ParamVO pvo);

}
