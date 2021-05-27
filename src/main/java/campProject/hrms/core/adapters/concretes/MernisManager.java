package campProject.hrms.core.adapters.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.core.adapters.abstracts.MernisService;
import campProject.hrms.mernisService.MernisServices;



@Service
public class MernisManager implements MernisService {
	private MernisServices mernisServices;
	
	@Autowired
	public MernisManager(MernisServices mernisServices) {
		super();
		this.mernisServices = mernisServices;
	}

	@Override
	public boolean CehckIfRealPerson(String identityNo) {
		return this.mernisServices.identityNoCheck(identityNo);
	}


	



	

}
