package e_SpringMybatis.src;

import e_SpringMybatis.src.board.impl.EmpServiceImpl;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

// framework : 개발에서 기본이 되는 틀을 제공함으로써 틀에 살을 붙이는 작업만 개발자가 하도록 돕는 뼈대이다.
// spring : 자바 기반으로 필요한 라이브러리들을 편하게 사용할 수 있도록 제공하는 프레임워크 ( = 틀, 골격 )
// DI 객체간 의존성을 자신이 아닌 외부에서 주입하는 개념
// AOP 관점지향프로그래밍으로 핵심적인 관점, 부가적인 관점으로 나눠 그 관점을 기준으로 하나의 단위로 묶는 것.

public class MainApp {
	public static void main(String[] args) {

		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext(
				"e_SpringMybatis_xml/applicationContext.xml");

		/*// 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup한다.
		BoardService boardService = (BoardService) container.getBean("boardService");

		// 3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("spring mybatis");
		vo.setWriter("홍길동S");
		vo.setContent("임시 내용..............");
		boardService.insertBoard(vo);

		// 4. 글 목록 검색 기능 테스트		
		BoardVO svo = new BoardVO();
		List<BoardVO> boardList = boardService.getBoardList(svo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}*/
		EmpServiceImpl empService = container.getBean("empService", EmpServiceImpl.class);
		List<HashMap> empList = empService.selectEmp();
		for(HashMap hashMap : empList) {
			// HashMap에서 가져올때 컬럼명 대문자로.
			System.out.println(hashMap.get("ENAME") + "/" + hashMap.get("DNAME"));
		}

		// 5. Spring 컨테이너 종료
		container.close();
	}
}