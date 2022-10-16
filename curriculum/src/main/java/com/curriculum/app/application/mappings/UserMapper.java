package com.curriculum.app.application.mappings;

import com.curriculum.app.application.viewModels.UserViewModel;
import com.curriculum.app.domain.entities.User;

public class UserMapper{
		public static UserViewModel toMap(User source) {
			return new UserViewModel(
					source.getId(),
					source.getName(),
					source.getBirthDate(),
					source.getPhone(),
					source.getEmail(),
					source.getLinkedin(),
					source.getGithub(),
					source.getImageProfileUrl(),
					ProfessionalExperienceMapper.toMap(source.getProfessionalExperiences()),
					AcademicEducationMapper.toMap(source.getAcademicEducations()),
					KnowledgeMapper.toMap(source.getKnowledges()),
					LanguageProficiencyMapper.toMap(source.getLanguageProficiencies())
					);
		}
		
}
