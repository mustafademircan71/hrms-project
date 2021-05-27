package campProject.hrms.mernisService;

import org.springframework.stereotype.Component;


@Component
public class MernisServices {
	public boolean identityNoCheck(String identityNo) {
		if (identityNo.length()!=11) {
			return false;
		}
		return true;
	}
}
