package com.curriculum.app.application.viewModels;

public class LanguageProficiencyViewModel {
	public Long id;
	public String language;
	public String reading;
	public String writing;
	public String speaking;
	
	public LanguageProficiencyViewModel(Long id, String language, String reading, String writing, String speaking) {
		super();
		this.id = id;
		this.language = language;
		this.reading = reading;
		this.writing = writing;
		this.speaking = speaking;
	}
}
