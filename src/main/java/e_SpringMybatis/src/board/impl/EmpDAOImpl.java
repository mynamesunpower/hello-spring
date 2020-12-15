package e_SpringMybatis.src.board.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository("empDAO")
public class EmpDAOImpl {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<HashMap> selectEmp() {
        System.out.println("EmpDAOImpl.selectEmp() 호출");
        // selSessionTemplate.어쩌구저쩌구("매퍼이름.아이디");
        return sqlSessionTemplate.selectList("EmpDAO.selectEmp");
    }
}
