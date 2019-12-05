package jp.co.netprotections.dto;

import java.util.List;


/**
 * @author t.miyazawa
 * 入退社候補者リストのDTO
 */
public class MemberCandidatesListDto {
  private List<MemberJudgeRequestDto> memberCandidatesList;

  /**
   * 入退社候補者リストのgetter
   * @return List<MemberJudgeRequestDto>
   */
  public List<MemberJudgeRequestDto> getMemberCandidateList() {
    return this.memberCandidatesList;
  }

  /**
   * 入退社候補者リストのsetter
   * @param memberCandidatesList
   */
  public void setMemberCandidatesList(List<MemberJudgeRequestDto> memberCandidatesList) {
    this.memberCandidatesList = memberCandidatesList;
  }
}
