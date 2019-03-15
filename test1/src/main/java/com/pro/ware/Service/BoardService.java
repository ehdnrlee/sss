package com.pro.ware.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.ware.Dao.BoardDao;
import com.pro.ware.Vo.BoardVo;
@Service
public class BoardService {
	
	@Autowired BoardDao dao;
	
	public List<BoardVo> test() {
		System.out.println(dao.getBoard().get(0).getBoardName());
		
		
		return dao.getBoard();
	}
}
