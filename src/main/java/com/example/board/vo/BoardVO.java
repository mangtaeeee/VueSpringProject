package com.example.board.vo;

import lombok.Data;

@Data
public class BoardVO { 			//게시판 테이블 
	private String mId ; 		//회원 아이디 
	private int bNum;			//게시판 번호
	private long bFile; 		//파일
	private String bTitle; 		//게시판 제목
	private long bContent; 		//게시판 내용
	private String bRgedate;	//게시판 등록일
	
	
}
