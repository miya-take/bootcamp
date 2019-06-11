package jp.co.netprotections.service;

import java.util.List;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;

/*
 * こちらでinferfaceを定義する
 * --implに定義する
 */
abstract public interface MemberJudgeService {
	abstract public boolean JudgeEachMember(MemberJudgeRequestDto candidate);
	abstract public void sortCandidatesByEnlistedPropriety(List<MemberJudgeResponseDto>judgedList);
}
