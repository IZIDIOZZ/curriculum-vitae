package com.curriculum.app.application.mappings;

import java.util.ArrayList;
import java.util.List;
import com.curriculum.app.application.viewModels.LanguageProficiencyViewModel;
import com.curriculum.app.domain.entities.LanguageProficiency;

public class LanguageProficiencyMapper {
	public static LanguageProficiencyViewModel toMap(LanguageProficiency source) {
		return new LanguageProficiencyViewModel(
				source.getId(),
				source.getLanguage(),
				source.getReading(), 
				source.getWriting(), 
				source.getSpeaking());
	}
	
	public static List<LanguageProficiencyViewModel> toMap(List<LanguageProficiency> source) {
		List<LanguageProficiencyViewModel> destination = new ArrayList<>();
		for (LanguageProficiency languageProficiency : source) {
			destination.add(new LanguageProficiencyViewModel(
					languageProficiency.getId(),
					languageProficiency.getLanguage(),
					languageProficiency.getReading(), 
					languageProficiency.getWriting(), 
					languageProficiency.getSpeaking()));
		}
		return destination;
	}
}
