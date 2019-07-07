package jp.co.netprotections.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.netprotections.dto.JudgedCandidatesResultListDto;
import jp.co.netprotections.dto.MemberCandidatesListDto;
import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.MemberJudgeService;



/**
 *
 * @author s.nozaki
 *
 */
@RestController
public class MemberJudgeController {  
    @Autowired
    private MemberJudgeService memberJudgeService;
  /**
   * 判定
   */
  @RequestMapping(value = "/judgemember", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public JudgedCandidatesResultListDto execute(@RequestBody MemberCandidatesListDto dto) throws Exception {
    // 判定対象の候補者を格納するリスト
    List<MemberJudgeRequestDto> candidateList = dto.getMemberCandidateList();
    // 一時的に判定結果を保存するリスト
    List<MemberJudgeResponseDto> judgedList = new ArrayList<MemberJudgeResponseDto>();
    JudgedCandidatesResultListDto resultList = new JudgedCandidatesResultListDto();
    
    judgedList = this.memberJudgeService.judge(candidateList);
    this.memberJudgeService.sortCandidatesByEnlistedPropriety(judgedList);
    resultList.setJudgeCandidatesResultList(judgedList);
    return resultList;
  }
}
