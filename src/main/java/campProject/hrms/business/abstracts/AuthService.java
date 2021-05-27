package campProject.hrms.business.abstracts;




public interface AuthService {
		boolean emailVerify(String email);
		boolean idntityNoVerify(String IdentityNo);
		boolean domainVerify(String email,String webSite);
}
