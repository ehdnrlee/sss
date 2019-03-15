package com.pro.ware.Vo;

public class BoardVo {
	String BoardName;

	public BoardVo(String boardName) {
		super();
		BoardName = boardName;
	}

	public BoardVo() {
		super();
	}

	@Override
	public String toString() {
		return "BoardVo [BoardName=" + BoardName + "]";
	}

	public String getBoardName() {
		return BoardName;
	}

	public void setBoardName(String boardName) {
		BoardName = boardName;
	}
}
