package campProject.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurricilumVitaesWithLanguageWithExpreinceWithEducationInfoDto {
	private int cvId;
	private String gitHubAddress;
	private String linkedinAddress;
	private String abilities;
	private String coverLetter;
	private String schoolName;
	private LocalDate schoolStartDate;
	private LocalDate schoolEndDate;
	private String companyName;
	private LocalDate jobStartDate;
	private LocalDate jobEndDate;
}
