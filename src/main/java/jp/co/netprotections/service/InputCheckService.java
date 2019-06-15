package jp.co.netprotections.service;

import jp.co.netprotections.dto.MemberJudgeRequestDto;

public abstract interface InputCheckService {
  public abstract boolean checkEachParameter(MemberJudgeRequestDto candidate);
}
