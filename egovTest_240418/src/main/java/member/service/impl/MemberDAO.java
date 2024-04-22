package member.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import member.service.MemberVO;

// 데이터베이스에 접근하는 메서드를 가지고 있는 클래스에 쓰인다.
@Repository("memberDAO")
public class MemberDAO extends EgovAbstractDAO {
	
	public String insertMember(MemberVO vo) {
		return (String) insert("memberDAO.insertMember", vo);
	}
	
	// 아이디 중복체크
	public String idChk(MemberVO vo){
		return (String) select("memberDAO.idChk", vo);
	}

}
