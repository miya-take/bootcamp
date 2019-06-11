package jp.co.netprotections.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.MemberJudgeService;

public class MemberJudgeServiceImpl implements MemberJudgeService{

	public boolean JudgeEachMember(jp.co.netprotections.dto.MemberJudgeRequestDto candidate) {
		if (candidate.getEventPlanning() <= 1) {
			return false;
		}
		if (candidate.getCogitation() <= 1) {
			return false;
		}
		if (candidate.getEventPlanning() <= 1) {
			return false;
		}
		if ((
				candidate.getEventPlanning() +
				candidate.getCoodination() +
				candidate.getProgrammingAbility() +
				candidate.getInfrastructureKnowledge()
			) <= 10){
			return false;
		} else {
			return true;
		}
	}

	public void sortCandidatesByEnlistedPropriety(List<MemberJudgeResponseDto>judgedList) {
		Collections.sort(judgedList, new Comparator<MemberJudgeResponseDto>() {
			public int compare(MemberJudgeResponseDto candidateSecond, MemberJudgeResponseDto candidateFirst) {
				return Boolean.compare(candidateFirst.getEnlistedPropriety(), candidateSecond.getEnlistedPropriety());
			}
		});
	}

}