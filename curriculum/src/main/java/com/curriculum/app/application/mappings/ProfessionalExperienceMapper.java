package com.curriculum.app.application.mappings;

import java.util.ArrayList;
import java.util.List;

import com.curriculum.app.application.viewModels.ProfessionalExperienceViewModel;
import com.curriculum.app.domain.entities.ProfessionalExperience;

public class ProfessionalExperienceMapper {
	public static ProfessionalExperienceViewModel toMap(ProfessionalExperience source) {
		return new ProfessionalExperienceViewModel(
				source.getId(), 
				source.getCompany(),
				source.getRole(), 
				source.getWorkingTime() );
	}
	
	public static List<ProfessionalExperienceViewModel> toMap(List<ProfessionalExperience> source) {
		List<ProfessionalExperienceViewModel> destination = new ArrayList<>();
		for (ProfessionalExperience professionalExperience : source) {
			destination.add( new ProfessionalExperienceViewModel(
					professionalExperience.getId(), 
					professionalExperience.getCompany(),
					professionalExperience.getRole(), 
					professionalExperience.getWorkingTime()));
		}
		return destination;
	}
}
