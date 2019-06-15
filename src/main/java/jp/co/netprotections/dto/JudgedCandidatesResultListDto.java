package jp.co.netprotections.dto;

import java.util.List;

public class JudgedCandidatesResultListDto {
  private List<MemberJudgeResponseDto> judgeCandidatesResultList;

  public List<MemberJudgeResponseDto> getJudgeCandidatesResultList() {
    return this.judgeCandidatesResultList;
  }

  public void setJudgeCandidatesResultList(List<MemberJudgeResponseDto> judgeCandidatesResultList) {
    this.judgeCandidatesResultList = judgeCandidatesResultList;
  }
}
