package jp.co.netprotections.service;

import java.util.List;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;


abstract public interface MemberJudgeService {
	abstract public boolean judgeEachMember(MemberJudgeRequestDto candidate);
	abstract public void sortCandidatesByEnlistedPropriety(List<MemberJudgeResponseDto>judgedList);
}
