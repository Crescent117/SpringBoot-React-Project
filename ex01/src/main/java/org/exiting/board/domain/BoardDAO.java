package org.exiting.board.domain;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BoardDAO {
	@Autowired
	SqlSessionTemplate sql;
	
	public List<Map<String,Object>> boardList(Map<String, Object> map){
		
		return sql.selectList("board.boardList",map);	
	}
	
	public List<Map<String,Object>> getComment(Map<String, Object> map){
		
		return sql.selectList("board.getComment",map);	
	}
	
	public int boardInsert(Map<String, Object> map){
		
		return sql.insert("board.boardInsert",map);	
	}
	
	public int replyInsert(Map<String, Object> map){
		
		return sql.insert("board.replyInsert",map);	
	}
	
	public int updateBoard(Map<String, Object> map){
		
		return sql.update("board.updateBoard",map);	
	}
	
	public int deleteBoard(Map<String, Object> map){
		
		return sql.delete("board.deleteBoard",map);	
	}
	
	public int boardVisit(Map<String, Object> map){
		
		return sql.update("board.boardVisit",map);	
	}
	
	public Map<String, Object> boardView(Map<String, Object> map){
		
		return sql.selectOne("board.boardView",map);	
	}
	
	public Map<String, Object> boardCnt(Map<String, Object> map){
		
		return sql.selectOne("board.boardCnt",map);	
	}
	
	public int replyDelete(Map<String, Object> map){
		
		return sql.delete("board.replyDelete",map);	
	}
	public int replyUpdate(Map<String, Object> map){
		
		return sql.update("board.replyUpdate",map);	
	}
}
