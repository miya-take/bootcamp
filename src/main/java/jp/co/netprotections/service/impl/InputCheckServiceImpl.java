package jp.co.netprotections.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.resources.Messages;
import jp.co.netprotections.service.InputCheckService;

/**
 * 入力チェックサービス実装クラス
 */
@Service
public class InputCheckServiceImpl implements InputCheckService {
	private Logger logger = LoggerFactory.getLogger(InputCheckServiceImpl.class);
	Messages messages = new Messages();

	public boolean isExpectedParameter(MemberJudgeRequestDto candidate) {
		// 名前に不正がないか検証
		if (this.checkName(candidate.getMemberName()) == false) {
			return false;
		}
		// それぞれの能力値が条件を見たいしているか検証
		List<Integer> parameterList = new ArrayList<Integer>();
		parameterList.add(candidate.getCogitation());
		parameterList.add(candidate.getCoodination());
		parameterList.add(candidate.getEventPlanning());
		parameterList.add(candidate.getInfrastructureKnowledge());
		parameterList.add(candidate.getProgrammingAbility());
		for (int eachParam : parameterList) {
			if (this.checkEachAbility(eachParam) == false) {
				return false;
			}
		}
		// 上記の入力値判定にかからなければ。正しい入力値として以下を返却
		return true;
	}

	@Override
	public boolean checkName(String name) {
		try {
			if (name.equals(null) || name.equals("")) {
				return false;
			} else {
				return true;
			}
		} catch (NullPointerException e) {
			logger.error(messages.MESSAGE_NAME_ERROR);
			logger.error(e.getMessage(), e);
			return false;
		}
	}

	@Override
	public boolean checkEachAbility(int eachParamater) {
		if (eachParamater <= 0 || 5 < eachParamater) {
			return false;
		} else {
			return true;
		}
	}
}
