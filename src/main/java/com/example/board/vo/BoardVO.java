package com.example.board.vo;

import lombok.Data;

@Data
public class BoardVO { 			//게시판 테이블 
	private String m_id ; 		//회원 아이디 
	private int b_num;			//게시판 번호
	private String b_file; 		//파일
	private String b_title; 		//게시판 제목
	private String b_content; 		//게시판 내용
	private String b_regdate;	//게시판 등록일
	
	
}
