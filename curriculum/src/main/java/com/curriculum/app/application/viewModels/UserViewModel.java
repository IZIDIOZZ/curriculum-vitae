package com.curriculum.app.application.viewModels;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UserViewModel {
	public Long id;
	public String name;
	public String birthDate;
	public String phone;
	public String email;
	public String linkedin;
	public String github;
	public String imageProfileUrl;
	
	public List<ProfessionalExperienceViewModel> professionalExperiences;
	public List<AcademicEducationViewModel> academicEducations;
	public List<KnowledgeViewModel> knowledges;
	public List<LanguageProficiencyViewModel> languageProficiencies;
	
	public UserViewModel(Long id, String name, Date birthDate, String phone, String email, String linkedin,
			String github, String imageProfileUrl, List<ProfessionalExperienceViewModel> professionalExperiences,
			List<AcademicEducationViewModel> academicEducations, List<KnowledgeViewModel> knowledges,
			List<LanguageProficiencyViewModel> languageProficiencies) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = new SimpleDateFormat().format(birthDate);
		this.phone = phone;
		this.email = email;
		this.linkedin = linkedin;
		this.github = github;
		this.imageProfileUrl = imageProfileUrl;
		this.professionalExperiences = professionalExperiences;
		this.academicEducations = academicEducations;
		this.knowledges = knowledges;
		this.languageProficiencies = languageProficiencies;
	}
	

}
