package com.curriculum.app.application.mappings;

import java.util.ArrayList;
import java.util.List;
import com.curriculum.app.application.viewModels.KnowledgeViewModel;
import com.curriculum.app.domain.entities.Knowledge;

public class KnowledgeMapper {
	public static KnowledgeViewModel toMap(Knowledge source) {
		return new KnowledgeViewModel(
				source.getId(),
				source.getKnowledge());
	}
	
	public static List<KnowledgeViewModel> toMap(List<Knowledge> source) {
		List<KnowledgeViewModel> destination = new ArrayList<>();
		for (Knowledge knowledge : source) {
			destination.add( new KnowledgeViewModel(
					knowledge.getId(),
					knowledge.getKnowledge()));
		}
		return destination;
	}
}
