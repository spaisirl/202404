package member.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import member.service.MemberService;
import member.service.MemberVO;

@Controller
public class MemberController {
	@Resource(name="memberService")
	public MemberService memberService;
	/*회원등록 페이지 호출*/
	@RequestMapping("memberWrite.do")
	public String memberWrite() {
		return "member/memberWrite";
	}
	
	@RequestMapping("memberWriteSave.do") 
	@ResponseBody
	public String insertMember(MemberVO vo) throws Exception {
		String message = "";
		
		String result = memberService.insertMember(vo);
		if (result == null) {
			message = "ok";
		}
		return message;
		
		
	}
	
	@RequestMapping("idChk.do")
	@ResponseBody
	public String idChk(MemberVO vo) throws Exception {
		
		String message = "";
		
		// 중복 체크를 위한 Service 호출
	    String result = memberService.idChk(vo);
	    
	    if (result == null) {
			message = "ok";
		}
	    
	    return message;

		
	}
	
	
	
	
}
