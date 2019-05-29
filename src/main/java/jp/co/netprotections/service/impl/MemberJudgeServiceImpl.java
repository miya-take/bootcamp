package jp.co.netprotections.service.impl;

import jp.co.netprotections.service.MemberJudgeService;

public class MemberJudgeServiceImpl implements MemberJudgeService{

	public boolean JudgeEachAbility(int ablitiyScore) {
		if (ablitiyScore <= 1 ) {
			return false;
		} else {
			return true;
		}
	}

	public boolean JudgeTotalAbility(
			int eventPlanning,
			int cogitation,
			int coodination,
			int programmingAbility,
			int infrastructureKnowledge
			)
	{
		int sumAbility = eventPlanning + cogitation + coodination + programmingAbility + infrastructureKnowledge;
		if (sumAbility <= 10) {
			return false;
		} else {
			return true;
		}
	}
}