package com.curriculum.app.application.viewModels;

public class AcademicEducationViewModel {
	public Long id;
	public String title;
	public String educationInstitution;
	
	public AcademicEducationViewModel(Long id, String title, String educationInstitution) {
		super();
		this.id = id;
		this.title = title;
		this.educationInstitution = educationInstitution;
	}
}
