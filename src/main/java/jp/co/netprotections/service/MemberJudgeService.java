package jp.co.netprotections.service;

import java.util.List;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;


public abstract interface MemberJudgeService {
  public abstract boolean judgeEachMember(MemberJudgeRequestDto candidate);

  public abstract void sortCandidatesByEnlistedPropriety(List<MemberJudgeResponseDto> judgedList);
}
