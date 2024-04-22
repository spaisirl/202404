package member.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import member.service.MemberService;
import member.service.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name="memberDAO")
	public MemberDAO memberDAO;
	
	@Override
	public String insertMember(MemberVO vo) throws Exception {
		
		
		return memberDAO.insertMember(vo);
	}
	
	// 아이디 중복 체크
	@Override
	public String idChk(MemberVO vo) throws Exception {
		
		//DAO를 통해 아이디 중복 체크를 수행
		return memberDAO.idChk(vo);
		
	}

}
