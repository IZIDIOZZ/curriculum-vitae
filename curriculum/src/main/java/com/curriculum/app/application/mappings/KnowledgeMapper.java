package com.curriculum.app.application.mappings;
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
		return source.stream()
					 .map(x->new KnowledgeViewModel(x.getId(),
													x.getKnowledge())).toList();
	}
}
