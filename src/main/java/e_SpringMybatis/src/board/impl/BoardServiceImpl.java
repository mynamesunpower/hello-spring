package e_SpringMybatis.src.board.impl;

import e_SpringMybatis.src.board.BoardService;
import e_SpringMybatis.src.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAOMybatis boardDAO;

	public void insertBoard(BoardVO vo) {

		boardDAO.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
}