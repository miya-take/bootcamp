package jp.co.netprotections.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import jp.co.netprotections.dto.JudgedCandidatesResultListDto;
import jp.co.netprotections.dto.MemberCandidatesListDto;
import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.impl.InputCheckServiceImpl;
import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;




@RestController
public class MemberJudgeController {
  // 入力結果が正しいか判定するlogic
  InputCheckServiceImpl checkInput = new InputCheckServiceImpl();
  // 能力判定logic
  MemberJudgeServiceImpl judgeStandard = new MemberJudgeServiceImpl();

  @RequestMapping(
      value = "/judgemember",
      method = RequestMethod.POST,
      consumes = MediaType.APPLICATION_JSON_VALUE
      )

  @ResponseBody
  public JudgedCandidatesResultListDto execute(@RequestBody MemberCandidatesListDto dto)
      throws JsonProcessingException {
    // 判定対象の候補者を格納するリスト
    List<MemberJudgeRequestDto> candidateList = new ArrayList<MemberJudgeRequestDto>();
    candidateList.addAll(dto.getMemberCandidateList());

    // 最終的にJSONで返却する候補者リスト
    JudgedCandidatesResultListDto resultList = new JudgedCandidatesResultListDto();
    // 一時的に判定結果を保存するリスト
    List<MemberJudgeResponseDto> judgedList = new ArrayList<MemberJudgeResponseDto>();
    // 候補者メンバーそれぞれを判定する
    for (int i = 0; i < candidateList.size(); i++) {
      // 候補者インスタンス
      MemberJudgeRequestDto candidate = candidateList.get(i);
      // 候補者の判定結果インスタンス
      MemberJudgeResponseDto judgedCandidate = new MemberJudgeResponseDto(
          candidate.getMemberName());

      if (checkInput.checkEachParameter(candidate)) {
        // 入力にエラーがないときの処理
        judgedCandidate.setEnlistedPropriety(judgeStandard.judgeEachMember(candidate));
      } else {
        // 入力にエラーがあったときの処理
        judgedCandidate.setMemberName(null);
        judgedCandidate.setEnlistedPropriety(false);
      }
      judgedList.add(judgedCandidate);
    }
    judgeStandard.sortCandidatesByEnlistedPropriety(judgedList);
    resultList.setJudgeCandidatesResultList(judgedList);
    return resultList;
  }
}
