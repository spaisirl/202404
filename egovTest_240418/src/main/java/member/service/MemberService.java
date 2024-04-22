package member.service;

public interface MemberService {
	/*회원등록처리*/
	public String insertMember(MemberVO vo) throws Exception;
	
	// 아이디 중복 체크
	public String idChk(MemberVO vo) throws Exception;
	

}
