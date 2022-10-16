package com.curriculum.app.application.viewModels;

public class ProfessionalExperienceViewModel {
	public Long id;
	public String company;
	public String role;
	public String workingTime;
	
	public ProfessionalExperienceViewModel(Long id, String company, String role, String workingTime) {
		super();
		this.id = id;
		this.company = company;
		this.role = role;
		this.workingTime = workingTime;
	}
}
