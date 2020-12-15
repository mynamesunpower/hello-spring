package e_SpringMybatis.src.board.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("empService")
public class EmpServiceImpl {

    @Autowired
    private EmpDAOImpl empDAO;

    public List<HashMap> selectEmp() {
        return empDAO.selectEmp();
    }
}
