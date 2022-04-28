package com.example.board.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponseVO {
	private int code;
	private String message;
	
	public ErrorResponseVO(String message) {
		this.message = message;
	}
	
}
