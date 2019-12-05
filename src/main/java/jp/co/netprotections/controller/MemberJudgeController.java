package jp.co.netprotections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.netprotections.dto.JudgedCandidatesResultListDto;
import jp.co.netprotections.dto.MemberCandidatesListDto;
import jp.co.netprotections.service.MemberJudgeService;

/**
 * @author t.miyazawa
 */
@RestController
public class MemberJudgeController {  
  @Autowired
  private MemberJudgeService memberJudgeService;
  /**
   * 判定を行う
   */
  @RequestMapping(value = "/judgemember", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public JudgedCandidatesResultListDto execute(@RequestBody MemberCandidatesListDto dto) throws Exception {
    return memberJudgeService.judgeAll(dto);
  }
}
