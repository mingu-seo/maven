package chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoService {
	@Autowired
	private MemberDao memberDao;
	
//	public MemberInfoService(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
	
	public  Member selectOne(String email) {
		return memberDao.selectByEmail(email);
	}
	
}
