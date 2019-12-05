package jp.co.netprotections.dto;

import java.util.List;

/**
 * @author t.miyazawa
 * 入退判定結果リストのDTO
 *
 */
public class JudgedCandidatesResultListDto {
  private List<MemberJudgeResponseDto> judgeCandidatesResultList;
  
  /**
   * 入退判定結果リストのgetter
   * @return List<MemberJudgeResponseDto>
   */
  public List<MemberJudgeResponseDto> getJudgeCandidatesResultList() {
    return this.judgeCandidatesResultList;
  }

  /**
   * 入退判定結果リストのsetter
   * @param judgeCandidatesResultList
  */
  public void setJudgeCandidatesResultList(List<MemberJudgeResponseDto> judgeCandidatesResultList) {
    this.judgeCandidatesResultList = judgeCandidatesResultList;
  }
}
