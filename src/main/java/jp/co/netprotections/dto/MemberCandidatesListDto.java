package jp.co.netprotections.dto;

import java.util.List;


public class MemberCandidatesListDto {
  private List<MemberJudgeRequestDto> memberCandidatesList;

  public List<MemberJudgeRequestDto> getMemberCandidateList() {
    return this.memberCandidatesList;
  }

  public void setMemberCandidatesList(List<MemberJudgeRequestDto> memberCandidatesList) {
    this.memberCandidatesList = memberCandidatesList;
  }
}
