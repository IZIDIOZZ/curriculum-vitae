package com.curriculum.app.application.mappings;

import java.util.List;
import com.curriculum.app.application.viewModels.ProfessionalExperienceViewModel;
import com.curriculum.app.domain.entities.ProfessionalExperience;

public class ProfessionalExperienceMapper{
	public static ProfessionalExperienceViewModel toMap(ProfessionalExperience source) {
		return new ProfessionalExperienceViewModel(source.getId(), source.getCompany(), source.getRole(),
				source.getWorkingTime());
	}

	public static List<ProfessionalExperienceViewModel> toMap(List<ProfessionalExperience> source) {
		return source.stream()
					.map(x -> new ProfessionalExperienceViewModel(x.getId(), 
																  x.getCompany(), 
																  x.getRole(), 
																  x.getWorkingTime())).toList();
	}
}
