package com.curriculum.app.application.mappings;
import java.util.ArrayList;
import java.util.List;

import com.curriculum.app.application.viewModels.AcademicEducationViewModel;
import com.curriculum.app.domain.entities.AcademicEducation;

public class AcademicEducationMapper {
	public static AcademicEducationViewModel toMap(AcademicEducation source) {
		return new AcademicEducationViewModel(
					source.getId(),
					source.getTitle(), 
					source.getEducationInstitution());
	}
	
	public static List<AcademicEducationViewModel> toMap(List<AcademicEducation> source) {
		List<AcademicEducationViewModel> destination = new ArrayList<>();
		for (AcademicEducation academicEducation : source) {
			destination.add( new AcademicEducationViewModel(
					academicEducation.getId(),
					academicEducation.getTitle(), 
					academicEducation.getEducationInstitution()));
		}
		return destination;
	}
}
