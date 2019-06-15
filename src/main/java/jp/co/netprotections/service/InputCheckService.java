package jp.co.netprotections.service;

import jp.co.netprotections.dto.MemberJudgeRequestDto;

abstract public interface InputCheckService {
	abstract public boolean CheckEachParameter(MemberJudgeRequestDto candidate);
}
